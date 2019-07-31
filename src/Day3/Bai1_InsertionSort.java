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
public class Bai1_InsertionSort {
    public static void sapXepChen(int arr[]){
        for(int i = 1; i < arr.length; i ++){
            int j = i - 1;
            int tmp = arr[i];
            for(j = i-1; j >= 0; j --){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                    
                }else break;
            }
            arr[j+1] = tmp;
            for(int k = 0; k < arr.length; k ++){
                System.out.print(" "+arr[k]);
            }
            System.out.println("");
        }
        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
    public static void sapXepWhile(int arr[]){
        int i = 0;
        while(++i < arr.length){
            int tmp = arr[i];
            int j = i-1;
            while(arr[j] > tmp){
                arr[j+1] = arr[j];
                j --;
                if(j == -1) break;
            }
            arr[j+1] = tmp;
        }
        for(int j = 0; j < arr.length; j ++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,7,15,6,10,4,9};
        sapXepWhile(arr);
    }
    
}
