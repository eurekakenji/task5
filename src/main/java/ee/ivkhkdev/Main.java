package ee.ivkhkdev;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 5
        int[][] jagarr = new int[5][];
        jagarr[0] = new int[3];
        jagarr[1] = new int[5];
        jagarr[2] = new int[7];
        jagarr[3] = new int[8];
        jagarr[4] = new int[9];
        Random ran = new Random();
        for (int x = 0; x < jagarr.length; x++) {
            for (int y = 0; y < jagarr[x].length; y++) {
                jagarr[x][y] = ran.nextInt(51) + 50;
            }
        }
        System.out.println("unsorted: ");
        for (int j = 0; j < jagarr.length; j++) {
            for (int y = 0; y < jagarr[j].length; y++)
                System.out.print(jagarr[j][y] + " ");
            System.out.println();
        }
        System.out.println("sorted: ");
        System.out.println();
        for (int i = 0; i < jagarr.length; i++) {
            Arrays.sort(jagarr[i]);

        }
    }
}