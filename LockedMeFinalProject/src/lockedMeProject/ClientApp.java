package lockedMeProject;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int ch;
		
		do 
		{
			LockedMe.displayMenu();
			System.out.println("Enter your choise");
			ch=Integer.parseInt(obj.nextLine());
			
		 switch(ch)
			{
			case 1:LockedMe.getAllFiles();
			      break;
			case 2:LockedMe.createFiles();;
			      break;
			case 3:LockedMe.deleteFiles();
		       	  break;
			case 4:LockedMe.serchFiles();
			      break;
			case 5:System.exit(0);
			      break;
			default:System.out.println("Invailid option");
			      break;
			
		    }
			
		}
		while(ch>0);
		obj.next();
		obj.close();
	
	}

}
