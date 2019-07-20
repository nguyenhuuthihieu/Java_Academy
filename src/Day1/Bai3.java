package Day1;




import java.io.*;
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NguyenHieu
 */
public class Bai3 {
    public static void GiaiPTB2 (int a, int b, int c)
    {
        int delta = b*b - 4*a*c;
        if(delta < 0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta == 0)
        {
            float x = -2*a/b;
            System.out.println("Phuong trinh co mot nghiem duy nhat" + x);
        }
        else
        {
            float x1 = (float)(-b+sqrt(delta))/(2*a);
            float x2 = (float)(-b-sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co hai nghiem phan biet");
            System.out.println("Nghiem 1 : " + x1);
            System.out.println("Nghiem 2 : " + x2);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap a : ");
        String siNumber1 = inStream.readLine();
	int iNumber1 = Integer.parseInt(siNumber1);
        System.out.print("Nhap b : ");
        String siNumber2 = inStream.readLine();
	int iNumber2 = Integer.parseInt(siNumber2);
        System.out.print("Nhap c : ");
        String siNumber3 = inStream.readLine();
	int iNumber3 = Integer.parseInt(siNumber3);
        GiaiPTB2 (iNumber1, iNumber2, iNumber3);
    }
}
