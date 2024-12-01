package Hust.soict.dsai.lab01.StarsTriangle;

import java.util.Scanner;
public class StarsTriangle{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's the number n?");
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) { 
                System.out.print(" "); 
            }
            for (int j = 1; j <= i; j++) { 
                if(j == i){	
            		System.out.print("*"); 
            		break;
                }
                System.out.print("**"); 
            }
            System.out.println(); 
        }
    }
}