import java.util.Scanner;
import java.io.File;
public class Sortby_name {
	void sortarry(String a, String b) {
		Scanner scan = new Scanner(System.in);
		
		File SortFile = new File("C:\\Users\\Duy Dang\\Desktop\\"+a+"\\"+b);
		File arrayb[] = SortFile.listFiles();
		String name = scan.nextLine();
		for(int i = 0; i<arrayb.length;++i) 
		{
			if(arrayb[i].getName().startsWith(name))
			{
				System.out.println(arrayb[i]);
				System.out.println();
			}
		}
	}

}
