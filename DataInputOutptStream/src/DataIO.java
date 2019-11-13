import java.io.*;
public class DataIO {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		DataInputStream dis=null;
		DataOutputStream dos = null;
		File fo=new File("fichierBis.txt");
		try {
			bos=new BufferedOutputStream(new FileOutputStream(fo));
			dos=new DataOutputStream(bos);
			dos.writeByte(65);
			bos.close();
			bis=new BufferedInputStream(new FileInputStream(fo));
			dis=new DataInputStream(bis);
			byte b=dis.readByte();
			bos.close();
			System.out.println(b);
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
