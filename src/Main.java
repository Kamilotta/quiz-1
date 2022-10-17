import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,  b, sum = 0;
        System.out.print("1) Armstrong numbers from 100 to 500: \n");
        for(int i = 100; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
        System.out.println("\n-----------------------------------------");



        int tails = 0;
        int heads = 0;
        for (int i = 0; i <= 1000000; i++) {

            int flip = (int) (Math.random() * 2);
            if (flip == 1) {
                heads++;
            } else
                tails++;
        }
        System.out.println("2) Heads: " + heads + " Tails: " + tails);
        System.out.println("------------------------------------------");


        int div=2;
        Scanner input = new Scanner(System.in);
        System.out.print("3)Enter an integer: ");
        int number = input.nextInt();
        while(number > 1)
        {
            if(number%div==0)
            {
                System.out.print(div+"  ");
                number=number/div;
            }
            else
            {
                div++;
            }
        }
        System.out.println("\n------------------------------------------");


        double smtn = 0.0;
        for (double i = 1.0; i <= 624.0; i++) {
            smtn += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.printf("4)Summation: %.2f", smtn);
        System.out.println("\n------------------------------------------");


        System.out.println("5) ");
        int c=5;
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                if (j <= c-i) {
                    System.out.print(" ");
                }else
                {
                    System.out.print("*"+" ");

                }
            }
            System.out.println();

        }


    }
}