/*
 * Created by Anil Shivakoti
 * Student Number	: 	2014382
 * College			:	CCT
 */
/**
 *
 * @author Shivakoti Anil
 * JAVA files are created by using Code Runner(Version 2.0.1) for MAC Book (Apple)
 * All the references are listed at buttom of the codes, some of the codes are taken from websites as reference but not used copy paste.
 * This codes need another class file [Subfile(GetterSetter.java)] to run successfully,  where its getter and setter are created.
 * When This programm is runned mannually or compiled it automatically creates a Folder named as Data, This folder is created to save the details of Student as Stdent.txt.
* Student.txt file is saved on Data Folder.
* if there is no any "Student.txt" file in Data Folder then it says "Sorry !!! Student Record could not be able to load from TXT File...!!!" 
but if any entry will made using [A] - To Add a New Student after completing the process Data Folder with Student.txt file will be created automatically

 */

// Imports the Scanner
import java.util.Scanner;

// Imports all the classes needed to read & write a File
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

// Import Java Exception
import java.io.FileNotFoundException;
import java.io.IOException;

// Import the ArrayList class
import java.util.ArrayList;


public class studentDatabase {
	
// Defining ArrayList
private static final ArrayList<GetterSetter> details = new ArrayList<GetterSetter>();
public static void main(String[] args){
		
// declaring scanner name as "typeWord"
	Scanner typeWord = new Scanner(System.in);
		
// instructing with try and cath method to load file from TXT format
	System.out.println("::: Welcome to My Projetcs For Recording Student Details using JAVA :::");
	System.out.println("--- This is MY Assignment for the Educational Purpose ---");
	System.out.println("          --------------------------------------------");
	System.out.println("          *                      _  _                *");
	System.out.println("          *                  (|(.)(.)|)              *");
	System.out.println("          *         ----.OOOo--()--oOOO.-----        *");
	System.out.println("          *                ANIL SHIVAKOTI            *");
	System.out.println("          *            cvakotianil@gmail.com         *");
	System.out.println("          *            PH - +353 - 879148859         *");
	System.out.println("          *------------------------------------------*");
	System.out.println();
	
	
	// creating a new Folder named as Data
	File create = new File("Data");
	create.mkdir();
	
	try {  
		// getting Details from "Student.TXT" File
		details.addAll( textRead("Data/Student.txt") );
	} catch (FileNotFoundException error) {
			
// Displaying messgae if Student.txt file is not exist
		System.out.println("------------------------------------------------------------------");
		System.out.println("Sorry!!! Student Record could not be able to load from TXT File...!!!");
		System.out.println("------------------------------------------------------------------");
		System.out.println();
	}
		
// Declaring to hit "ENTER" button to go to main programm
	System.out.print("          Press the [ ENTER ] key to continue ");
	
	// moving to next line
	typeWord.nextLine();
	System.out.println();
	System.out.println("********************************************************************");
	System.out.println("Please Follow the Instruction given below to manage Student Record");
	System.out.println("********************************************************************");
	System.out.println();
	
	String options;		// new String name as options
	do {
		// MENU DISPLAY
		System.out.println("-> [A] - To Add a New Student");
		System.out.println("-> [S] - To Search Student");
		System.out.println("-> [D] - To Display Student Detail");
		System.out.println("-> [M] - To Modify Student Detail");
		System.out.println("-> [X] - To Delete Student");
		System.out.println("-> [E] - Let's Exit");
		System.out.println("");
		System.out.print("Enter Your Keywords(Dont Worry!!! No Case Sensetive): ");
		options = typeWord.nextLine();
		
		// for ignoring Upper and Lower case I put 2 case
		switch (options) {
			// case a links to add a new student
			case "a":
			case "A":
				System.out.println();
				GetterSetter addStudent = newStudent(typeWord);
				details.add(addStudent);
				System.out.println();
				// to save all the input catched from add student section
				try {
					textSave("Data/Student.txt", details);
				} 
				catch (IOException error) {
				}
				break;
			
			// case s links to search a new student
			case "s":
			case "S":
				System.out.print("-> Follow the instruction to search Student's Details: ");
				System.out.println("\n\n-> [N] - Search Student by Number");
				System.out.println("-> [F] - Search Student by First Name ");
				System.out.println("-> [L] - Search Student by Last Name ");
				System.out.print("\nEnter your choice: ");
				options = typeWord.next(); {
					switch (options) {
						case "n":
						case "N":
							System.out.print("Type Student Number: ");
							typeWord.nextLine();
							searchRecordbyNumber(typeWord);	
						break;
						case "f":
						case "F":
							System.out.print("Type Student First Name: ");
							typeWord.nextLine();
							searchRecordByFirstName(typeWord);
						break;

						case "l":
						case "L":
							System.out.print("Type Student Last Name: ");
							typeWord.nextLine();
							searchRecordByLastName(typeWord);

						break;

						default:
							break;
					}
			}
						
			
				break;
			// case d links to details of student
			case "d":
			case "D": 
				displayStudentDetails(typeWord);
		break;
			
			// case m links to modify a new student		
			case "m":
			case "M": 
				changeStudentDetails(typeWord);
				break;					
					
			// case x links to delete a student
			case "x":
			case "X": 
				removeStudentDetails(typeWord);
				break;
			
			// case x is for to exit the program		
			case "e":
			case "E":
				System.out.println("\n=> Thank You 4 Using My Java Program ;) <=");
				return;
	
			default:
				// Alert Message
				System.out.println("\n=> Opppsss!!! seems pressed wrong Key. See the Menu again & Type the Key, Good Luck. <=\n");
		}
	} while (true);
}
	


	
	// ADD NEW STUDENTS---------------------------------------------

