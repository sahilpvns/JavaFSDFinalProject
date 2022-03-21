package lockedMeProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe

{
	static final String projectFilesPath="D:\\LockedMeProject\\LockedMeFinalProject\\src\\lockedMeProject";
	
	public static void displayMenu()
	{
		System.out.println("*****************************************");
		System.out.println("\tWelcome to LockedMe.com secure app");
		System.out.println("\tDeveloped by : Sahil Prajapati");
		System.out.println("************************************");
		System.out.println("\t1.Display all name file");
		System.out.println("\t2.Add a new file");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search file");
		System.out.println("\t5.Exit");
		System.out.println("*****************************************");
	}
	
	//This method will retrieve all the file
	public static void getAllFiles() 
	{
		File folder = new File(projectFilesPath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
		System.out.println("File List is Below\n");
		for (var l:listofFiles)
		{
			System.out.println(l.getName());
		}
		
	   }
		else 
		{
			System.out.println("The folder is empty");
		}
	}
	
	//This method will read file details from user create file
	public static void createFiles()
	{
		
	 try 
	  {
		 //Variable declaration
		Scanner obj = new Scanner(System.in);
		String fileName;
		
		//Read file name from user
		System.out.println("Enter file name");
		fileName = obj.nextLine();
		
		int lineCount;
		System.out.println("Enter how many lines in the file");
		lineCount=Integer.parseInt(obj.nextLine());
		
		FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName+".txt");
		
		//Read line by line from user
		for(int i=1;i<=lineCount;i++)
		{
			System.out.println("Enter file line");
			fw.write(obj.nextLine()+"\n");
		}
		
		System.out.println("File Created Successfully");
		fw.close();
	  }
	     catch(Exception Ex)
	     {
	     	 System.out.println(Ex);
	     }
	 
	}
	
	//This method will take file name as parameters and check if 
	//it is present in the project folder or not.
	public static boolean checkFileExists(String fileName)
	{
		//Get all file name into a list
		ArrayList<String> allFilesName = new ArrayList<String>();
		File folder = new File(projectFilesPath);
        File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
		System.out.println("File List is Below\n");
		for (var l:listofFiles)
		{
			allFilesName.add(l.getName());
		}
		
	   }
		
		return allFilesName.contains(fileName);
		
		
	}
	
	public static void deleteFiles()
	{
		try {
			
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter file name to be deleted");
		fileName = obj.nextLine();
		File f = new File(projectFilesPath+"\\"+fileName);
			
		if (checkFileExists(fileName))
		{
			f.delete();
			System.out.println("File deleted Successfully");
		}
		else
		{
			System.out.println("File doesnot exist");
		}
	}
		catch(Exception Ex)
		{
			System.out.println("Unable to delete file. Please contact : admin@123.com");
		}
	}

	public static void serchFiles()
	{
		try {
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name to be searched");
		fileName=obj.nextLine();
		
		
		if(checkFileExists(fileName))
		{
			System.out.println("File is available");
		}
		else
		{
			System.out.println("File is not available");
		}

		
		}
		catch(Exception Ex)
		{
			
		}
		}
	}
	

