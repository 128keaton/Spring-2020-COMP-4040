# question3.py
# kbrleson
# COMP 4040
import sys

correct_username = 'johndoe'
correct_password = 'secret1234'
authenticated = False

def authenticate(username, password):
	return username == correct_username and password == correct_password
	
if sys.version_info < (3, 0):
	sys.stdout.write("Sorry, requires Python 3.x, not Python 2.x\n")
	sys.exit(1)
	
while(not authenticated):
	username = input("Please enter your username: ")
	password =  input("Please enter your password: ")
	result = authenticate(username, password)
	
	if (result == True):
		print('\nYou entered the system successfully.')
	else:
		print('Sorry, your username or password is incorrect. Please try again.\n')
		
	authenticated = result