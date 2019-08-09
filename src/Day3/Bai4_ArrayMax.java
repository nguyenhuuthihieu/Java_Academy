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
public class Bai4_ArrayMax {
    
    // 1 doan
    public void FindArrayMax(int arr[]){
        int index = 0; 
        int count = 1;
        int length = 0;
        int id = 0;
        for(int i = 1; i < arr.length; i ++){
            if(arr[i] >= arr[i-1]){
                count ++;
                
            }else{
                if(count > length){
                    index = id;
                    length = count;
                }
                count = 1;
                id = i;
            }
        }
        if(count > length){
            index = id;
            length = count;
        }
        for(int i = index; i < index + length; i ++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }
    
    // nhieu doan
    public void FindArrays(int arr[]){
        int check[] = new int[arr.length];
        int lengthMax = 0;
        int index = 0;
        int count = 1;
        int start = 0;
        for(int i = 1; i < arr.length; i ++){
            if(arr[i] >= arr[i-1]){
                count ++; 
            }else{
                if(count > lengthMax){
                    check[0] = start;
                    index = 1;
                    lengthMax = count;
                }
                else if(count == lengthMax){
                    check[index] = start;
                    index ++;
                }
                count = 1;
                start = i;
            }
        }
        if(count == lengthMax){
            check[index] = start;
            index ++;
        }else if(count>lengthMax){
            check[0] = start;
            index = 1;
            lengthMax = count;
        }
        System.out.println("Cac day sap xep dai nhat la : ");
        for(int i = 0; i < index; i ++){
            for(int j = check[i]; j < check[i] + lengthMax; j ++){
                System.out.print( arr[j]+", ");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        int a[] = {1,5,9,10,11,9,1,2,3,4,5,6,1,5,7,8,9,10,1,2,4,1,2,3,4,6,7,8};
        Bai4_ArrayMax test = new Bai4_ArrayMax();
        test.FindArrayMax(a);
        test.FindArrays(a);
    }
    
//tim va in ra doan co cac phan tu tang dan dai nhat  
}
