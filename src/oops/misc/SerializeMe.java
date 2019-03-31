package oops.misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializeMe implements Serializable {

	
/**
	 * 
	 */
	private static final long serialVersionUID = 3549520717023702868L;
/**
	 * 
	 */
//	private static final long serialVersionUID = 8839375025439869020L;
/**
	 * 
	 */
//	private static final long serialVersionUID = 3549520717023702868L;
	//	private static final long serialVersionUID = 1L;
	int roll = 10;
	String name = "Rajesh";
//	String tes = "bajya";

	public SerializeMe() {
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		SerializeMe sm = new SerializeMe();
//		OutputStream out = new FileOutputStream("C:\\Users\\rbajya.ORADEV\\Desktop\\SQLs\\test.txt");
//		ObjectOutputStream oo = new ObjectOutputStream(out);
//		oo.writeObject(sm);

		InputStream in = new FileInputStream("C:\\Users\\rbajya.ORADEV\\Desktop\\SQLs\\test.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		SerializeMe cs = (SerializeMe)ois.readObject();
		System.out.println(cs.name);
	}

}
