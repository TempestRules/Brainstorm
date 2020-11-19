from menu import menu, addAccount, getLogins, getPassword, verifyMaster

print('Please provide master password for Password Manager')
passwd = input()
verifyMaster(passwd)

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
