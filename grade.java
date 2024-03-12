import java.util.Scanner;

public class grade{
    public static void main(String[] agrs)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of subject");
        int n=scanner.nextInt();

        int[] marks = new int[n];
        int sum=0;
        int percentage=0;
    

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        System.out.println("\nMarks obtained in each subject:");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
             sum+=marks[i];
        }
        System.out.println("Total marks: "+sum);

        percentage=sum/n;
        System.out.println("Average percentage: "+percentage);

            char grade;
            if (percentage >= 90) {
                grade = 'A';
                System.out.println("Grade :- " +grade);
            } else if (percentage >= 80) {
                grade = 'B';
                System.out.println("Grade :- " +grade);
            } else if (percentage >= 70) {
                grade = 'C';
                System.out.println("Grade :- " +grade);
            } else if (percentage >= 60) {
                grade = 'D';
                System.out.println("Grade :- " +grade);
            } else {
                grade = 'F';
                System.out.println("Fail :- " +grade);
            }
            
        
    
    
       
        

    


    }
}

