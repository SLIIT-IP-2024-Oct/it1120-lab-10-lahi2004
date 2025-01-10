import java.util.Scanner;

public class IT24103862Lab10Q1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the mark (0-100): ");
	  int mark = input.nextInt();
	  
	  assert (mark >= 0 && mark <= 100) : "Invalid Mark" ;
	  
	  char grade = 'F';
	  if (mark >= 75) {
	      grade = 'A';
      } else if (mark >= 60) { 
	      grade = 'B';
	  } else if (mark >= 50) {
	      grade = 'C';
	  } else if (mark >= 40) {
	      grade = 'D';
      }
	  
	  char expectedGrade = getGrade(mark);
	  
	  assert grade ==  expectedGrade :"Incorrect Grade Assigned";
	  
	  System.out.println("Mark is validated");
	  System.out.println("Assigned Grade: " + grade );
	  }
	  private static char getGrade(int mark) {
	    if (mark >= 75) {
		   return 'A';
		} else if (mark >= 60) {
		   return 'B';
		} else if (mark >= 50) {
		   return 'C';
		} else if (mark >= 40) {
		   return 'D';
		} else { 
		  return 'F';
		}
	}
}