package hospitalSecurity;

public class Subject {
	   
	 private observer[] observers = new observer[9];
	 private int totalObs = 0;
	 private String state;
	 public void attach( observer o ) {
	    observers[totalObs++] = o;
	  }

	  public String getState() {
		return state;
	  }
	  
	  public void setState( String in ) {
	    state = in;
	    
	  }

	  public void noti() {
	    for (int i=0; i < totalObs; i++) {
	      observers[i].update();
	    }
	  }} 
	

