import java.io.File;
import java.util.Scanner;
public class Delete_class {
	void m() {
		
		//System.out.println("Available Files and Folder for deletion");
		System.out.println();
		//System.out.println("Copy and past file directory in this formate");
		//System.out.println("C:\\Users\\Duy Dang\\Desktop\\Duy\\Dang\\last file to delete");
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();
		//System.out.println(c);
		File ob = new File (c);
	   if(ob.exists());
	   {
		   ob.delete();
	   }
	   
	}
	

}