	// Defining Private Static method for adding new student with Scanner typeWord
	private static GetterSetter newStudent(Scanner typeWord){	
		// option to input student number or ID
		System.out.print("Student Number OR ID: ");
		String student_number = typeWord.nextLine();
		// gets student name from GetterSetter class
		GetterSetter addStudent = new GetterSetter(student_number);

		// Options to input student first name, last name, email address and mobile number and and sets the data
		System.out.print("First Name: ");
		addStudent.setFirstName(typeWord.nextLine());
		System.out.print("Last Name: ");
		addStudent.setLastName(typeWord.nextLine());
		System.out.print("Email Address: ");
		addStudent.setEmailAddress(typeWord.nextLine());
		System.out.print("Mobile Number: ");
		addStudent.setMobileNumber(typeWord.nextLine());
		{
			// prompt that input is save on txt file
			System.out.print("\nYour File is Saved in Data Folder[Data/Student.txt] with Student.txt file ;)\n");
		}
		// returning back to main
		return addStudent;
	}

	//------------------------------------------------------------------------------

	// SEARCH STUDENT BY NUMBER --------------------------------------------------
	
	//// Defining Private Static method to search by number with Scanner typeWord
	private static void searchRecordbyNumber(Scanner typeWord) {
		String condition = typeWord.nextLine();
		
		// creating new boolean to search
		boolean searchItem = false;
		
		// creating for loop to search
		for (GetterSetter studentNumber : details) {
			if (studentNumber.getStudentNumber().equalsIgnoreCase(condition)) {
				System.out.print("\nHere are the Details according to your Search: \n" + studentNumber);
				searchItem = true;
			}
		}
		if(!searchItem){
			System.out.println("\nAlert: Details you search could not be Found.\n");
			}	
	}
	//------------------------------------------------------------------------------

	// SEARCH BY FIRST NAME------------------------------------------------
	//// Defining Private Static method to search by first name with Scanner typeWord
	private static void searchRecordByFirstName(Scanner typeWord) {
		String condition = typeWord.nextLine();
		
		// creating new boolean to search
		boolean searchItem = false;
		
		// creating for loop to search
		for (GetterSetter firstName : details) {
			if (firstName.getFirstName().equalsIgnoreCase(condition)) {
				System.out.print("\nHere are the Details according to your Search: \n" + firstName);
				searchItem = true;
			}
		}

		if(!searchItem){
			System.out.println("Alert: Details you search could not be Found.\n");
		}	
	}

	//------------------------------------------------------------------------------

