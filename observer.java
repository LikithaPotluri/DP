package hospitalSecurity;
//observer class
abstract class observer {
	 //method to update the observer, used by subject
	protected Subject subj; 
	public abstract void update();
	}
