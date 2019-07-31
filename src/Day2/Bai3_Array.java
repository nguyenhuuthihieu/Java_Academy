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
public class Bai3_Array {
    public boolean kiemTraSapXep(int arr[]){
        for(int i = 1; i < arr.length; i ++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] a){
        int arr[] = {1, 2, 2, 4};
        Bai3_Array test = new Bai3_Array();
        boolean t = test.kiemTraSapXep(arr);
        if(t){
            System.out.println("Day tang dan");
        }else{
            System.out.println("Day khong tang dan");
        }
    }
}
