package Day1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NguyenHieu
 */
import java.io.*;

public class Bai2 {
   
    public void CanBien(int iNumber1, int iNumber2, int iNumber3)
    {
        int max = iNumber1;
        int i = 1;
        if (max < iNumber2)
        {
            max = iNumber2;
            i = 2;
        }
        if (max < iNumber3)
        {
            max = iNumber3;
            i = 3;
        }
        System.out.println("Dung them bien ---------------------");
        System.out.println("So nguyen thu " + i + " lon nhat co gia tri la : " + max);
    }
    public void KhongCanBien(int iNumber1, int iNumber2, int iNumber3)
    {
        System.out.println("Khong dung them bien ---------------------");
        if (iNumber1 < iNumber2)
        {
            if (iNumber2 < iNumber3)
            {
                System.out.println("So nguyen thu 3 lon nhat co gia tri la : " + iNumber3);
            }
            else
            {
                System.out.println("So nguyen thu 2 lon nhat co gia tri la : " + iNumber2);
            }
        }
        else 
        {
            if (iNumber1 < iNumber3)
            {
                System.out.println("So nguyen thu 3 lon nhat co gia tri la : " + iNumber3);
            }
            else
            {
                System.out.println("So nguyen thu 1 lon nhat co gia tri la : " + iNumber1);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap mot so nguyen thu 1 : ");
        String siNumber1 = inStream.readLine();
	int iNumber1 = Integer.parseInt(siNumber1);
        System.out.println("Nhap mot so nguyen thu 2 : ");
        String siNumber2 = inStream.readLine();
	int iNumber2 = Integer.parseInt(siNumber2);
        System.out.println("Nhap mot so nguyen thu 3 : ");
        String siNumber3 = inStream.readLine();
	int iNumber3 = Integer.parseInt(siNumber3);
        Bai2 bai = new Bai2();
        bai.CanBien(iNumber1, iNumber2, iNumber3);
        bai.KhongCanBien(iNumber1, iNumber2, iNumber3);
    }
}
