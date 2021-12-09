package management;

import java.io.Serializable;

public class Employee implements Serializable{
     private String User_Id;
     private String First_Name;
     private String Last_Name;
     private int Version;
     private String Insurance_Company;
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getVersion() {
		return Version;
	}
	public void setVersion(int version) {
		Version = version;
	}
	public String getInsurance_Company() {
		return Insurance_Company;
	}
	public void setInsurance_Company(String insurance_Company) {
		Insurance_Company = insurance_Company;
	}
	public Employee(String user_Id, String first_Name, String last_Name, int version, String insurance_Company) {
		super();
		User_Id = user_Id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Version = version;
		Insurance_Company = insurance_Company;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [User_Id=" + User_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Version="
				+ Version + ", Insurance_Company=" + Insurance_Company + "]";
	}
     
     
}
