from dataMysql import storeAccount, getAccounts, getPasswd, checkMaster

# Shows a basic menu with options for the user.
def menu():
    print('-'*30)
    print(('-'*13) + 'Menu' + ('-'*13))
    print('1. Add a new login')
    print('2. Show all logins with a specific email')
    print('3. Show password for a specific site or application')
    print('Q. Exit')
    print('-'*30)
    return input(': ')

# Creates a new login and stores it in the database.
def addAccount():
    print('Please provide the name of the site or application')
    appName = input()
    print('Please provide the password for the account (No spaces, numbers, or special characters): ')
    password = input()
    print('-'*30)
    print('Please provide the email used to create the account')
    email = input()
    print('Please provide the username for the account')
    username = input()
    print('Please provide the url to the site the account is created with')
    url = input()
    # Database function, stores given info.
    storeAccount(username, password, email, appName, url)

# Returns the password based on the site the account belongs to.
def getPassword():
    print('Please provide the name of the site or application the account belongs to')
    appName = input()
    # Database function, returns password based on application.
    getPasswd(appName)

# Returns all accounts connected to a specific email.
def getLogins():
    print('Please provide the email you wish to see accounts for')
    email = input()
    # Database function, returns accounts based on email.
    getAccounts(email)

# Verifies master password.
def verifyMaster(master):
    if checkMaster(master) == False:
        print('Wrong master')
        print('Shutdown')
        exit()
    else:
        print('Welcome')
    