	// SEARCH BY LAST NAME-------------------------------------------------------
	
	//// Defining Private Static method to search by last name with Scanner typeWord
	private static void searchRecordByLastName(Scanner typeWord) {
		String condition = typeWord.nextLine();
		// creating new boolean to search
		boolean searchItem = false;
		// creating for loop to search
		for (GetterSetter lastName : details) {
			if (lastName.getLastName().equalsIgnoreCase(condition)) {
			    System.out.print("\nHere are the Details according to your Search: \n" + lastName);							searchItem = true;
			}
		}
		if(!searchItem){
			System.out.println("Alert: Details you search could not be Found.\n");
		}	
	}	


		// -------------------------------------------------------------	
		
		// to get the student details by number for to display the dtudent details, to modify the student and to delete a student by number
		private static int getStudentByNumber(String studentNumber){
			int sNumber = 0;
			for(int search = 1; search < details.size(); search++){
				if(details.get(search).getStudentNumber().equalsIgnoreCase(studentNumber)){
					sNumber = search;
					break;
				}
			}
			return sNumber;
		}
		
	//------------------------------------------------------------------------------

	// DISPLAY DETAILS OF STUDENT------------------------------------------
	
	//// Defining Private Static method to display student details by number with Scanner typeWord
	private static void displayStudentDetails(Scanner typeWord){
		System.out.print("\nEnter Student Number To Display the details: ");
		String student_number = typeWord.nextLine();		
		int sNumber = getStudentByNumber(student_number);
		if(sNumber > 0){
			// getting the details of student by number from array
			GetterSetter student = details.get(sNumber);
			System.out.print("\n=> Details Of The Student:");
			System.out.println(student);
		}
		else {
			System.out.println("\nAlert: There is no any record of this Student Number\n");
		}
	}

	//------------------------------------------------------------------------------

	// MODIFY STUDENT DETAILS---------------------------------------------------

	//// Defining Private Static method to change the student details with Scanner typeWord
	private static void changeStudentDetails(Scanner typeWord){
		System.out.print("Enter Student Number to modify Saved Details: ");
		String student_number = typeWord.nextLine();
		int sNumber = getStudentByNumber(student_number);
		if(sNumber > 0){
			// modifying the details from first name to mobile number from array
			GetterSetter modify = details.get(sNumber);
			System.out.print("First Name: ");
			modify.setFirstName(typeWord.nextLine());
			System.out.print("Last name: ");
			modify.setLastName(typeWord.nextLine());
			System.out.print("Email Address: ");
			modify.setEmailAddress(typeWord.nextLine());
			System.out.print("Mobile Number: ");
			modify.setMobileNumber(typeWord.nextLine());
			details.set(sNumber, modify);
			
			// // saving the user modified input instruction
			try {
				textSave("Data/Student.txt", details);
			} 
			catch (IOException error) {	
			}
			System.out.println("\nCheers!!! Your new records has been modified and saved\n");
		}
		else {
			System.out.println("Alert: SORRY!!! NO ANY RECORD HAS BEEN FOUND");
		}
	}

	//------------------------------------------------------------------------------

	// DELETE STUDENT DETAILS---------------------------------------------------
	
	//// Defining Private Static method to delete student with Scanner typeWord
	private static void removeStudentDetails(Scanner typeWord){
		System.out.print("Enter Student Number To Delete Record From database: ");
		String student_number = typeWord.next();
		int deleteNumber = getStudentByNumber(student_number);
		if(deleteNumber > -1){
			
			// removing from array
			GetterSetter removed = details.remove(deleteNumber);
			System.out.println("\nAre U sure to delete This Student's Details?"); 
			System.out.print("\n=> Type [y] for Yes and [n] for No: "); 
			student_number = typeWord.next(); {
			
			// options to whether delete a student or not, if pressed "Y" deletes from Student.txt file
			switch (student_number) {
			case "y":
			case "Y":
				typeWord.nextLine();
				// saving the user input instruction
				try {
					textSave("Data/Student.txt", details);
				} 
				catch (IOException error) {
				}
				break;

			case "n":
			case "N":
				typeWord.nextLine();
				System.out.println("\nCheers!!! Following Student's details are still in the Database.\n" +removed +"\nDont Worry :)\n");
				return;
			}
		}
		System.out.println("\nFollowing Student Details has been deleted from Database\n" + removed);
		}
		else {
			System.out.println("\nAlert: No any record found in Database to delete.\n");
		}
	}

//------------------------------------------------------------------------------

