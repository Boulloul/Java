package InputOutput;
import java.io.*;
public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File f=new File("fichier.txt");
    

         try {
			
			FileInputStream fin=new FileInputStream(f);    
            byte buff[]=new byte[8];
            int n=fin.read(buff);
     	    
            for(int i=0;i<n;i++) {
            	System.out.print( (char)buff[i]  );
            }
            
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
    
     
    

}
}