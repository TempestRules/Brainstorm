import mysql.connector
from encryption import encrypt, decrypt

def connection():
    mydb = mysql.connector.connect(
        host="localhost",
        user="root",
        password="secure",
        database="Users",
        port=3306
    )
    return mydb

# Storing given information in database.
def storeAccount(username, password, email, appName, url):
    try:
        db = connection()
        cursor = db.cursor()

        encryption = encrypt(password)

        accountQuery = "INSERT INTO accounts (username, passwd, email, appName, url_address, enckey) VALUES (%s, %s, %s, %s, %s, %s)"
        values = (username, encryption[0], email, appName, url, encryption[1])

        cursor.execute(accountQuery, values)
        db.commit()
        db.close()
    except Exception as e:
        print('Error: ', e)

# Retrieves password based on application name.
def getPasswd(appName):
    try:
        db = connection()
        cursor = db.cursor()
    
        passwdQuery = "SELECT passwd, enckey FROM accounts WHERE appName =%s"
        val = (appName, )

        cursor.execute(passwdQuery, val)
        result = cursor.fetchone()

        db.close()

        decryption = decrypt(result[0], result[1])

        print("Your password is: ", decryption)

    except Exception as e:
        print('Error: ', e)
    
# Retrives all accounts created with given email.
def getAccounts(email):
    info = ('Username: ', 'Password: ', 'Email: ', 'App/Site: ', 'Url: ')

    try:
        db = connection()
        cursor = db.cursor()

        accountQuery = "SELECT * FROM accounts WHERE email =%s"
        val = (email, )
    
        cursor.execute(accountQuery, val)
        result = cursor.fetchall()

        db.close()

        print('')
        print('Accounts: ')
        print('')
        for row in result:
            for i in range(0, 5):
                if i == 1:
                    decryption = decrypt(row[1], row[5])
                    print(info[i] + decryption)
                else:
                    print(info[i] + row[i])

            print('--------------------------------------')
        print('')
        print('-'*30)
    except Exception as e:
        print('Error: ', e)

def checkMaster(master):
    valid = False

    try:
        db = connection()
        cursor = db.cursor()
    
        masterQuery = "SELECT passwd, enckey FROM accounts WHERE username ='master'"

        cursor.execute(masterQuery)
        result = cursor.fetchone()

        db.close()

        decryption = decrypt(result[0], result[1])

        if master == decryption:
            valid = True
        return valid

    except Exception as e:
        print('Error: ', e)
        