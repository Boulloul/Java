package InputOutput;

import java.io.*;

public class Exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fm=new File("fichierBis.txt");
		File fc=new File("fichier.txt");
		FileOutputStream fou;
		FileInputStream fin;
	    long t=System.currentTimeMillis();
			
        try {
			fou=new FileOutputStream(fm);
			fin=new FileInputStream(fc); 
			
            byte buff[]=new byte[8];
            int n=fin.read(buff);
     	    
            for(int i=0;i<n;i++) {
            	System.out.print( (char)buff[i]  );
              	fou.write(buff[i]);
            }
          long f=System.currentTimeMillis()-t;
          System.out.print("\n Time :"+f);
           
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
   
	}

}
