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
        int indexRow = 1, indexCol = 1;
        for ( int i = 0; i < arr.length; i ++ )
        {
            for (int j = 0; j < arr[i].length; j ++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[j][i];
                    indexRow = i+1;
                    indexCol = j+1;
                }
            }
        }
        System.out.println("Gia tri lon nhat la : " + max + " tai dong " + indexRow + " cot " + indexCol);
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
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        int row, col;
        do{
            System.out.print("Nhap so dong : ");
            String siRow = inStream.readLine();
            row = Integer.parseInt(siRow);
        }
        while(row < 0);
        do{
            System.out.print("Nhap so cot : ");
            String siCol = inStream.readLine();
            col = Integer.parseInt(siCol);
        }
        while( col < 0 );
        int array[][] = new int[row][col];
        for ( int i = 0; i < row; i ++ )
        {
            System.out.println("Nhap phan tu dong thu "+ (i+1) + " : ");
            for( int j = 0; j < col; j ++ )
            {
                do{
                    System.out.print("Nhap phan tu thu " + (j+1) + " : ");
                    String siNumber = inStream.readLine();
                    array[i][j] = Integer.parseInt(siNumber);        
                }
                while (array[i][j] <= 0 || array[i][j] >= 100);
            }
           
        }
        Bai9_Array test = new Bai9_Array();
        test.maxMatric(array);
        test.sapXepTangDan(array, col);
        test.timSoNguyenTo(array);
    }
}
