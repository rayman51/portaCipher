Porta Cipher Project Ray Mannion g00340315

In order to run this progam user must create a package named gmit.ie.sw
then drop the src file in to the folder and the java files will run

They can also run the jar file by opening the command line, navigating
to the portaCipher file and enter the command java -cp ./porta.jar ie.gmit.sw.Runner
===============================================
===============================================
once the program is ran the user will be presented with a main menu
-----------------------------------------------------------------------
===============================
|       PORTA CIPHER          |
|         PROGRAMME           |
|=============================|
|     1 : PARSE & ENCRYPT     |
|     2 : PARSE & DECRYPT     |
|     3 : PARSE ONLY          |
|    -1 : EXIT                |
===============================

Please enter your option : 
------------------------------------------------------------------------------
if the user picks option 1, the program then asks the user to  enter a file name
or a URL, once they enter this the program asks the user to enter a keyword
--------------------------------------------------------------------------------
Please use example.txt or http://www.example.com 
Enter file name or url you wish to encrypt :

Please enter the keyword :
-------------------------------------------------------------------------------
after the user enters the keyword and presses enter the program parses in the file or url 
and applies the keyword to the file and checks the tableau for the corresponding encrypted letter.
it then output the encrypted file to a created file called output.txt.
the time it took to encrypt the file is then printed to the console
-------------------------------------------------------------------------------
Encryption Took 0.299 seconds
-------------------------------------------------------------------------------
the user may then pick 2 in the menu, they will be given a similar prompt as before
------------------------------------------------------------------------------
Please use example.txt or http://www.example.com 
Enter file name or url you wish to decrypt :

Please enter the keyword :
----------------------------------------------------------------------------------
this time the user can enter the file name output.txt and the same keyword they used for encryption
this will then decryption the file they just encrypted and output it to a new file called output2.txt
the decryption time will then be printed to the console
------------------------------------------------------------------------------------------
Decryption Took 0.259 seconds
-------------------------------------------------------------------------------------------
the third option is a simple parse method, this method just takes in a file or url and parses it to a file called 
outParse.txt
finally the user can enter -1 and this will exit the program