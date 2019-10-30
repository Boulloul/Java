package InputOutput;

import java.io.*;

public class Exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fm=new File("fichierBis.txt");
		File fc=new File("fichier.txt");
		FileOutputStream fou;
		FileInputStream fin;
	    long t=System.currentTimeMillis();
	    
	    try {
	    	//fou=new FileOutputStream(fm);
			fin=new FileInputStream(fc); 
			BufferedInputStream buf1=new BufferedInputStream(fin);
			
            int i;
     	    
            while((i=buf1.read())!=-1){    
                System.out.print((char)i);   
             }
            
            long f=System.currentTimeMillis()-t;
            System.out.print("\ntime :"+f);  
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    
	    
	    
	    
	}

}
