import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Mahtab
 *
 */
public class Arr_Class implements Serializable{

	ArrayList<String> userName;
	ArrayList<String> passWord;
	//ArrayList<String> note;
	//ArrayList<Class_B> gh;

	public Arr_Class() {
		userName = new ArrayList<String>();
		passWord = new ArrayList<String>();
//		 = new ArrayList<String>();
//       gh = new ArrayList<Class_B>();
	}

	public void setUsername(ArrayList username1) {
		userName = username1;

	}

	public ArrayList getUsername() {

		return userName;

	}

	public void setPassword(ArrayList password1) {
		passWord = password1;

	}

	public ArrayList getPassword() {
		return passWord;

	}

//	public void setNote(ArrayList note1) {
//		note = note1;
//
//	}
//
//	public ArrayList getnote() {
//
//		return note;
//
//	}

}
