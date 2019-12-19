import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
public class fichi {

	public static void main(String[] args) {
		FileInputStream fis;
		  FileOutputStream fos;
		  BufferedInputStream bis;
		  FileChannel fc,fco;
		  try {
			  fis = new FileInputStream(new File("fichier.txt"));
			  fos = new FileOutputStream(new File("fichier2.txt"));
			  fc = fis.getChannel();
			  fco= fos.getChannel();
		
			  int size = (int)fc.size();
			  ByteBuffer buf = ByteBuffer.allocate(size);
			  fc.read(buf);
			  //buf.flip();
			  
			  fco.write(buf);
			  byte[] tabByte = buf.array();
			  for(byte b : tabByte)System.out.print((char)b);
			  
			  
		  } catch (FileNotFoundException e) {e.printStackTrace();}
		  catch (IOException e) {e.printStackTrace();}

	}

}
