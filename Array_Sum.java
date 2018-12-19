import java.util.Scanner;
class Array_Sum
{
    public static void main(String[] args) 
    {
        int n, sum = 0,k;
        Scanner s = new Scanner(System.in);
 
        n = s.nextInt();
        int a[] = new int[n];
     
      k=s.nextInt();
     
        for(int i = 0; i < k; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
         
         
        }
        System.out.println(sum);
    }
}
