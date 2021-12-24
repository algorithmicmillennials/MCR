import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Fithc_class {
	public static void main(String[] args) {
		int op = 0;
		int ch=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("name two files.");
		String First_file = scan.next();
		String Second_file = scan.next();
		File f = new File("C:\\Users\\Duy Dang\\Desktop\\"+First_file+"\\"+Second_file);
		f.mkdirs();
		while(op==0) {
			ch=0;
		System.out.println("Welcome Please Select From the Menu");
		System.out.println("1. Retrieve all files inside main");
		System.out.println("2. Display Secondary Menu for Performing File Operations and Take user input");
		System.out.println("3. Program Termination");
		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:
			//some code
			File ob = new File("C:\\Users\\Duy Dang\\Desktop\\"+First_file+"\\"+Second_file);
			File array[] = ob.listFiles();
			
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
			break;
			
		case 2:
			//some code
			
			
			while (ch==0) {
				System.out.println("Welcome Please Select From the Menu");
				System.out.println("1.Add a Text file to main");
				System.out.println("2.Delete File and Folder from main");
				System.out.println("3.Search for a file");
				System.out.println("4.Return to Previouse menu");
				System.out.println("5.End program");
				Scanner newscan = new Scanner(System.in);
				int Choice_2 = newscan.nextInt();
			
			if(Choice_2==1) {
				//some code
				System.out.println("name your text file");
				String Textfile_name = scan.next();
				File Text_file = new File("C:\\Users\\Duy Dang\\Desktop\\"+First_file+"\\"+Second_file+"\\"+Textfile_name+".txt");
				try {
					Text_file.createNewFile();
					 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			else if(Choice_2 ==2) {
				
				System.out.println("Available File or Folder for Deletion");
				File delete_file = new File("C:\\Users\\Duy Dang\\Desktop\\"+First_file+"\\"+Second_file);
				File array_file[] = delete_file.listFiles();
				for(int i = 0; i <array_file.length;++i) {
					System.out.println(array_file[i]);
				}
				Delete_class obs = new Delete_class();
				obs.m();
				
				//some code
			}
			else if(Choice_2 == 3) {
				
				Sortby_name objsort = new Sortby_name();
				objsort.sortarry(First_file, Second_file);
		
				//some code
				 
				 
			}
			
			
			else if (Choice_2 == 4) {
				System.out.println("update ch in while loop");
				
				ch = 1;
				//some code
			}
			else if (Choice_2 == 5) {
				ch = 1;
				op = 1;
				//some code
				
				
			}
			else {
			
				System.out.println("Invalid choice");
				
							
			}
			//break; this break will take you out the loop after the second run to 1,2,3
			}
			break;///new break to try to encapsulate the case 2 and will break out
		case 3:
			//some code
			System.out.println("Program has end");
			op=1;
			break;
			default:
				System.out.println("invalid choice retry");
			
		}
		}

	}
}
	


