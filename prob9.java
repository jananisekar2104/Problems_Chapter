/*     Write a Program which takes input n and prints the below pattern and upload the code to your github repo.
                
                  Sample 1:
                  Input:
                  n = 4
                  Expected output:
                  4321
                  321
                  21
                  1

*/


public class patterns5 {

    public static void main(String[] args) {
        int n =5;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
}
