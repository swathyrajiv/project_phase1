package file_handling;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
	import java.io.IOException;
	

	public class  FileClass {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int   c;
			System.out.println("Welcome to FMS 1.0");
			
			do {
				System.out.println("press 1 for file insertion");
				System.out.println("press 2 for file deletion ");
				System.out.println("press 3 to view the files");
				System.out.println("press 4 for file searching");
				System.out.println("press 0 to exit the application ");
				System.out.println("press 5 to continue");
				c= scanner.nextInt();
				switch (c) {
				case 1 : System.out.println("enter the name of file to be created");	
				String filename =scanner.next() ;
				filename = filename.concat(".txt");
				System.out.println(filename);
				
				try(FileWriter fw=new FileWriter(filename);
						
						BufferedWriter bw=new BufferedWriter(fw);
						){
					System.out.println("your file created successfully");
					System.out.println("enter the data to be written on file");
					String inputString = scanner. next();
					
					bw.write(inputString);
				
					System.out.println("Messages written to file successfully");
					
				} catch (IOException e) {
					System.out.println(e);
				}
				break;
				case 2 :System.out.println("enter the name of the file to be deleted");
				
				String fn = scanner.next();
				fn = fn.concat(".txt");
				System.out.println(fn);
				
				File myObj = new File(fn); 
				
				if (myObj.delete()) { 
				      System.out.println("Deleted the file: " + myObj.getName());
				
				}
				else{
				
					System.out.println("the file you entered not exist");
				}
				
				
				break;
			
				
				case 3:System.out.println("display the files in ascending order");
						File my_file_dir = new File("/Users/bijithmp/Desktop/phase_1/phase_1_file");
						String pathnames [];

							if (my_file_dir.exists()) 
								{
								
								System.out.println("files"+my_file_dir.getName());
								pathnames = my_file_dir.list();
								Arrays.sort(pathnames);
				   
				   
				   for (String pathname : pathnames) {
					    // Print the names of files and directories
					    System.out.println(pathname);
					}
				  } 
				else
				 {
				   System.out.println("The directory or file does not exist.\n");
				 }
							break;
				case 4:System.out.println("enter the name of file you want to search?");
						String search_key;
						search_key = scanner.next();
						search_key = search_key.concat(".txt");
				File my_file_direc = new File("/Users/bijithmp/Desktop/phase_1/phase_1_file");
				String path_name [];
				
				 
				   if (my_file_direc.exists()) {
					   path_name = my_file_direc.list();
					   List<String> list = Arrays.asList(path_name);
					  
						for (Iterator iterator = list.iterator(); iterator.hasNext();) {
							
							
						
					
					   if(list.contains(search_key)) {
						   System.out.println("file you entered found in the directory");
						   break;
						   
					   }
					   else 
						   System.out.println("file you entered not found in the directory ");
					   		break;
						    
					   }
				   
				   
				   }
				  
				

				   
				case 0:System.out.println("Thank you for using our app!!");
				}
				
				
				
				
			} while(c!=0);
				
			
			
			
			
		}

	}
	