import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CBSE BOARD PERCENTAGE CALCULATOR");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total marks of each subject (eg: 100, 80 ,etc.)");
        int totalmarks = sc.nextInt();

        System.out.println("Marks in Maths");
        int m = sc.nextInt();

        System.out.println("Marks in Physics");
        int p = sc.nextInt();

        System.out.println("Marks in Chemistry");
        int c = sc.nextInt();

        System.out.println("Marks in English");
        int e = sc.nextInt();

        System.out.println("Marks in Second Language");
        int l = sc.nextInt();

        float percentage = ((m+p+c+e+l)*100)/(totalmarks*5);

        System.out.println("Your Percentage is : " + percentage);
        sc.close();

    }
}