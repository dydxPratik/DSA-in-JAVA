public class LeftRotateAnArrayByOnePlace
{
    public static void leftRotation(int[] arr)
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
        int[] arr = {1,2,3,4,5};
        leftRotation(arr);
        leftRotation(arr);
        leftRotation(arr);
        leftRotation(arr);
        leftRotation(arr);
        printArray(arr);
    }
}