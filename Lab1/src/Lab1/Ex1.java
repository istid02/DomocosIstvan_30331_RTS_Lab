package Lab1;

import java.util.Scanner;

public class Ex1 {
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Complex Number Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        int real_part1 = 2; //a
        int real_part2 = 4; //b
        int im_part1 = 5; // c
        int im_part2 = -1; //d


        switch (option) {
           case 1:
                System.out.println("Sum: " + (real_part1+real_part2) + "+" + (im_part1 + im_part2) + "i");
                
                break;
                  case 2:
                
                System.out.println("Difference: " +(real_part1-real_part2) + "+" + (im_part1 - im_part2) + "i");
                break;
            case 3:
              
                System.out.println("Product: " + (real_part1*real_part2 - im_part1*im_part2) +
                		 "+" + (real_part1 * im_part2 + real_part2 * im_part1) + "i");
                break;
            default:
                System.out.println("Invalid option");
        }   

        scanner.close();
    }
}



