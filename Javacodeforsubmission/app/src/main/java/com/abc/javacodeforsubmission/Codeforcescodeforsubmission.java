package com.abc.javacodeforsubmission;


import java.util.Scanner;

public class Codeforcescodeforsubmission {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextInt();
        boolean flag1 = true;
        int count = 0 ;
        for(long i=1;i<=t;i++)
        {
            int n = s.nextInt();
            if(n<11)
            {
                System.out.println("NO");
                flag1 = false;
            }
            if(flag1) {
                count = n ;
                long[] number = new long[n];
                long start = 0;
                long forward = 1;
                long temp = 0;
                for (int j = 0; j < number.length; j++) {
                    number[j] = s.nextInt();
                }
                for(int j=0;j<number.length;j++)
                {
                    if(number[j]==8)
                        break;
                }
                if((number.length - i) >= 11)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }

        }
    }
}


