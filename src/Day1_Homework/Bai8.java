/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1_Homework;

import static Day1_Homework.Bai7.SoLanXuatHien;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NguyenHieu
 */
public class Bai8 {
    public void SapXepTangDan ( float arr[])
    {
        for( int i = 1; i < arr.length; i ++ )
        {
            for ( int j = 0; j < i; j ++ )
            {
                if( arr[i] < arr[j])
                {
                    float a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang dan : ");
        for (int i = 0; i < arr.length; i ++)
        {
            System.out.print( arr[i] + ", ");
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
        Bai8 test = new Bai8();
        test.SapXepTangDan(array);
    }
}
