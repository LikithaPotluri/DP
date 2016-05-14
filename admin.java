package hospitalSecurity;

public class admin extends observer {
	 public admin( Subject s ) { 
		    subj = s; 
		    subj.attach( this ); 
		  }

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print( " " + ( subj.getState() ) ); 
		
	}
}
