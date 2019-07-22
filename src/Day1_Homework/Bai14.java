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
public class Bai14 {
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
    public void ChuyenDoiTen(String str)
    {
        String ten , hodem;
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i --)
        {
            if(str.charAt(i - 1) == ' ' && KiemTraChu(str.charAt(i)))
            {
                index = i;
                break;
            }
        }
        ten = str.substring(index, str.length());
        hodem = str.substring(0, index-1);
        System.out.println(ten + " " + hodem);
    }
    public static void main (String[] args) throws IOException
    {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap chuoi : ");
        String str = inStream.readLine();
        Bai14 test = new Bai14();
        test.ChuyenDoiTen(str);
    }
}
