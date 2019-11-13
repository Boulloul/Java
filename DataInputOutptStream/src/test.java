import java.io.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		File fo=new File("fichierBis.txt");
		FileInputStream fis;
		FileOutputStream fos;
		
		ObjectInputStream ois;
		ObjectOutputStream oos;
		try {
			fis=new FileInputStream(fo);
			fos=new FileOutputStream(fo);
			
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			
			oos= new ObjectOutputStream(bos);
			ois= new ObjectInputStream(bis);
			
			
			oos.writeObject(new Game("game1","game1",102.5d));
			oos.writeObject(new Game("game2","game2",201.5d));
			oos.close();
			
			
			
			
			
		}catch(Exception e) {
		
		}

	}

}
