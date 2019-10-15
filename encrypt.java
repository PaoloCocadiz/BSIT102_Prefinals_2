import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Base64;

class encrypt
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		String input = "";
		
		do
		{
			input = scan.nextLine();
			words.add(input);
		}
		while (!input.equals(":q"));
		{
		
			for(String a : words)
			{
				String base64 = Base64.getEncoder() .encodeToString(a.getBytes());
				System.out.println ("Save or cancel?");
				String choose = scan.nextLine();
				
				if(choose.equals("save"))
				{
					FileWriter fw = new FileWriter( base64+".abc");
					System.out.println("Input name:");
					fw.write(scan.nextLine());
					break;
				}	
				else
				{
					System.out.println("bla bla");
				}
			}
			
		
				
		}
		
		
	}
}