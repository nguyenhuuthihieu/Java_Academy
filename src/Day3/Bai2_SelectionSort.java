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
public class Bai2_SelectionSort {
    public int findMin( int arr[], int index){
        int i = index;
        for(int j = index+1; j <arr.length; j ++){
            if(arr[j] < arr[i]){
                i = j;
            }
        }
        return i;
    }
    public  void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i ++){
            int index = findMin(arr, i);
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+" ,");
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,7,15,6,10,4,9};
        Bai2_SelectionSort test = new Bai2_SelectionSort();
        test.selectionSort(arr);
    }
}
