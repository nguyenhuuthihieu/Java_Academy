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
public class Bai5_Array {
    public void phanTuDautien( float arr[], float x)
    {
        for ( int i = 1; i < arr.length; i ++ )
        {
            if( arr[i] == x )
            {
                System.out.println("Vi tri phan tu dau tien co gia tri bang " + x + " la: " + (i+1));
                return;
            }
        }
        System.out.println("-1");
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
        Bai5_Array test = new Bai5_Array();
        test.phanTuDautien(array,(float) 3.50);
    }
}
