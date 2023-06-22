import java.util.Scanner;
public class RotationOfAnArrayByDPlaces {
    static void leftRotation(int[] arr)
    {
        int initial_element = arr[0];
        for(int i = 0; i < arr.length-1; i++)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = initial_element;
    }
    static void printArray(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int d = sc.nextInt();
        for(int i = 0; i < d%7; i++)
        {
            leftRotation(arr);
        }
        printArray(arr);
    }
}
