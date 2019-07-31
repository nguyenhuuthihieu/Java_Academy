/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1_Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NguyenHieu
 */
public class Bai7_Array {
    public static void soLanXuatHien( float arr[])
    {
        int check[] = new int[arr.length];
        for ( int i = 1; i < arr.length; i ++ )
        {
            int count = 0;
            for ( int j = 0; j < i; j ++ )
            {
                if ( arr[i] == arr[j] )
                {
                    count ++;
                    check[j] ++;
                    check[i] = check[j];
                }
            }
        }
        System.out.print("So lan xuat hien cua cac phan tu lan luot la: ");
        for (int i = 0; i < arr.length; i ++)
        {
            System.out.println(check[i] + ", ");
        }
    }
    public static void main (String[] args) throws IOException
    {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap so phan tu trong day : ");
        String siNum = inStream.readLine();
        int n = Integer.parseInt(siNum);
        float array[] = new float[n];
        for ( int i = 0; i < n; i ++ )
        {
            System.out.println("Nhap mot so nguyen thu "+ (i+1) + " : ");
            String siNumber = inStream.readLine();
            array[i] = Float.parseFloat(siNumber);
        }
        soLanXuatHien(array);
    }
}
