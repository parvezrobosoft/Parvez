package Firstevaluation;

public class SumOfSubArray {
    public static String arraySum(int[] array,int fromIndex)
    {
        int[] subArray;
        int sum=0;
        int n=fromIndex+4;


        for(int i=fromIndex;i<n;i++)
        {
                sum+=array[i];
        }
        return "Sum of elements from index "+fromIndex+" to "+(fromIndex+3)+" = "+sum;
    }

    public static void main(String[] args) {

        int[] array={
        12, 3, 1, 9, 4, 12, 9, 7, 8, 12, 9, 4, 8, 8, 2, 3, 8};

        int fromIndex=1;

        System.out.println(arraySum(array,fromIndex));


    }
}
