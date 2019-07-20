/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;
import java.io.*;

/**
 *
 * @author NguyenHieu
 */
public class Bai5 {
    public void PhanLoai (char loai)
    {
        switch (loai)
        {
            case 'A':
                System.out.println("Xuat sac");
                break;
            case 'B':
            case 'C':
                System.out.println("Tot");
                break;
            case 'D':
                System.out.println("Dat");
                break;
            default:
                System.out.println("Kem");
                break;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap Loai : ");
        String s = inStream.readLine();
        char si = s.charAt(0);
        Bai5 test = new Bai5();
        test.PhanLoai (si);
    }
}
