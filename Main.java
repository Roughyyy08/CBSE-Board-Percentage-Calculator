import java.util.*;

public class Main {
    public static void main(String[] args) {
     System.out.println("Marks in Maths (out of 100)");
     Scanner sc = new Scanner(System.in);
     int m = sc.nextInt();

     System.out.println("Marks in Physics (out of 100)");
     int p = sc.nextInt();

     System.out.println("Marks in Chemistry (out of 100)");
     int c = sc.nextInt();

     System.out.println("Marks in English (out of 100)");
     int e = sc.nextInt();

     System.out.println("Marks in Second Language (out of 100)");
     int l = sc.nextInt();

     System.out.println((m+p+c+e+l)/500);

     sc.close();

    }
}