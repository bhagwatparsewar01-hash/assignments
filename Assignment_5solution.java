package Assignment;

public class Assignment_5solution {
	public static void main(String[] ags) {
	// create a string 
		String[] Studentname = {"suresh","mahesh","Ramesh"};
		int[] Marks = {70, 80, 82 };
		
		int[] updatedMarks = new int[3];// updated marks 
		
		
		updatedMarks[0]= Marks[0]+10;
		updatedMarks[1]= Marks[1]+10;
	    updatedMarks[1]= Marks[2]+10;
	
	 // Calculate average using + and / operators
	    double sum = updatedMarks[0] + updatedMarks[1] + updatedMarks[2];
        double average = sum / 3;
        
        System.out.println("Updated Marks: Suresh: " + updatedMarks[0] + ", Mahesh: " + updatedMarks[1] + ", Naresh: " + updatedMarks[2]);
        System.out.println("Average Marks: " + average);
	    
	}
}
