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
public class Bai6 {
    public static void PhanTuXuatHien2Lan( float arr[])
    {
        int check[] = new int[arr.length];
        boolean check2[] = new boolean[arr.length];
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
                    check2[j] = true;
                }
            }
        }
        System.out.print("Cac phan tu xuat hien dung 2 lan la: ");
        for (int i = 0; i < arr.length; i ++)
        {
            if (check[i] == 1 && check2[i] == false)
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
        PhanTuXuatHien2Lan(array);
    }
}
