import java.util.*;
public class ex_6_5 {
    static int[] suffle(int arr[])
    {
        int temp = 0, rannum = 0;
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++) copy[i] = arr[i];
        for(int i = 0; i < arr.length; i++)
        {
            rannum = (int)(Math.random() * 8);
            temp = copy[i];
            copy[i] = copy[rannum];
            copy[rannum] = temp;
        }
        return copy;
    }

    public static void main(String[] args)
    {
        int[] origin = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(origin));

        int[] result = suffle(origin);
        System.out.println(java.util.Arrays.toString(result));
    }
}
