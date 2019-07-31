/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.io.IOException;

/**
 *
 * @author NguyenHieu
 */
public class Bai2_Array {
    public void max(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);
    }
    public void maxAndPosition(int arr[]){
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Gia tri lon nhat la: " + max +" tai vi tri dau tien " + index);
    }
    public void maxAndPositions(int arr[]){
        boolean check[] = new boolean[arr.length];
        int max = arr[0];
        check[0] = true;
        for (int i = 1; i < arr.length; i ++){
            if(arr[i] > max){
                check = new boolean[arr.length];
                max = arr[i];
                check[i] = true;
            }
            if(arr[i] == max){
                check[i] = true;
            }
        }
        System.out.print("Gia tri lon nhat la: " + max + " tai cac vi tri ");
        int tmp = 0;
        for( int i = 0; i < arr.length; i ++){
            if(check[i] && tmp > 0){
                System.out.print(",");
                System.out.print(i);
            }
            if(check[i] && tmp == 0){
                System.out.print(i);
                tmp++;
            }
            if(i == arr.length - 1){
                System.out.println(".");
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        int[] test = {7,100,90,70,100,80,40,100,60,100};
        Bai2_Array test2 = new Bai2_Array();
        test2.max(test);
        test2.maxAndPosition(test);
        test2.maxAndPositions(test);
    }
}
