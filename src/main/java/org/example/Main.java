package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int Count =scanner.nextInt();

        int n1 = 0, n2 = 1,n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i<Count -1 ; i++){
          n3 = n2 + n1;
            System.out.print(n3 +" ");
            n1 = n2;
            n2 = n3;
        }
    }
}