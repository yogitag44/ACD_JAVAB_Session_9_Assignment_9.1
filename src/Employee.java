import java.util.*;   //importing all the classes of java

public class Employee {   //Employee Class with all the details
	int empCode;   //integer to take empCode as Key for hash table
	String empName;		//string to takeEmp name as Value pair

	public Employee(int empCode) {     //Constructor with one parameter
		 
		this.empCode= empCode;    //using variable of main class

	}

	public Employee(String emp_name) {    //Another constructor of Employee class 
		this.empName=emp_name;   //using string variable of class employee
	}

	public Employee() {   //auto generated employee class with constructor
	
	}
	public int getEmp_code() {    //Get method to take value from user/system
		return empCode;   //returning the value
	}


	public void setEmp_code(int empCode) {   //Set employee code value
		this.empCode = empCode;   //returning the set value
	}

	public String getEmp_name() {   //Get method to take value from user/system
		return empName;
	}

	public void setEmp_name(String empName) {  //Set employee name value  
		this.empName = empName;
	}
	public String toString(){     //toString Method to return both empCode and empName 
		return empCode+""+empName;
		
	}
}

