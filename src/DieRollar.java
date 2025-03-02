import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        boolean keepRolling = true;

        while(keepRolling){
            int rollCount = 0;
            System.out.printf("%-8s","Roll");
            System.out.printf("%-8s","Die1");
            System.out.printf("%-8s","Die2");
            System.out.printf("%-8s","Die3");
            System.out.printf("%-8s%n","Sum");
            System.out.println("--------------------------------------");
            while(true){
                rollCount++;
                int die1 = generator.nextInt(6) + 1;
                int die2 = generator.nextInt(6) + 1;
                int die3 = generator.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-8d", rollCount);
                System.out.printf("%-8d", die1);
                System.out.printf("%-8d", die2);
                System.out.printf("%-8d", die3);
                System.out.printf("%-8d%n", sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }
            System.out.println("Triple found! Do you want to roll again? (y/n)");
            String response = in.next();

            if (!response.equalsIgnoreCase("y")){
                keepRolling = false;
            }
        }

    in.close();
    }
    }

