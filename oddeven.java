import java.util.Scanner;

 class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else if(num<0)
        System.out.println("invalid");
        else
        System.out.println("Odd");
        
         
    }
}
