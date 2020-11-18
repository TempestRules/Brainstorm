import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="secure",
    datebase="users"
)

# Storing given information in database.
def storeAccount(username, passwd, email, appName, url):
    mycursor = mydb.cursor()

    accountQuery = "INSERT INTO accounts (username, password, email, appName, url_address) VALUES (%s, %s, %s, %s, %s)"
    values = (username, passwd, email, appName, url)

    mycursor.execute(accountQuery, values)
    mydb.commit()

# Retrieves password based on application name.
def getPasswd(appName):
    try:
        mycursor = mydb.cursor()
        passwdQuery = "SELECT password FROM accounts WHERE appName LIKE '%s'"
    
        mycursor.execute(passwdQuery, appName)
        myresult = mycursor.fetchall()

        print("Your password is: ")
        print(myresult[0])
    
    except mysql.connector.Error as err:
        print("Something went wrong: {}".format(err))

# Retrives all accounts created with given email.
def getAccounts(email):
    info = ('Username: ', 'Password: ', 'Email: ', 'App/Site: ', 'Url: ')

    try:
        mycursor = mydb.cursor()
        accountQuery = "SELECT * FROM accounts WHERE email LIKE '%s'"
    
        mycursor.execute(accountQuery, email)
        myresult = mycursor.fetchall()

        print('')
        print('Accounts: ')
        print('')
        for row in myresult:
            for i in range(0, len(row)-1):
                print(info[i] + row[i])
        print('')
        print('-'*30)
    except mysql.connector.Error as err:
        print("Something went wrong: {}".format(err))
