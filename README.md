# UserInputATM
The package functions as an account management system for users that want to access their checking or savings account. Users are prompted to enter their correct account number and pin number. If they do not, an error message will ask them to enter the correct information. After entering the correct information, users can choose which account type they want to access, or exit the system. If they choose an account, they will be asked if they want to view their balance, withdraw funds, deposit funds or exit.

The file ATM.java starts the process, in which it extends to ATMOptions.java which is the interface that prompts the user using several public void objects for each prompt (username and password, selecting account type, and checking the account).
The file ATMAccount creates getters, setters using objects that will output a reponse from the system based on the user's input. This file checks the data to see if it matches with the user's input, and blocks access with an error message if the information is incorrect, or if the user presses a number that is not on the screen.
