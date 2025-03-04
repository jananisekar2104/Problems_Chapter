class practice {
    public static void main(String[] args) {
       int n =789654, rev= 0;
       
       while(n>0){
           rev=(n%10);
           n=n/10;
           System.out.print(rev);
       }
         
}
}
