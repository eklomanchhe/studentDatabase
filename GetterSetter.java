/**
 * Created by Anil Shivakoti
 * Student Number	: 	2014382
 * College		:	CCT
 */
/**
 *
 * @author Shivakoti Anil
 */

public class GetterSetter {
	
	/**
	* Attributes For Student Details:	
	*  - Student Number as student_number (int)
	*  - Last Name as last_name (String)
	*  - First Name as first_name (String)
	*  - Email Address email_address (String)
	*  - Mobile Number as mobile_number(int)
	
	
	* Setters and Getters (one for each of the attributes)
	 	Behaviour (methods):
		StudentNumber()
		LastName()
		FirstName()
		EmailAddress()
		Mobile Number()
	
	*/


	private final String student_number;
	private String last_name;
	private String first_name;
	private String email_address;
	private String mobile_number;
	
	
		
	public GetterSetter(String student_number){
		this.student_number = student_number;
	}
        // SETTING GETTERS

	public String getStudentNumber(){
		return student_number;
	}
	
	public String getFirstName() {
		return first_name;
	}
	public String getLastName() {
		return last_name;
	}
	public String getEmailAddress() {
		return email_address;
	}
	public String getMobileNumber() {
		return mobile_number;
	}

	// SETTING SETTERS
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	
	public void setEmailAddress(String email_address) {
		this.email_address = email_address;
	}

	

	public void setMobileNumber(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	@Override
	public String toString(){
		return "\nStudent Number: " +student_number +"\nFirst Name: " +first_name +"\nLast Name: " +last_name +"\nEmail Address: " +email_address +"\nMobile Number: " +mobile_number +"\n" +"\n"; 
		
	}
}
