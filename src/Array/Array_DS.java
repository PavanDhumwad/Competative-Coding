package Array;

import java.util.Scanner;

public class Array_DS
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int x = 0; x < 6; x++){
            for (int y =0; y<6; y++){
                array[x][y] = sc.nextInt();
            }
        }
        int maxHourglass = Integer.MIN_VALUE;
        for (int x=0; x<4; x++){
            for (int y=0; y<4;y++){
                int hourres = getHourglass(array, x, y);
                if (hourres > maxHourglass){
                    maxHourglass = hourres;
                }
            }
        }
        System.out.println(maxHourglass);
    }

    public static int getHourglass(int[][] array, int x, int y) {
        return array[x][y] + array[x][y+1] + array[x][y+2] +
                array[x+1][y+1] +
                array[x+2][y] + array[x+2][y+1] + array[x+2][y+2];
    }
}
