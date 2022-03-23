package com.company;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner dis =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=dis.nextInt();
        if(n%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
