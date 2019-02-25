import java.util.Scanner;

import java.io.*;

public class FileEqnReader {
	 
    
    public static void main(String[] args) {

	    FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("buff.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	
	    String strLine;
	    int line=1;
	    //Read File Line By Line
	    try {
			while ((strLine = br.readLine()) != null)   {
			  // Print the content on the console
				
				
				
			//  System.out.println (line+"  "+strLine);
			  
			  if(line>3&&line <7) {
				  EquationValidationChecker.equation(strLine);
				  
			  }else if(line>7&&line<11) {
				  
			  }else if(line >11 && line <17) {
				  
			  }else {
				  
			  }
			  
			  line++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	    //Close the input stream
	    try {
			fstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

