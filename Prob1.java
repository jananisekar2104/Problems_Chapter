import java.util.Scanner;
class Prob1{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scan.nextInt();
    scan.nextLine();
    System.out.println("Enter a word:");
    String name =scan.nextLine();
    System.out.println("Enter a character :");
    char character = scan.next().charAt(0);
    System.out.println(num);
    System.out.println(name);
    System.out.println(character);



}}
