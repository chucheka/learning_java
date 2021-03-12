package file.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSystem {

	public static void main(String[] args) throws IOException {
		
	/*	File file = new File("newTxt.txt");
		
		try {
			boolean isCreated = file.createNewFile();
			
			
			if(isCreated) {
				System.out.println("New File is created");
			}
			else {
				System.out.println("New File is not created created");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		char[] array = new char[100];
	    try {
	      // Creates a reader using the FileReader
	      FileReader input = new FileReader("newTxt.txt");

	      // Reads characters
	      input.read(array);
	      System.out.println("Data in the file:");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    
	    String data = "I am software developer with 3 years experience building enterprise applications";
	    
	    try {
	    	
	    	
	    	FileWriter output = new FileWriter("newTxt.txt");
	    	
	    	output.write(data);
	    	
	    	 System.out.println("Data is written to the file.");

	         // Closes the writer
	         output.close();
	    	
	    }catch(Exception ex) {
	    	
	    }
		
	  /*  // creates a file object
	    File file = new File("file.txt");

	    // deletes the file
	    boolean value = file.delete();
	    if(value) {
	      System.out.println("The File is deleted.");
	    }
	    else {
	      System.out.println("The File is not deleted.");
	    }
	    
	    */
	}

}
