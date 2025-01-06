import java.util.Scanner;
public class IT24103862Lab10Q2{
public static void main (String []args){

Scanner scanner= new Scanner(System.in); 
System.out.print("Enter the mark");
int mark =scanner.nextInt();

assert (mark>=0 && mark <=100): "Invalid Mark" ;

char grade;
if(mark>=75) {
     grade = 'A';
}else if (mark > 60) {
     grade = 'B';
}else if (mark > 50) {
     grade = 'C';
}else if (mark > 40) {
     grade = 'D';
}else { 
     grade = 'F';
}

assert (verifyGrade(mark,grade)):"Incorrect Grade Assigned";

System.out.print("Mark is Validated" );
System.out.print("Grade:"+ grade);
}

private static Boolean verifyGrade(int mark,char grade){
        if(mark >=75 && grade == 'A')return true; 
        if(mark >=60 && mark < 75 && grade =='B')return true;
        if(mark >=50 && mark < 60 && grade =='C')return true;
        if(mark >=40 && mark < 50 && grade =='D')return true;
        if(mark < 40 && grade == 'F') return true;
        return false;
}
   }