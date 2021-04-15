/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4algo;

/**
 *
 * @author Sahrul
 */
public class SortingSeraching {
    public static void bublesort(int A[]){
        int i = 1, j, n =A.length;
        int temp;
        while (i<n){
            j = n-1;
            while (j>=i){
                if (A[j-1]>A[j]){
                     temp  = A[j];
                     A[j] = A[j-1];
                     A[j-1] = temp;
            }
            j=j-1;
        }
         i = i + 1;
        }
    }
    public static void sequentialSerching(int A[]){
        int cari = 13;
        int ketemu = 0;
        
        for(int i = 0; i < A.length; i++){
            if(A[i]== cari){
                ketemu = 1;
                System.out.println("data " + cari + " ditemukan");
            }
        }
    }
    public static void tampil(int data []){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int A [] = {25,7,9,13,3};
        System.out.println("Searching dan Sorting bubble sort");
        SortingSeraching.tampil(A);
        SortingSeraching.bublesort(A);
        SortingSeraching.sequentialSerching(A);
        SortingSeraching.tampil(A);
    }
}
