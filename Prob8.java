/*    
                Write a Program which takes input n and prints the below pattern and upload the code to your github repo.
                Sample 1:
                Input:
                n = 4
                Expected output:
                ****
                ***
                **
                *

*/
class Main{
    public static void main(String[]args){
        int n =4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
