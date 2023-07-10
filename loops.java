// import java.util.Scanner;
// Simple java calcu  pgm by bib
// Updated by Bibin
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean co = true;
        System.out.println("\n\n-------------------SIMPLE CALCULATOR PGM.--------------------");
        while (co){
            System.out.print("\nEnter a no:");
            int n1 = sc.nextInt();
            System.out.print("\nEnter another no:");
            int n2 = sc.nextInt();
            System.out.print("\n1.Addition(+)\n2.Subtraction(-)\n3.Divison(/)\n4.Multiplication(*)\n5.Quit\nChoose any option:");
            int c = sc.nextInt();
            switch (c){
                case 1->{
                    System.out.println("\nSum of "+n1+" and "+n2+" is "+(n1+n2));
                }
                case 2->{
                    System.out.println("\nDifference of "+n1+" and "+n2+" is "+(n1-n2));
                }
                case 3->{
                    System.out.println("\nQuoetient of "+n1+" / "+n2+" is "+(n1/n2));
                }
                case 4->{
                    System.out.println("\nProduct of "+n1+" and "+n2+" is "+(n1*n2));
                }
                case 5->{
                    co = false;
                }
                default->{System.out.println("\nInvalid input entered,Try again...");}
            }
        }
    }
}
