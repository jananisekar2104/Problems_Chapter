
/*Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.

*/
import java.util.Scanner;
class Prob5{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for x: ");
        int x = scan.nextInt();
        System.out.println("Enter the value for y: ");
        int y = scan.nextInt();
        for(int i=0;i<y;i++){
            System.out.println(x);
        }
        
    }
}
