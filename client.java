package hospitalSecurity;
import java.util.*;

public class client{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Subject sub = new Subject();
		
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int login;
		int no1;
		int no2;
		int no3;
		int wish;
		int wish2 = 0;
		do{
		String userName;
		System.out.println("Enter 1 if u want to login as user 2.admin");
		login=in.nextInt();
		
		switch(login){
		
		case 1:{ User user1=new User("user");
	            ProxyResources folderProxy1 = new ProxyResources(user1);
	            do{
	            	System.out.println("press 1.Access resources  2.Get access 3.logout");
	            
	            no1=in.nextInt();
		       
	            switch(no1){

		             case 1:
	                           System.out.println("Dear admin,press 1 to access patient detais 2.Patient In Entry Details 3.Patient Medical history 4.Patient Operation Details");
	                           no2=in.nextInt();
	                                switch(no2){
	                                      case 1:   folderProxy1.accessPatientDetails();
	 		                                        break;
	 		                              case 2:   folderProxy1.accessPatientInEntry();
	 		                                        break;
	 		                              case 3:   folderProxy1.accessPatientMedicalHistory();
	 		                                        break;
	 		                              case 4:   folderProxy1.accessOperationDetails();
	 		                                        break;
	                                           }
	                        	break;	
	                          
	                          
	                          
		             case 2:   
		            	       //Subject sub = new Subject();
		            	       new admin (sub );
		            	       System.out.println("Enter your name");
		            	       userName = in.next();
		            	       System.out.println("press 1 to get access patient detais  2.Patient Medical history 3.Patient Operation Details");
	                           no3=in.nextInt();
	                               switch(no3){
	                               case 1: sub.setState( userName + "wants to get access to patient details");
	                                       break;
	                               //case 2: sub1.setState( userName + "wants to get access to patient Medical hstory");
                                     //      break;
	                               //case 3: sub1.setState( userName + "wants to get access to patient operation details");
                                     //      break;
	                                  
	                                       
	                               }
	                           break;
	                               
	                               
		           case 3:   break;
		           
		        }
	            System.out.println("would u like to access as a user again?? press 1");
	            wish2 = in.nextInt();
	            }
		         while(wish2==1);
	           
		
		}
	            
		case 2: User user2=new User("admin");
                ProxyResources folderProxy2 = new ProxyResources(user2);
                sub.getState();
                System.out.println("press 1 to access patient detais 2.Patient In Entry Details 3.Patient Medical history 4.Patient Operation Details 5.log out");
                no2=in.nextInt();
                     switch(no2){
                           case 1:    folderProxy2.accessPatientDetails();
                                      break;
                            case 2:   folderProxy2.accessPatientInEntry();
                                      break;
                            case 3:   folderProxy2.accessPatientMedicalHistory();
                                      break;
                            case 4:   folderProxy2.accessOperationDetails();
                                      break;
                            case 5:   break;
                                }
               break;
		      

	}
	System.out.println("Do you wish to continue ?? press 1");
	wish=in.nextInt();
	}while(wish==1);
	}}

