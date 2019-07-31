/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.sqrt;

/**
 *
 * @author NguyenHieu
 */
public class Bai1_SoNguyenTo {
    public boolean kiemTraSoNguyenTo(int x)
    {
        if(x == 1){
            return false;
        }
        else if(x < 4)
        {
            return true;
        }
        else
        {
            for( int i = 2; i <= sqrt(x); i ++)
            {
                if(x%i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        int number;
        do{
            System.out.print("Nhap so nguyen duong : ");
            String siNumber = inStream.readLine();
            number = Integer.parseInt(siNumber);
        }
        while(number < 0);
        
        Bai1_SoNguyenTo test = new Bai1_SoNguyenTo();
        if(test.kiemTraSoNguyenTo(number))
        {
            System.out.println(number+" la so nguyen to.");
        }
        else
        {
            System.out.println(number + " khong la so nguyen to.");
        }
    }
}
