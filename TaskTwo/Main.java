import java.util.*; 
public class Main{
	public static void main(String[] args) {
        System.out.println("Please enter the number of students");
        Scanner input = new Scanner(System.in);
        int numOfStudents =  input.nextInt();
        
        int highestScore = 0;
        String name = "Null";
        while(numOfStudents > 0){
            System.out.print("Please enter the student's name : ");
            input.nextLine();
            String tempName = input.nextLine();
            System.out.println();
            
            System.out.print("Please enter the student's score : ");
            int tempScore = input.nextInt();
            System.out.println();
            
            if(tempScore > highestScore){
                highestScore = tempScore;
                name = tempName;
            }
            
            numOfStudents--;
        }
        System.out.println("The student with the highest score is "+name+" with a score of "+highestScore);;
        
	}
}
