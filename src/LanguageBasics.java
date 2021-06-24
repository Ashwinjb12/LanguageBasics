import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import com.ashwin.User;

public class LanguageBasics {

	public LanguageBasics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// primitive data type declaration
		byte b = 127;
		short s = 2324;
		int i = 122141242;
		long l = 1212512434;
		float f = 24.35f;
		double d = 23234.33223523;
		String str = "some string within quotes";
		char c = 'A';
		byte byteArray[] = new byte[10];
		byteArray[0] = 0;
		byteArray[1] = 1;
		byteArray[2] = 13;
		byteArray[3] = 127;
		byteArray[4] = 3;
		byteArray[5] = 4;
		byteArray[6] = 2;
		byteArray[7] = 5;
		byteArray[8] = 12;
		byteArray[9] = 14;

		// String array example

		String stringArray[] = new String[10];

		char charArray[] = str.toCharArray();
		int charArrayLength = charArray.length;

		// Runtime arguments from command line
		String fName = args[0];
		String sName = args[1];
		int age = Integer.parseInt(args[2]);

		// Class and instance creation using objects
		User userOne = new User(fName, sName, age);
		// static variable
		String company = User.getCompany();
		System.out.println(userOne.getAge());
		System.out.println(userOne.getFirstName());
		System.out.println(userOne.getSurName());

		User userTwo = new User("Shanth", "Shanmugham", 45);
//		User userOne = new User("Ashwin", "Bharathi", 20);
//		userOne.setFirstName("Ashwin");
//		userOne.setSurName("Bharathi");
//		userOne.setAge(20);

//		for(int j =0; j < 1000; j++) {
//			System.out.println("Random Numbers " + Math.random());
//		}
//		
		// create a list and use of generics list
		ArrayList<User> list = new ArrayList<User>();
		// ArrayList list = new ArrayList();
		// add objects to it in loop.
		for (int j = 0; j < 1000; j++) {
			User users = new User("Shanth" + j, "Shanmugham" + j, ((int) Math.random() * 100));
			list.add(users);
		}
		// add two more objects to it
		list.add(userOne);
		list.add(userTwo);

		// now iterate through the list to get all the object of Users in the list
		for (int j = 0; j < list.size(); j++) {
			User u = (User) list.get(j);
			System.out.println("Name of the " + j + "th Person " + u.getFirstName());
		}

		int listLength = list.size();
		while (listLength > 0) {
			User u = (User) list.get(listLength - 1);
			System.out.println("Name of the " + (listLength - 1) + "th Person " + u.getFirstName());
			listLength--;
		}

		// if we use Vector data type 
		
		Vector<User> vector = new Vector<User>();
		for (int j = 0; j < 1000; j++) {
			User users = new User("Shanth" + j, "Shanmugham" + j, ((int) Math.random() * 100));
			vector.add(users);
		}
	
		// if we use HashMap
		
		HashMap<String, User> hashMap = new HashMap<String,User>();
		for(int j= 0; j < list.size();j++) {
			User u = (User) list.get(j);
			hashMap.put(u.getFirstName(), u);
		}
		
		// to iterate a HashMap use this technique
		Iterator<String> iterator = hashMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Key in the HashMap " + iterator.next().toString());
		}
		
		//System.out.println(hashMap.get("Shanth2"));
		
		// file handling examples
		// you can read from a file

		long startTime = System.currentTimeMillis();
		try {

			for (int ashwin = 0; ashwin < 100000; ashwin++) {
				// create file input stream
				FileInputStream fin = new FileInputStream(new File("D:/example/file1.txt"));
				// create a byte array for the file contents
				byte fileContentArray[] = new byte[fin.available()];
				// read the file
				fin.read(fileContentArray);
				// close the file
				fin.close();
				//System.out.println("Printing the file content " + ashwin +" times"  + new String(fileContentArray));
			}

			System.out.println("It took FileInputStream " + (System.currentTimeMillis() - startTime)/1000);
			
			startTime = System.currentTimeMillis();
			
			for (int ashwin = 0; ashwin < 100000; ashwin++) {
				// create file input stream
				FileInputStream fin = new FileInputStream(new File("D:/example/file1.txt"));
				// create a byte array for the file contents
				BufferedInputStream bin = new BufferedInputStream(fin);

				byte fileContentArray[] = new byte[fin.available()];
				// read the file
				bin.read(fileContentArray);
				// close the file
				bin.close();
				//System.out.println("Printing the file content " + ashwin +" times"  + new String(fileContentArray));
			}
		
			
			System.out.println("It took BufferedInputStream " + (System.currentTimeMillis() - startTime)/1000);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("I caught the problem and saved the program from a crash...");
		}
		// you can write into a file.

		System.out.println("Program completed...");

	}

}
