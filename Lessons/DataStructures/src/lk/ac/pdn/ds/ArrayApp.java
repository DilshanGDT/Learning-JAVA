package lk.ac.pdn.ds;

import lk.ac.pdn.model.Faculty;

public class ArrayApp {

	public static void main(String[] args) {
		
	//arrayAbasics();
	copy();
		
	}
	
	private static void arrayAbasics() {
		//1 Dimensional Arrays
		
				//Create arrays
				int[] vector = new int[10];
				int[][] matrix = new int[10][12];
				int[][][] imageStack = new int[10][10][12];
				byte[] byteArray = new byte[1024];			//very famous
				String[][] stringMatrix = new String[10][];
				int marks[] = new int[5];					//not recommended []
				
				//Faculty[] uop = new Faculty[9];	//user define array
				
				
				//Retrieve data	
				int[] marksCSC = {12,34,33,25};
				System.out.println(marksCSC[marksCSC.length - 1]);
				//System.out.println(marksCSC[marksCSC.length]);	ArrayOutOfBoundException
				
					//for loop
				for (int i = 0; i < marksCSC.length; i++) {
					System.out.print(marksCSC[i] + " ");
				}
				
				System.out.println("");
				
					//enhanced for loop
				for (int value: marksCSC) {
					System.out.print(value + " ");
				}
				
				System.out.println("");
				System.out.println("--------------------");
				
				//Insert data
				int[] vec = new int[10];
				vec[0] = 10;
				vec[1] = 20;
				vec[2] = 30;
				vec[3] = 40;
				vec[4] = 50;
				
				//user define array properties
				Faculty[] uop = new Faculty[9];
				uop[0] = new Faculty("Science", "sci");
				uop[1] = new Faculty("Agriculture", "ag");
				uop[2] = new Faculty("Engineering", "eng");
				
				for (Faculty f: uop) {
					if (f != null) {
						System.out.println(f.getName());
					}
				}
				
				System.out.println("--------------------");
				
				Faculty[] uom = {new Faculty("Statistics", "stat"), new Faculty("Physics","phy")};
				
				for (Faculty f: uom) {
					System.out.println(f.getName() + " : " + f.getShortName());
				}
				
				System.out.println("--------------------");
				
				//2 Dimensional Arrays
				
				//int[][] d2 = new int[3][3];		
				int[][] d2 = {{1,2,3},{4,5,6},{7,8,9}};
				//[Rows][Columns] - RC format
				
				//System.out.println(d2[1][2]);	//row 2, col 3
				
				for (int r = 0; r < d2.length; r++) {
					for (int c = 0; c < d2[r].length; c++) {
						System.out.print(d2[r][c] + " ");
					}
					System.out.println(" ");
				}
	}
	
	private static void copy() {
		
		//Array reference coping
		int[] marksCSC1023 = {12,34,33,25};
		int[] assignments = marksCSC1023;	//this is a reference, not a copy
		
		System.out.println("Before");
		System.out.println(marksCSC1023[0] + " and " + assignments[0]);
		
		System.out.println("After");
		marksCSC1023[0] = 31;
		System.out.println(marksCSC1023[0] + " and " + assignments[0]);
		
		System.out.println(" ");
		
		//Array cloning
		
		int[] marksCSC102 = {12,34,33,25};
		int[] assignment = marksCSC102.clone();	//Actual copy
		
		System.out.println("Before");
		System.out.println(marksCSC102[0] + " and " + assignment[0]);
		
		System.out.println("After");
		marksCSC102[0] = 31;
		System.out.println(marksCSC102[0] + " and " + assignment[0]);
		
		//Array coping method 3
		System.arraycopy(marksCSC102, 0, assignment, 0, marksCSC102.length);
		//sysArrayCopy(copiedArray, sourceStartIndex, newArray, destinationStartIndex, lengthThatWantToCopy)
	}

}
