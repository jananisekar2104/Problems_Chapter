/*  Prob 2:
Write a program to take x and print multiples of x till 1000.
Input:
100
Expected Output:
100
200
300
400
500
600
700
800
900
1000
Explanation - Input is 100, multiples of 100 is 100*1, 100*2, 100*3 and so on till 1000.
 */
import java.util.Scanner;
class Prob6{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for x :");
        int x = scan.nextInt();
        for(int i=x;i<=1000;i+=x){
            System.out.println(i);
        }
    }
}
