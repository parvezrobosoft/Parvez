package Firstevaluation;


import java.util.*;

public class SortArray {

    public static int[] frequencysorter(int[] array)
    {
        Map<Integer,Integer> count=new HashMap<>();
        int n=0;
        List<Integer> keyList =new ArrayList<>();
        List<Integer> countList =new ArrayList<>();


        List<Integer> sortedList =new ArrayList<>();
        int[] sortedArray=new int[array.length];



                for(int i:array)
                {
                    if (!count.containsKey(i))
                    {
                        count.put(i,1);
                        keyList.add(i);
                    }
                    else
                    {
                        count.replace(i,count.get(i)+1);
                    }
                }


        List<Integer> valueList =new ArrayList<>(count.values());

                valueList.stream().sorted();



        for (int i: keyList)
                {
                    for (int j=0;j<count.get(i);j++)
                    {
                        sortedList.add(i);
                    }

                }

                int j=0;
                for(int i:sortedList) {
                    sortedArray[j] = i;
                    j++;
                }

                return sortedArray;
    }

    public static void main(String[] args) {
        int[] array={12,3,1,9,4,12,9,7,8,12,9,4,8,8,2,3,8} ;

        System.out.println(Arrays.toString(frequencysorter(array)));




    }




}
