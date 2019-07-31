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
public class Bai2_Array {
    public static void lietKePhanTuAm (double array[])
    {
        System.out.println("Cac phan tu am trong mang la : ");
        for ( int i = 0; i < array.length; i ++ )
        {
            if (array[i] < 0)
            {
                System.out.print( array[i] + ", ");
            }
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
        lietKePhanTuAm(array);
    }
}
