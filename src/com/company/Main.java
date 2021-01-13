package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int b = fac(6);
        System.out.println(b);
    }

    // recursive
    public static int factorial (int num)
    {

        if (num == 0 || num == 1)
            return 1;
        if (num >= 2 )
            return num * factorial(num -1);
        else
            return 404;
    }

    // non-recursive
    public static int fac (int number)
    {
        int b;
        int a = 1;
        for (int i = 0; i < number; i++)
        {
           b = number - i;
           a = a * b;
        }
        return a;

    }
}
