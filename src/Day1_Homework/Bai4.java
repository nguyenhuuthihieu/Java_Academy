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
public class Bai4 {
    public static void PhanTuXuatHien1Lan( float arr[])
    {
        boolean check[] = new boolean[arr.length];
        for ( int i = 1; i < arr.length; i ++ )
        {
            for ( int j = 0; j < i; j ++ )
            {
                if ( arr[i] == arr[j] )
                {
                    check[j] = true;
                    check[i] = true;
                }
            }
        }
        System.out.print("Cac phan tu xuat hien mot lan la: ");
        for (int i = 0; i < arr.length; i ++)
        {
            if (check[i] == false)
            {
                System.out.print( arr[i] + ", ");
            }
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
        PhanTuXuatHien1Lan(array);
    }
}
