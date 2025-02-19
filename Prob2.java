import java.util.Scanner;
class Prob2{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for angle a :");
        int a =scan.nextInt();
        System.out.println("Enter value for angle b :");
        int b = scan.nextInt();
        System.out.println("Enter value for angle c :");
        int c = scan.nextInt();
        if( a+b+c == 180){
            System.out.println("Triangle will be formed");
         } else{
                System.out.println("Triangle not formed");
            }
        }
    }
