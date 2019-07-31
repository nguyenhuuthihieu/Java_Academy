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
public class Bai1_Array {
    public void trungBinhCong(double  array[])
    {
        double sum = 0;
        int count = 0;
        for ( int i = 0; i < array.length; i ++ )
        {
            sum += array[i];
            count ++;
        }
        if ( count > 0 )
        {
            double tbc = sum/count;
            System.out.println("Trung binh cong cua mang la : " + tbc);
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
        Bai1_Array test = new Bai1_Array();
        test.trungBinhCong(array);
    }
}
