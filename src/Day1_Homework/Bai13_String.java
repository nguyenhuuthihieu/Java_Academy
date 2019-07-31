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
public class Bai13_String {
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
    public void findMaxLength(String str)
    {
        int start= 0; 
        int end = 0;
        int newStart = 0;
        int oldLength = 0;
        int count = 0;
        for (int i=0; i <= str.length(); i ++)
        {
            if(i == str.length() && count > oldLength){
                start = newStart;
                end = i - 1;
            }
            if(i < str.length()){
                if(str.charAt(i) == ' ')
                {
                    if (count > oldLength)
                    {
                        start = newStart;
                        end = i - 1;
                        oldLength = count;
                    }
                    count = 0;
                }
                if(kiemTraChu(str.charAt(i)))
                {
                    if(i > 0 && str.charAt(i-1) == ' '){
                        newStart = i;
                    }
                    count ++;
                }
            }
        }
        System.out.print("Tu co do dai lon nhat : ");
        for (int i = start; i <= end ; i ++)
        {
            System.out.print(str.charAt(i));
        }
    }
    public static void main (String[] args) throws IOException
    {
//        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Nhap chuoi : ");
//        String str = inStream.readLine();
        Bai13_String test = new Bai13_String();
        test.findMaxLength("  hoa   bo ngu hang hoang nhu abcdef a");
    }
}
