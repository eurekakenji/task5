package ee.ivkhkdev;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

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
        for (int[] nums : jagarr) {
            for (int y = 0; y < nums.length; y++)
                System.out.print(nums[y] + " ");
            System.out.println();
        }
        System.out.println("sorted: ");
        for (int[] nums : jagarr) {
            Arrays.sort(nums);
            System.out.print(nums[0] + " ");

        }
    }
}