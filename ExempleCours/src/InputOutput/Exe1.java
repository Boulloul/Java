package InputOutput;
import java.io.*;
public class Exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("C:/");
       
	for(int key=0 ;key<file.length();key++) {
	  if(file.listFiles()[key].exists()) {
			   if(file.listFiles()[key].isDirectory())
			   System.out.print(file.listFiles()[key].getName()+"/"+"    ");
			   else
				System.out.print(file.listFiles()[key].getName()+"   ");
			   //System.out.println("\t");
			   if(key%3==0 && key!=0) {
				System.out.println("\n");
			}
	}else {
		System.out.println("Dossier n existe pas ");
	}
				   
		}
	}

}
