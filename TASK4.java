
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        int ch = 4;
        int choice;
        int roll_number;
        String candidate_name;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        candidate_name = sc.nextLine();
        System.out.println("Please enter your roll number : ");
        roll_number = sc.nextInt();
        int cnt = 0;
        System.out.println("   Welcome "+candidate_name+" Good Luck! for your exam     ");
        while(true){
            System.out.println("Select any one option from the given choices :");
            System.out.println("Press 1 : For taking the exam ");
            System.out.println("Press 2 : For Exit");
            System.out.println("Please enter a valid choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1: {
                    flag = true;
                    System.out.println("Select one of these");
                    //remember
                    System.out.print("1.SQL \n2.Java\n");
                    int choicee = sc.nextInt();
                    System.out.println("                     Instructions...");
                    System.out.println("1.All questions contain 5 marks");
                    System.out.println("2.No minius marking");
                    System.out.println("3.Total 5 question in each sub");
                    switch (choicee){
                        case 1:{
                            int totalMarks = 0;
                            int answer = 0;
                            System.out.println("Q1: What does SQL stand for?");
                            System.out.print("1.Strong Question Language \n2.Structured Question Language\n3.Structured Query Language\n");
                            System.out.println("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 3){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-3");
                            }
                            //taking input answer
                            System.out.println("Q2: Which SQL statement is used to extract data from a database?");
                            System.out.println("1.SELECT\n2.OPEN\n3.EXTRACT\n4.NONE OF THE ABOVE");
                            System.out.println("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 1){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-1");
                            }
                            //taking input answer
                            System.out.println("Q3: Which SQL statement is used to update data in a database?");
                            System.out.println("1.SAVE AS\n2.UPDATE\n3.MODIFY\n4.SAVE");
                            System.out.println("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 2){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-2");
                            }
                            //TAKING INPUT ANSWER
                            System.out.println("Q4: Which SQL statement is used to delete data from a database?");
                            System.out.println("1.REMOVE\n2.DELETE\n3.COLLAPSE");
                            System.out.println("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 2){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-2");
                            }
                            //TAKING INPUT ANSWER
                            System.out.println("Q5: Which SQL statement is used to insert new data in a database?");
                            System.out.println("1.INSERT INTO\n2.INSERT NEW\n3.ADD RECORD\n4.ADD NEW");
                            System.out.println("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 1){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-1");
                            }
                            System.out.println("Total obtained marks = "+totalMarks);
                            break;
                        }
                        case 2:{
                            int totalMarks = 0;
                            int answer = 0;
                            System.out.println("Q1. Which of the following option leads to the portability and security of Java?");
                            System.out.println("1.Bytecode is executed by JVM\n2.The applet makes the Java code secure and portable\n3.Use of exception handling\n4.Dynamic binding between objects");
                            System.out.print("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 1){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-1");
                            }
                            System.out.println("Q2. Which of the following is not a Java features?");
                            System.out.println("1.Dynamic\n2.Architecture Neutral\n3.Use of pointers\n4.Object-oriented");
                            System.out.print("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 3){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-3");
                            }
                            System.out.println();
                            System.out.println("Q3. An interface with no fields or methods is known as a ______.");
                            System.out.println("1.Runnable Interface\n2.Marker Interface\n3.Abstract Interface\n4.CharSequence Interface");
                            System.out.print("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 3){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-3");
                            }
                            System.out.println();
                            System.out.println("Q4.  _____ is used to find and fix bugs in the Java programs?");
                            System.out.println("1.JVM\n2.JRE\n3.JDK\n4.JDB");
                            System.out.print("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 2){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-2");
                            }
                            System.out.println();
                            System.out.println("Q5. Which package contains the Random class?");
                            System.out.println("1.java.util package\n2.java.lang package\n3.Bava.awt package\n4.java.io package");
                            System.out.print("Enter your answer :");
                            answer = sc.nextInt();
                            if(answer == 1){
                                System.out.println("Correct...");
                                totalMarks+=5;
                            }else{
                                System.out.println("Wrong...");
                                System.out.println("The correct answer is: Option-1");
                            }
                            System.out.println("Total obtained marks = "+totalMarks);
                            break;
                        }
                        default:
                            System.out.println("Invalid choice please enter a vaild choice.");
                    }
                }
                case 2:{
                    System.out.println("Thank You.........");
                    break;
                }
                default:
                    System.out.println("Invalid choice please enter a vaild choice.");
            }
            break;
        }
    }
}
