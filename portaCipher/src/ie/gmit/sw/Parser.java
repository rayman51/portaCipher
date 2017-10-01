package ie.gmit.sw;
import java.io.*;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.net.*;
public class Parser {
	
	public static BufferedReader runParse(String fileName)
	{
		BufferedReader br = null;
		
		try 
		{
			if(fileName.contains("www.") || fileName.contains("http"))// if filename is a url 	         
			{                                                        // uses this buffered reader
				URL url = new URL (fileName);
				br = new BufferedReader (
						new InputStreamReader(
								url.openStream()));
			}// if
			else
			{
				br = new BufferedReader(new FileReader(fileName));// use this when filename is
			}// else                                             // a text file
			
		}// try
		
		catch(IOException e)
		{
			System.out.println("File or url not found");// 
		}// catch
		return br;
	
	}// runParse
	


	public static void writeToFile(String fileName, String keyword)// calls variables from menu 
	{
		BufferedReader br = runParse(fileName);
		int s;
		try 
		{
			BufferedWriter bw = new BufferedWriter(// outputs the encrypted file 
					new FileWriter(               // to a file called output.txt
							"output.txt"));// creates and outputs to a txt file
			
			while ((s = br.read()) != -1)
			{
				char c = Decrypt.runDecrypt(Character.toUpperCase((char)s),keyword);// casting int s to a char
				bw.write(c);// calls the decrypt class and applies the decrypt equation
				// this while loop will have 2 if statement from the decrypt class that will always run 
			}  // that means the loop is N+2, N being the size of the file
			//bw.flush();
			//br.reset();
			br.close();
			bw.close();
			
		}// try
		
		catch(FileNotFoundException e)
		{
			
		}// catch
		catch(IOException e)
		{
			
		}// catch
	}// writeToFile
	
	public static void writeToFile2(String fileName, String keyword)// calls variables from menu
	{
		BufferedReader br = runParse(fileName);
		int s;
		try 
		{
			BufferedWriter bw = new BufferedWriter(// outputs the encrypted file 
					new FileWriter(               // to a file called output2.txt
							"output2.txt"));// creates and outputs to a txt file
			
			while ((s = br.read()) != -1)
			{
				char c = Decrypt.runDecrypt(Character.toUpperCase((char)s),keyword);// casting int s to a char
				bw.write(c);// calls the decrypt class and applies the decrypt equation
				// this while loop will have 2 if statement from the decrypt class that will always run 
			}  // that means the loop is N+2 
			//bw.flush();
			//br.reset();
			br.close();
			bw.close();
			
		}// try
		
		catch(FileNotFoundException e)
		{
			
		}// catch
		catch(IOException e)
		{
			
		}// catch
	}// writeToFile
	
	
	
	public static void parse(String fileName)// calls variables from menu 
	{
		BufferedReader br = runParse(fileName);
		String s;
		try 
		{
			BufferedWriter bw = new BufferedWriter(// parses a file to parseOut.txt
					new FileWriter(                // without using the decrypt class
							"parseOut.txt"));// creates and outputs to a txt file
			
			while ((s = br.readLine())!= null)
			{
				bw.write(s);
				bw.newLine();
			}// while
		
			//br.reset();
			//bw.flush();
			br.close();
			bw.close();	
		}// try
		
		catch(FileNotFoundException e)
		{
			
		}// catch
		catch(IOException e)
		{
			
		}// catch
	}// parse method
	

}// class
