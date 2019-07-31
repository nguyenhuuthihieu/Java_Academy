/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author NguyenHieu
 */
public class Bai4_InsertArray {
    public static void insertArray(int arr[], int count, int x){
        int i = 0;
        for(i = count-1; i >= 0; i --){
            if(arr[i] > x){
                arr[i+1] = arr[i];
            }
            else break;
        }
        arr[i+1]= x;
        for(int j = 0; j < 4; j ++){
            System.out.println(arr[j]);
        }
    }
    public static void insertWhile(int arr[], int count, int x){
        int index = count - 1;
        while(index >= 0){
            if(arr[index] > x){
                arr[index+1] = arr[index];
                index --;
            }
            else break;
        }
        arr[index+1] = x;
        for(int j = 0; j < count + 1; j ++){
            System.out.println(arr[j]);
        }
    }
    public static void insertWhile2(int arr[], int count , int x){
        int index = count - 1;
        while(arr[index] > x){
            arr[index+1] = arr[index];
            index --;
            if(index == -1) break;
        }
        arr[index+1] = x;
        for(int j = 0; j < count+1; j ++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] a){
        int arr[] = {10,20,30,0,0,0,0,0,0,0,0};
//        insertArray(arr, 3, 10);
        System.out.println("------------------");
//        insertWhile(arr, 3, 35);
        System.out.println("----------------------");
        insertWhile2(arr, 3, 2);
    }
}
