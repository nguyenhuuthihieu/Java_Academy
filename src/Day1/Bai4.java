package Day1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NguyenHieu
 */
public class Bai4 {
    public static void XepLoai(int TongDiem)
    {
        if(TongDiem < 0)
        {
            System.out.println("Khong hop le");
        }
        else if(TongDiem < 50)
        {
            System.out.println("Truot");
        }
        else if (TongDiem < 60)
        {
            System.out.println("Loai D");
        }
        else if (TongDiem < 70)
        {
            System.out.println("Loai C");
        }
        else if (TongDiem < 80)
        {
            System.out.println("Loai B");
        }
        else if (TongDiem < 90)
        {
            System.out.println("Loai A");
        }
        else if (TongDiem <= 100)
        {
            System.out.println("Loai A+");
        }
        else
        {
            System.out.println("Khong hop le");
        }
    }
    public static void main(String[] a) throws IOException
    {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap tong diem : ");
        String tongdiem = inStream.readLine();
	int TongDiem = Integer.parseInt(tongdiem);
        XepLoai (TongDiem);
    }
}
