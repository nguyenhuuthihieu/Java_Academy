/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1_Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 *
 * @author NguyenHieu
 */
public class Bai12_String {
    public boolean kiemTraChu(char c)
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

    public void chuanHoaChuoi(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        StringBuffer sb=new StringBuffer(str);
        for(int i = 0; i < str.length(); i ++)
        {
            if(kiemTraChu(sb.charAt(0)))
            {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
            if (i > 0 && kiemTraChu(sb.charAt(i)) && str.charAt(i-1) == ' ')
            {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
            if (i > 0 && kiemTraChu(sb.charAt(i)) && str.charAt(i-1) != ' ')
            {
               sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        System.out.println("Chuoi sau khi chuan hoa: " + sb.toString());
    }
    public static void main (String[] args) throws IOException
    {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap chuoi : ");
        String str = inStream.readLine();
        Bai12_String test = new Bai12_String();
        test.chuanHoaChuoi(str);
    }
}
