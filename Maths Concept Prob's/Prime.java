public class Prime {

    public static void main(String[] args) {
        

       int n=9;
    for(int x=2;x<=n;x++){
        int prime = 0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                prime = 1;
            }
        }
        if(prime==0){
            System.out.println(x);
        }
    }
    }
}
    
