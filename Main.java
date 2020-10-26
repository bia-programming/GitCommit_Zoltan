package com.company;

import java.util.Scanner;

/*
O pereche de cate doua numere, se contorizeaza cu +1!
*/
public class Main {

    public static void main(String[] args) {
        System.out.print("n= ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]= ");
            int nr = scanner.nextInt();
            arr[i] = nr;
        }
        System.out.println("Numarul de perechi este: " + method(arr, n));
    }


    static int method(int arr[], int n) {
        int c, perechi = 0;
        int checked[] = new int[n];
        for (int i = 0; i < n; i++) {
            c = 1;
            boolean found = false;
            for (int j = 0; j < n; j++) {
                for (int el : checked) {
                    if (el == arr[i])
                        found = true;
                }
                if (arr[i] == arr[j] && i != j && found == false)
                    c++;

            }
            checked[i] = arr[i];
            perechi += c / 2;
        }
        return perechi;
    }
}
