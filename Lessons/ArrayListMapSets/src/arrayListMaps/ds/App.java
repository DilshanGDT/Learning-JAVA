package arrayListMaps.ds;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {
	
	public static void main(String[] args) {
		//arrayMethods();
		//listMethods();
		mapMethods();
	}
	
	private static void mapMethods() {
		
		//    key      value
		Map<Integer, Student> seatingMap = 
				new HashMap<>();
		
		Student s19001 = new Student("S19001", 10, 5, 56);
		Student s19002 = new Student("S19002", 9, 5, 66);
		
		seatingMap.put(1, s19002);
		seatingMap.put(2, s19001);
		seatingMap.put(34, new Student("S19045", 0, 0, 50));
		
		Set<Integer> keys = seatingMap.keySet();
		
		for(int k: keys) {
			System.out.println(seatingMap.get(k));
		}
		
	}
	
	private static void listMethods() {                     
		
		//Student list = new List();		Wrong bcz interfaces cannot initialized
		
	//data type                  comprehensive class(Implement type)
		List<Integer> intList = new ArrayList<Integer>();
		//ArrayList<Integer> arrList = new ArrayList<Integer>();	lack of OOP
		
		intList.add(6);   					//autoboxing
		intList.add(new Integer(6));
		int k = intList.get(1);   			//autoUnboxing
		Integer p = intList.get(0);
		
		Student s19001 = new Student("S19001", 10, 5, 56);
		Student s19003 = new Student("S19003", 9, 5, 46);
		Student s19002 = new Student("S19002", 9, 6, 66);

		// ThreadSafe
		List<Student> studentList = new Vector<Student>(); //ArrayList, Vector, LinkedList
		studentList.add(s19001);
		studentList.add(s19003);
		studentList.add(s19002);
		
		//Student s = studentList.get(10);   		//compile time exception
		//System.out.println(s.getQuiz());			//check exception
		
		for(int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getRegistrationNo());
		}
		
		for(Student std: studentList) {				//cannot access the indexes
			System.out.println(std.getRegistrationNo());
		}
		
	
	//initialization patterns
		int[] numbers = {1, 2, 3, 4, 5};
		
		List<Integer> numberList1 = new ArrayList<Integer>();
		numberList1.add(1);
		numberList1.add(2);
		numberList1.add(3);
		numberList1.add(4);
		numberList1.add(5);
		
		Integer[] numberArray = {1, 2, 3, 4, 5, 5, 3};
		
		
	//convert arrays to list
		List<Integer> numberList = Arrays.asList(numberArray);
		
		for(Integer i: numberList) {
			System.out.print(i + " ");
		}
		
		
	//convert list to arrays
		Integer[] numbersFromList = 
				numberList.stream().toArray(Integer[]::new);
				//JDK 8 onwards
		
		System.out.println();
		
		for(Integer s: numbersFromList) {
			System.out.print(s + " ");
		}
		
	}
	
	private static void arrayMethods() {
		
		Student s19001 = new Student("S19001", 10, 5, 56);
		Student s19002 = new Student("S19002", 9, 5, 66);
		
		Student[] csc1023 = new Student[298]; 					//Object[298];
		
		//assignment 
		csc1023[0] = s19001;									//store define type in array
		csc1023[1] = s19002;	//A
		csc1023[297] = new Student("S19003", 7, 4, 78); 		//A is better than this, for memory management
		
		//Student s = csc1023[1]; //retrieve, one by one - useless
		//System.out.println(s.getRegistrationNo());
		//System.out.println(csc1023[1].getRegistrationNo());
		
		PgStudent pg1 = new PgStudent("MSc19001", 6, 4, 60);	
		csc1023[2] = pg1;										//store sub type in the same array
		csc1023[3] = new PgStudent("MSc19002", 4, 4, 40, 20);
		
		for(int i = 0; i < csc1023.length; i++) {				//if i<=298 -> arrayIndexOutOfBoundException(run time) due to array doesn't have 298 index
			if(csc1023[i] != null) {							//if this doesn't exist -> null exception(run time) due to empty spaces in array
				System.out.println(csc1023[i].getRegistrationNo());
			}
		}
		
	}
}



