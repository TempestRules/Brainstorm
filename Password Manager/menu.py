

# Shows a basic menu with options for the user.
def menu():
    print('-'*30);
    print(('-'*13) + 'Menu' + ('-'*13));
    print('1. Add a new login');
    print('2. Show all logins with a specific email');
    print('3. Show password for a specific site or application');
    print('Q. Exit');
    print('-'*30);
    return input(': ');

# Creates a new login and stores it in the database.
def addLogin():
    print('Please provide the name of the site or application');
    appName = input();
    print('Please provide the password for the login: ');
    password = input();
    # hashedPasswd = HASH THE GIVEN PASSWORD

    print('-'*30);
    print('Please provide the email used to create the login');
    email = input();
    

