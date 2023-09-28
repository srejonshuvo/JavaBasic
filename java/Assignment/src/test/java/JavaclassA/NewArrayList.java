package JavaclassA;

import java.util.ArrayList;

public class NewArrayList {

	public static void main(String[] args) {

		ArrayList <String> studentname = new ArrayList<String>();
		studentname.add("Shuvo");
		studentname.add("Sagor");
		studentname.add("Joy");
		studentname.add("Antu");
		studentname.add("Rontu");
		
		System.out.println(studentname);
		
		for(int i = 0; i<studentname.size(); i++) {
			System.out.println(studentname.get(i));
			
		}
	
		
	}

}
