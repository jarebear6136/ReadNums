import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadNums 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner kb = new Scanner(System.in);
		String fileName = "";
		System.out.println("Enter the file name to open: ");
		fileName = kb.next();
		File read = new File(fileName);
		Scanner readFile = new Scanner(read);
		double grade = 0;
		double total = 0;
		double avg = 0;
		ArrayList<Double>grades = new ArrayList<Double>();
		
		//////////////////////////////////////////////////
		//populate array list with values stored in a file
		//total each value
		while(readFile.hasNextDouble())
		{
			grade = readFile.nextDouble();
			grades.add(grade);
			total+=grade;
		}
		////////////////////////////////////////////////////
		//print value in the array list
		for(double value:grades)
		{
			System.out.print(value+", ");
			
		}
		System.out.println();
		avg = total/grades.size();
		//display total and average
		System.out.println("Total:"+total+"\nAverage: "+avg);
		kb.close();
		readFile.close();
		
	}

}
