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
public class selectionsort {
    public static void selectionSort(int A[]){
        int indexterkecil;
        int pass, j, n = A.length;
        int temp;
        
        for(pass = 0; pass < n-1; pass++){
            indexterkecil = pass;
             
            for (j = pass + 1; j < n; j++){
                if (A[j]<A[indexterkecil]){
                    indexterkecil = j;
                }
            }
            temp = A[pass];
            A[pass] = A[indexterkecil];
            A[indexterkecil] = temp;
            
        }
    }
    
    public static void tampil(int data[]){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {25,7,9,13,3};
        selectionsort.tampil(A);
        selectionsort.selectionSort(A);
        selectionsort.tampil(A);
        
        System.out.println("");
        System.out.println("Muhamad Sahrul Syabani");
    }
}
