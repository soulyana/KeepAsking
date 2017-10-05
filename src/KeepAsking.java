import java.util.Scanner;

public class KeepAsking {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        do {

            String firstName;
            int age;
            String height;
            double gpa;

            System.out.print("What is your first name? ");
            firstName = sc.next();

            System.out.print("How old are you? ");
            age = sc.nextInt();

            System.out.print("How tall are you? ");
            height = sc.next();

            System.out.print("What is your GPA? ");
            gpa = sc.nextDouble();

            System.out.println(firstName + " " + age + " " + height + " " + gpa);

            System.out.println("Would you like to add another person? Y or N");
            ans = sc.next();
            if(!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                System.out.println("");
            }
            if(ans.equalsIgnoreCase("n")) {
                System.out.println("Thank you!");
            }

        }while(!ans.equalsIgnoreCase("n"));
    }
}

//Put this in a loop so that you can ask the same question for different people.
