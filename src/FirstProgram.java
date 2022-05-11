import java.util.Scanner;
public class FirstProgram {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll no: ");
        int roll = sc.nextInt();



        System.out.print("Student name = " + name + "and his roll no is = "+roll);


    }
}
