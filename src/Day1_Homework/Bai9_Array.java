/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1_Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.sqrt;

/**
 *
 * @author NguyenHieu
 */
public class Bai9_Array {
    public void maxMatric (int arr[][])
    {
        int max = arr[0][0];
        int tmp[][] = new int[arr.length*arr[0].length][2];
        int cols[] = new int[arr[0].length]; 
        int colMax[] = new int[arr[0].length]; 
        int count = 0, countCol = 0;
        int index = 0;
        int maxOld = arr[0][0];
        for ( int i = 0; i < arr[0].length; i ++ )
        {
            index = 0;
            int c = 0;
            for (int j = 0; j < arr.length; j ++)
            {
                if(arr[j][i] > max)
                {
                    index = 0;
                    tmp[index][0] = i;
                    tmp[index][1] = j;
                    max = arr[j][i];
                    c = 0;
                    index++;
                }else if(arr[j][i] == max){
                    tmp[index][0] = i;
                    tmp[index][1] = j;
                    c++;
                    index++;
                } 
            }
            if(max > maxOld){
                countCol = 0;
                cols[countCol] = i;
                colMax[countCol] = index;
                maxOld = max;
                countCol ++;
            }else if(max == maxOld){
                cols[countCol] = i;
                colMax[countCol] = index;
                maxOld = max;
                countCol ++;
            }
        }
        System.out.println("Max: " +max +" tai dong va cot tuong ung");
        for (int j = 0; j < countCol; j ++)
        {
            System.out.print("{"+cols[j]+" ,"+colMax[j] + "} ,");
        }
        System.out.println("");
        
        
    }
    
    public boolean kiemTraSoNguyenTo (int x)
    {
        if(x == 1){
            return false;
        }
        else if(x < 4)
        {
            return true;
        }
        else
        {
            for( int i = 2; i <= sqrt(x); i ++)
            {
                if(x%i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    
    public void timSoNguyenTo(int arr[][])
    {
        System.out.println("Cac so nguyen to trong ma tran");
        for (int i = 0; i < arr.length; i ++)
        {
            for (int j = 0; j < arr[i].length; j ++)
            {
                if(kiemTraSoNguyenTo(arr[i][j]))
                {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
    }
    
    public void sapXepTangDan(int arr[][], int col)
    {
        System.out.println("Ma tran truoc khi sap xep tang dan theo cot");
        for (int i = 0; i < arr.length; i ++)
        {
            for (int j = 0; j < arr[i].length; j ++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < col; i ++)
        {
            for( int j = 1; j < arr.length; j ++ )
            {
                for ( int k = 0; k < j; k ++ )
                {
                    if( arr[j][i] < arr[k][i])
                    {
                        int a = arr[j][i];
                        arr[j][i] = arr[k][i];
                        arr[k][i] = a;
                    }
                }
            }
        }
        System.out.println("Ma tran sau khi sap xep tang dan theo cot");
        for (int i = 0; i < arr.length; i ++)
        {
            for (int j = 0; j < arr[i].length; j ++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) throws IOException
    {
        int t[][] = {{20,10,9,4,7,2,3},{20,10,9,4,7,2,3},{20,10,9,4,7,20,3}};
        Bai9_Array test = new Bai9_Array();
        test.maxMatric(t);
        test.sapXepTangDan(t, 2);
        test.timSoNguyenTo(t);
    }
}
