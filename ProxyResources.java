package hospitalSecurity;

public class ProxyResources implements ResourseInterface{
	
	Resourses resourse;
	User user;
	
	public ProxyResources(User user){
		this.user=user;
	}


	public void accessPatientDetails() {
		if(user.getUserName().equalsIgnoreCase("admin")||user.getUserName().equalsIgnoreCase("Patient Family")){
			resourse = new Resourses();
			resourse.accessPatientDetails();
		}
		else{
			System.out.println("The patient Detais cannot be acccessed by you");
		}
	}

	
	public void accessPatientInEntry() {
		System.out.println("The patient In Entry Detais are being acccessed");
	}
	
	
	public void accessPatientMedicalHistory() {
		if(user.getUserName().equalsIgnoreCase("admin")||user.getUserName().equalsIgnoreCase("Patient Family")){
			resourse = new Resourses();
			resourse.accessPatientMedicalHistory();
		}
		else{
			System.out.println("The patient Medical History Detais cannot be acccessed by you");
		}
		
	}

	
    public void accessOperationDetails() {
		if(user.getUserName().equalsIgnoreCase("admin")){
			resourse = new Resourses();
			resourse.accessOperationDetails();
		}
		else{
			System.out.println("The patient Medical operation Detais cannot be acccessed by you");
		}
		
	}
	

}
