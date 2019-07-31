/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author NguyenHieu
 */
public class Bai3_BubleSort {
    public void bubleSort (int[] arr, int index){
        if(index == arr.length){
            return;
        }
        for(int i = arr.length - 1; i > 0; i --){
            if(arr[i] < arr[i-1]){
                int tmp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = tmp;
            }
        }
        bubleSort(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {20,7,15,6,10,4,9};
        Bai3_BubleSort test = new Bai3_BubleSort();
        test.bubleSort(arr, 0);
        for(int i = 0;i < arr.length; i ++){
            System.out.print(arr[i]+", ");
        }
    }
}

