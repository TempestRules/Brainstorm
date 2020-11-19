import random

def createKey():
    return(random.randint(0, 25))

def encrypt(text):
    result = ""
    s = createKey()
    # transverse the plain text
    for i in range(len(text)):
        char = text[i]
        # Encrypt uppercase characters in plain text
      
        if (char.isupper()):
            result += chr((ord(char) + s-65) % 26 + 65)
        # Encrypt lowercase characters in plain text
        else:
            result += chr((ord(char) + s - 97) % 26 + 97)
    arr = [result, s]
    return arr

def decrypt(text, s):
    s = 26 - s
    result = ""
    # transverse the plain text
    for i in range(len(text)):
        char = text[i]
        # Decrypt uppercase characters in plain text
      
        if (char.isupper()):
            result += chr((ord(char) + s-65) % 26 + 65)
        # Decrypt lowercase characters in plain text
        else:
            result += chr((ord(char) + s - 97) % 26 + 97)
    return result
