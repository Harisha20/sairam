/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Natural 
{
    public static void main(String args[])
    {
        int x, i = 1 ;
        int sum = 0;
        
        
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    } 
}
