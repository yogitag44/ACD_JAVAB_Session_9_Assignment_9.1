//importing all the classes of collection class
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMapDemo {   //HashMap Demo
	
	public static void main(String[] args) {
		
		//passing keys to the Employee class having integer constructor
		Employee emp2 = new Employee(18051);    
		Employee emp3 = new Employee(18076);
		
		//passing Values to the Employee class having String constructor
		Employee emp4 = new Employee("Jogita");
		Employee emp5 = new Employee("Gautam");
		
		//HashMap to take key value pair
		Map<Employee,Employee> empMap=new HashMap<Employee,Employee>();

		//Map<Integer,String> empMap2=new HashMap<Integer,String>();
		
		//Inserting values into hashmap
		empMap.put(emp2,emp4);
		empMap.put(emp3,emp5);
			
		System.out.println("List contain Two employees and it is like below: \n");
		System.out.println(empMap.entrySet());   //printing complete set of hashmap, all the values in the list
		
		System.out.println("\nPrinting only Employee name as follows: ");
		System.out.println(empMap.get(emp2));  //printing only corresponding to the employee codes
		System.out.println(empMap.get(emp3));	//printing only corresponding to the employee codes
		
	}
}


