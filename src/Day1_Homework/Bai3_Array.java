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
public class Bai3_Array {
    public void tichSoDuong(double  array[])
    {
        double tich = 1;
        int count = 0;
        for ( int i = 0; i < array.length; i ++ )
        {
            if ( array[i] > 0 )
            {
                tich *= array[i];
                count ++;
            }
        }
        if ( count > 0 )
        {
            System.out.println("Tich cac gia tri duong cua mang la : " + tich);
        }
        else
        {
            System.out.println("Khong co phan tu duong nao");
        }
    }
    public static void main (String[] args) throws IOException
    {
        double array[] = new double[10];
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < 10; i ++ )
        {
            System.out.println("Nhap mot so nguyen thu "+ (i+1) + " : ");
            String siNumber = inStream.readLine();
            array[i] = Double.parseDouble(siNumber);
        }
        Bai3_Array test = new Bai3_Array();
        test.tichSoDuong(array);
    }
}