	/*

			private static void exitSystem(Scanner typeWord){
					System.out.println("Are U sure U want to exit???"); 
					System.out.println("Yes => [1]"); 
					System.out.println("No  => [2]");
					int exists = typeWord.nextInt();
					if (exits > -1){System.out.print("Type Either 1 OR 2 to get the result: ");

							switch (exit) {
									case 1:
									System.out.println("\n=> Thank You 4 Using My Java Program ;) <=");
									break;
									case 2:
											System.out.println("This Application is Still Running!!!");
											System.out.println("          Press the [ ENTER ] key to continue ");
											typeWord.next();

							}
					} else {
							return;
					}

			}
	*/



	// setting up to enable to read the saved input file
	private static ArrayList<GetterSetter> textRead(String location) throws FileNotFoundException{
		ArrayList<GetterSetter> record = new ArrayList<GetterSetter>();
		//scanner to load file as instruction
		Scanner typeWord = new Scanner(new File(location));
		
		// using while loop
		while(typeWord.hasNext()){
			String list = typeWord.next();
			String[] anil = list.split(";");
			// reading details from array 0 - student number to 4 - mobile number
			GetterSetter readFile = new GetterSetter(anil[0]);
			readFile.setLastName(anil[1]);
			readFile.setFirstName(anil[2]);
			readFile.setEmailAddress(anil[3]);
			readFile.setMobileNumber(anil[4]);
			record.add(readFile);
		}
		return record;		// return method

	}

	// setting the FileWriter and BufferWriter with Connecting Getter and Setter to save the input Details
	private static void textSave(String location, ArrayList<GetterSetter> record) throws IOException{
		//creating writer to save to file
		BufferedWriter save = new BufferedWriter(new FileWriter(location));
		
		// creating for loop write data in database with given format on moodle as [Student_number;Last_name;First_name;email_address;mobile_number]
		for(int search = 0; search < record.size(); search++){
			GetterSetter writeFile = record.get(search);
			save.write(writeFile.getStudentNumber());
			save.write(";");
			save.write(writeFile.getLastName());
			save.write(";");
			save.write(writeFile.getFirstName());
			save.write(";");
			save.write(writeFile.getEmailAddress());
			save.write(";");
			save.write(writeFile.getMobileNumber());
			if(search < (record.size() - 1)){
				save.newLine();
			}
		}
		save.close();
	}

}// end of main

/*
 References:

1. http://beginwithjava.blogspot.ie/2011/05/java-file-save-and-file-load-text.html?m=1

2. http://stackoverflow.com/questions/4105331/how-to-convert-from-int-to-string

3. http://stackoverflow.com/questions/14175449/read-file-to-string-array-and-show-each-record

4. http://www.journaldev.com/878/how-to-write-a-file-in-java-using-filewriter-bufferedwriter-files-and-fileoutputstream

5. http://stackoverflow.com/questions/12273794/scanner-nextline-nosuchelementexception
	(Spilit the file in saving mode ";", ":", "-", ",", "|")

6. http://stackoverflow.com/questions/2397714/java-try-and-catch-ioexception-problem
	(Throw and Catch Exception)

7. http://www.higherpass.com/java/tutorials/basic-file-manipulation-with-java/

8. http://stackoverflow.com/questions/4801971/how-to-create-empty-folder-in-java
	(To create a new folder named as Data)

9. http://stackoverflow.com/questions/5343689/java-reading-a-file-into-an-arraylist
	(Reading a file into an array?)
	
10.	http://www.dreamincode.net/forums/topic/271115-how-to-use-java-swing-to-get-user-input-and-write-to-file
	(Getting user input and save it)

11. Classes Examples: EmplyeApp.Java
	(Week 6)

*/
