/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4_Homework;

import java.util.Arrays;

/**
 *
 * @author NguyenHieu
 */
public class Mark {
    public void mark(char arr[][], char[] key){
        int[] mark = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
            int count = 0;
            int j = 0;
            while(j < key.length){
                if(arr[i][j] == (key[j]))
                    count++;
                j++;
            }
            mark[i] = count;
        }
        System.out.println(Arrays.toString(mark));
    }
    public static void main(String[] args) {
        char[][] arr = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}
        };
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        Mark mark = new Mark();
        mark.mark(arr, key);
    }
}
