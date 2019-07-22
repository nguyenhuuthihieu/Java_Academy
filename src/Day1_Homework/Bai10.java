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
public class Bai10 {
    public boolean KiemTraChu(char c)
    {
        if((c >= 'a' && c <= 'z') || 
                c >= 'A' && c <= 'Z')
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public void DemSoTu(String str)
    {
        int count = 0;
        if(KiemTraChu(str.charAt(0)))
        {
            count ++;
        }
        for (int i = 1; i < str.length(); i ++)
        {
            if(str.charAt(i-1) == ' ' && KiemTraChu(str.charAt(i)))
            {
                count ++;
            }
        }
        System.out.println("So tu trong chuoi la: " + count);
    }
    public static void main (String[] args) throws IOException
    {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap chuoi : ");
        String str = inStream.readLine();
        Bai10 test = new Bai10();
        test.DemSoTu(str);
    }
}
