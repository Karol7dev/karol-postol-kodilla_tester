package com.kodilla;

public class Przyklad {

    public static void main(String[] args) {

        int[] a = new int[100];
        int[] b = new int[100];

        for (int i=0; i<a.length; i++) {
            a[i] = i+1;
            System.out.println(a[i] + " Dla i = " + i);
            for (int j=0; j< b.length; j++) {
                b[j] = j+1;
                System.out.println(b[j] + " Dla j = " + j);
            }
        }
    }
}