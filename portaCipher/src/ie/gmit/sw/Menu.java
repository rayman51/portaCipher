package ie.gmit.sw;
import java.util.*;
public class Menu {
	
	private static Scanner scanner = new Scanner (System.in);// allows scanner use
	
	public static void mainMenu()
	{
		

		String fileName;// file or url
		String keyword;// keyword used for encryption

		int input = 0;
		System.out.println("===============================");
		System.out.println("|       PORTA CIPHER          |");
		System.out.println("|         PROGRAMME           |");
		System.out.println("|=============================|");
		System.out.println("|     1 : PARSE & ENCRYPT     |");
		System.out.println("|     2 : PARSE & DECRYPT     |");
		System.out.println("|     3 : PARSE ONLY          |");
		System.out.println("|    -1 : EXIT                |");
		System.out.println("===============================\n");

		System.out.println("Please enter your option : ");// prompt user to enter option
		input = scanner.nextInt();
		
		while(input != -1)// keep menu running until user enters -1
		{
		
			//   WarAndPeace-LeoTolstoy.txt
			//   PoblachtNaHEireann.txt
			//   DeBelloGallico.txt
		  
			// menu while loop is N as it is only doing one comparison each time
			// then when an option is picked the notation becomes N^2 + 2 
			// the +2 is dropped so it become N^2, N being the size of the file
			
			switch(input)
			{
			case 1:
				Decrypt.resetCount();// resets count in decrypt class each time option is picked
			
				System.out.println("Enter file name or url you wish to encrypt :");
				System.err.println("Please use example.txt or http://www.example.com ");
				fileName = scanner.next();// takes in filename
				
				System.out.println("Please enter the keyword :");
				keyword = scanner.next();// takes in keyword
				
				double startTime1 = System.currentTimeMillis();// starts timer
				
				Parser.writeToFile(fileName,keyword);// passes filename and keyword to parser class
				
				double endTime1 = System.currentTimeMillis();// stops timer
				System.err.println(" Encryption Took " +(endTime1 - startTime1)/ 1000+ " seconds");// calculates run time of method
				break;
			case 2:
				Decrypt.resetCount();//resets count in decrypt class each time option is picked
				
				System.out.println("Enter file name or url you wish to decrypt :");
				System.err.println("Please use example.txt or http://www.example.com ");
				fileName = scanner.next();// takes in filename
				
				System.out.println("Please enter the keyword :");
				System.err.println("Keyword must be the same keyword used to encrypt ");
				keyword = scanner.next();// takes in keyword
				
				double startTime2 = System.currentTimeMillis();// starts timer
				
				Parser.writeToFile2(fileName,keyword);// passes filename and keyword to parser class
				
				double endTime2 = System.currentTimeMillis();// stops timer
				System.err.println(" Decryption Took " +(endTime2 - startTime2)/ 1000+ " seconds");// calculates run time of method				
				break;
			case 3:
				System.out.println("Enter file name or url you wish to parse :");
				System.err.println("Please use example.txt  ");
				fileName = scanner.next();// takes in filename
				
				double startTime3 = System.currentTimeMillis();// stops timer
				
				Parser.parse(fileName);// passes filename  to parser class
				
				double endTime3 = System.currentTimeMillis();// stops timer
				System.err.println(" Parse Took " +(endTime3 - startTime3)/ 1000+ " seconds");// calculates run time of method	
				break;
			
			case -1:
				System.exit(0);// exits program
				break;
				default:
					System.out.println("Invalid Entry... Please Choose 1,2,3 or -1 to exit "  );
					mainMenu();// calls menu method
			}// switch
			mainMenu();// calls menu method
		}// while
		
	}// menu
	
	

	
}// main
