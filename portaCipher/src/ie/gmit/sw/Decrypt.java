package ie.gmit.sw;

public class Decrypt {
	
	private static int count =0;
	private static int column =0;
	private static int row =0;
	private static int reset =0;
	
	public static char runDecrypt(char c,String keyword)// calls from parse class
	{
		keyword = keyword.toUpperCase();// sets keyword to upper case
		
		int unicode = ((int)c)-64;// starts at upper case A in the ASCII table
		
		row = (((int)keyword.charAt(count % keyword.length())- 65) /2 )-1;// runs the keyword along
		                                                                 // the top of each letter
																		//in the text file
			if (unicode>= 14 && unicode<=26)                           //and search the tableau
			{                                                         //for the encrypted letter
				row = ((unicode - column) + 1) % 13;
				
				if(row == 0)             
			// this is the +2 for the notation if these if's aren't triggered it calls the if's below
				{
					row = 13;
				}
				 c = Cipher.tableau[0][row].charAt(0);// applies char to the tableau
				
				
			}
			else if (unicode>= 1 && unicode<=13)
			{
				row = ((unicode + column) - 1) % 13 + 13;
				
				if(row == 13)          
				{
					row = 26;
				}
				
				 c = Cipher.tableau[0][row].charAt(0);// applies char to the tableau
				
			}
		 
			count++;// adds to count
	
		return c;
		
	}// runDecrypt
	
	public static void resetCount()
	{
		count = reset;// resets the count back to zero
	}// resetCount
	
	
	

}// Decrypt
