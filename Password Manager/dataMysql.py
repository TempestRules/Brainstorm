import mysql.connector

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

        accountQuery = "INSERT INTO accounts (username, passwd, email, appName, url_address) VALUES (%s, %s, %s, %s, %s)"
        values = (username, password, email, appName, url)

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
    
        passwdQuery = "SELECT passwd FROM accounts WHERE appName =%s"
        val = (appName, )

        cursor.execute(passwdQuery, val)
        result = cursor.fetchone()

        db.close()

        print("Your password is: ", result[0])

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
            for i in range(0, len(row)-1):
                print(info[i] + row[i])
            print('--------------------------------------')
        print('')
        print('-'*30)
    except Exception as e:
        print('Error: ', e)
