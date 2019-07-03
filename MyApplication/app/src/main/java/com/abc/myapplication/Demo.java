package com.abc.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            long returnValue1=0;
            long returnValue2=0;


            String line = br.readLine();
            String[] str = line.trim().split("\\s");

            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(arr);
            returnValue1 = arr[0]*arr[1];
            returnValue2 = arr[n-1]*arr[n-2];
            if(returnValue1>returnValue2) {
                System.out.println(returnValue1);
                continue;
            }
            System.out.println(returnValue2);
        }
        br.close();
    }
}
