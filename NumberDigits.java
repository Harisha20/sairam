/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class NumberDigits {

    public static void main(String[] args) {

        int count = 0,num ;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        for(; num != 0; num/=10, ++count) {   
        }

        System.out.println( count);
    }
}
