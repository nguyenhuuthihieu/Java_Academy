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
public class Bai5_MergeArray {
    public int findPosition(int a[], int x, int index){
        for( int i = index; i < a.length; i ++){
            if(a[i] > x){
                return i;
            }
        }
        return a.length;
    }
    public void ghepDoan( int a1[], int a2[]){ // ghep theo doan
        int arr[] = new int[a1.length+a2.length];
        int indexOld1 = 0; 
        int indexOld2 = 0;
        int index = 0;
        do{
            int indexNew2 = indexOld2, indexNew1 = indexOld1;
            if(indexOld1 == a1.length){
                indexNew2 = a2.length;
            }else if(indexOld2 < a2.length){
                indexNew2 = findPosition(a2, a1[indexOld1], indexOld2);
            }
            if(indexOld1 < a1.length){
                indexNew1 = findPosition(a1, a2[indexOld2], indexOld1);
            }else if(indexOld2 == a2.length){
                indexNew1 = a1.length;
            }
            
            for(int i = indexOld1; i < indexNew1; i ++){
                arr[index] = a1[i];
                index ++;
                indexOld1 = indexNew1;
            }
            for(int i = indexOld2; i < indexNew2; i ++){
                arr[index] = a2[i];
                index ++;
                indexOld2 = indexNew2;
            }
        } while(index < arr.length);
        System.out.println("Sap xep ghep doan");
        for(int i = 0; i < arr.length; i ++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public void ghepTungPhanTu(int a1[], int a2[]){
        int length1 = a1.length;
        int length2 = a2.length;
        int arr[] = new int[length1 + length2];
        int index1 = 0; 
        int index2 = 0;
        int index = 0;
        while(index < length1 + length2){
            if(index2 == length2 && index1 < length1){
                arr[index] = a1[index1];
                index1 ++;
                index ++;
            }else if(index1 == length1 && index2 < length2){
                arr[index] = a2[index2];
                index2 ++;
                index ++;
            }else{
                if(a1[index1] > a2[index2]){
                    arr[index] = a2[index2];
                    index2 ++;
                    index ++;
                }else{
                    arr[index] = a1[index1];
                    index1 ++;
                    index ++;
                }
            }
        }
        System.out.println("Sap xep ghep tung phan tu");
        for(int i = 0; i < arr.length; i ++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] a){
        int a1[] = {-2, 5, 6, 8, 9};
        int a2[] = {-1, 0, 7, 11};
        Bai5_MergeArray test  = new Bai5_MergeArray();
        test.ghepDoan(a1, a2);
        test.ghepTungPhanTu(a1, a2);
    }
}
