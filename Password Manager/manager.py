from menu import menu, addAccount, getLogins, getPassword

# Master password login to the password manager will be updated.
master_passwd = "letmein"

print('Please provide master password for Password Manager')
passwd = input()

if passwd == master_passwd:
    print('Welcome')
else:
    print('Wrong password')
    print('Shutdown')
    exit()

# Terminal text loop.
choice = menu()
while choice != 'Q':
    if choice == '1':
        addAccount()
    if choice == '2':
        getLogins()
    if choice == '3':
        getPassword()
    
    choice = menu()

print('Shutdown')
exit()
