package management;
import java.util.*;
import java.io.*;
public class Main_Employee_Class {

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String User_ID;
		String First_Name;
		String Last_Name;
		int Version;
		String Insurance_Company;
		
		ArrayList<Employee> List = new ArrayList<>();
		
		FileInputStream fos = null;
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		File f = new File("C:\\Users\\Lucky\\project_Employee_Management_System\\src\save.txt");
		if(f.exists()) {
		    try {
				fos = new FileInputStream(f);
				ois = new ObjectInputStream(fos);
				List = (ArrayList<Employee>) ois.readObject();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int z;
		do {
			System.out.println("\nX --------------- Welcome To the Employee Management System ---------------X\n");
			System.out.println("1> Add Employee to the Database\n" +
			                   "2> Search the Employee\n" + 
					           "3> Edit Employee details\n" +
			                   "4> Delete Employee deatils\n" +
					           "5> Display All Employee\n" +
			                   "6> Exit\n");
			
			System.out.println("Please chose the Number for futher processing");
			
			z = scn.nextInt();
			String id;
			switch(z) {
			case 1: 
				    System.out.println("\nPlease Enter All The Details Mention Below \n");
				    System.out.println("Please Enter Your User_Id :");
			        User_ID = scn.next();
			        System.out.println("Please Enter Your First_Name :");
			        First_Name = scn.next();
			        System.out.println("Please Enter Your Last_Name :");
			        Last_Name = scn.next();
			        System.out.println("Please Enter Your Version :");
			        Version = scn.nextInt();
			        System.out.println("Please Enter Your Insurance_Company :");
			        Insurance_Company = scn.next();
			        
			        List.add(new Employee(User_ID,First_Name,Last_Name,Version,Insurance_Company));  
			        break;
			        
			case 2: 
				   System.out.println("\n Enter an Employee Id to Search : \n");
				   id = scn.next();
				   int i = 0;
				   for(Employee e : List) {
					   if(id.equals(e.getUser_Id())) {
						   i++;
						   System.out.println(e);
						   break;
					   }
				   }
				   if(i == 0) {
					   System.out.println("\nInvalid User_Id\n");
				   }
				   break;
				   
			case 3:
				System.out.println("\n Enter an Employee Id to Edit : \n");
				   id = scn.next();
				   int j = 0;
				   for(Employee e : List) {
					   if(id.equals(e.getUser_Id())) {
						   j++;
						   System.out.println("\n Edit Employee Details \n");
						   System.out.println("1> Edit User_ID : \n" + 
						                      "2> Edit First_Name : \n" + 
								              "3> Edit Last_Name : \n" +
						                      "4> Edit Version : \n" +
								              "5> Edit Insurance_Company : \n");
						   System.out.println("\n Please enter what you want to Edit : \n");
						   int s = scn.nextInt();
						   switch(s) {
						         
						      case 1: 
						    	   System.out.println("Please Enter User_ID for modification : \n");
						    	   String ui = scn.next();
						    	   e.setUser_Id(ui);
						    	   break;
						    	   
						      case 2: 
						    	   System.out.println("Please Enter First_Name for modification : \n");
						    	   String uf = scn.next();
						    	   e.setFirst_Name(uf);
						    	   break;
						    	   
						      case 3: 
						    	   System.out.println("Please Enter Last_Name for modification : \n");
						    	   String ul = scn.next();
						    	   e.setLast_Name(ul);
						    	   break;
						    	   
						      case 4: 
						    	   System.out.println("Please Enter Version for modification : \n");
						    	   int uv = scn.nextInt();
						    	   e.setVersion(uv);
						    	   break;
						      
						      case 5: 
						    	   System.out.println("Please Enter Insurance_Company for modification : \n");
						    	   String uc = scn.next();
						    	   e.setInsurance_Company(uc);
						    	   break;
						    	   
						      default: 
						    	   System.out.println("Please Enter Valid Input for modification : \n");
						    	   break;
						   }
						   System.out.println("Sucessfully completed task profile Updated");
						   System.out.println(e);
						   break;
					   }
				   }
				   if(j == 0) {
					   System.out.println("\nInvalid User_Id\n");
				   }
				   break;
				   
				   
			case 4:
				System.out.println("\n Enter an Employee Id to Delete your deatils from database : \n");
				   id = scn.next();
				   int k = 0;
				   for(Employee e : List) {
					   if(id.equals(e.getUser_Id())) {
						   k++;
						   List.remove(e);
						   System.out.println("your details has been deleted from the database");
						   break;
					   }
				   }
				   if(k == 0) {
					   System.out.println("\nInvalid User_Id\n");
				   }
				   break;
		     
			case 5:
				 System.out.println("\n Here Are the details of all the employee \n");
				 for(Employee e : List) {
					 System.out.println(e);
				 }
				 break;
			
			case 6 :
				 try {
					fis = new FileOutputStream(f);
					oos = new ObjectOutputStream(fis);
					oos.writeObject(List);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					try {
						fis.close();
						fos.close();
						oos.close();
						ois.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				 
				System.out.println("Sucessfully File is saved now we are going for the exit");
				break;
			
			default: 
				    System.out.println("\nInvalid Input\n");
			        break;

		  }
		}while(z != 6);
	
   }
}
