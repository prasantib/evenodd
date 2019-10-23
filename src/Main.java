import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x = 0;
        int num = keyboard.nextInt();
        for (int i = 1; i<=num; i++){
            x = i % 2;
            if (x==0){
                System.out.println(i + " is an even number");
            }
            else {
                System.out.println(i + " is an odd number");
            }
        }
        }
    }