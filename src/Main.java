

import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		/* There are no changes necessary in the main method */

        // An object of type File is created. 
     	// It holds a reference onto the file secretCode.txt, 
		// which resides directly in our exercise folder.
		File file = new File("secretCode.txt");
    	
	    	// In case the passed file does not exist, the program terminates here with
		    // a suited output message.
	    	if (!file.exists()) {
	    		System.out.println("The specified file does not exist.");
	    		return;
	    	}
	    	
	    	// The file is now decoded and printed out afterwards. 
	    	Decoder fileDecoder = new Decoder();
	    	System.out.print(fileDecoder.decodeFile(file));
    }
}
