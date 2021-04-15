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
public class insertionsort {
    public static void insertionSort(int[]A){
        for (int i = 1; i < A.length; i++){
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)){
                A [j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
    public static void tampil(int data[]){
        for(int i = 1; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25,7,9,13,3};
        insertionsort.tampil(A);
        insertionsort.insertionSort(A);
        insertionsort.tampil(A);
        
        System.out.println();
        System.out.println("Muhamad Sahrul Syabani");
    }
}