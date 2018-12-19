

import java.util.*;
import java.lang.*;
import java.io.*;

class Powerexp {

    public static void main(String[] args) {

        int base,exp;
Scanner s=new Scanner(System.in);
base=s.nextInt();
exp=s.nextInt();
        long result = 1;

        while (exp != 0)
        {
            result *= base;
            --exp;
        }

        System.out.println(result);
    }
}
