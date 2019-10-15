import java.io.File;
import java.io.*;
import java.util.Scanner;


 class decrypt
{
		public static void main(String[]args) throws Exception
		{
			
			System.out.println("Enter the file name :");     //file name
			Scanner pao = new Scanner(System.in);
			
			File filer = new File(pao.nextLine() + ".abc");
			pao = new Scanner(filer);
			
			String lines = pao.nextLine();
			System.out.println(lines);
			
		
			
			
			
		}
}
