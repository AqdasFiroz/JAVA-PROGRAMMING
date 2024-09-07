package accenture_questions;

import java.util.ArrayList;

public class findCount {
    public static int[] find_Count(int[] arr,int num,int diff){
        ArrayList<Integer> newArr=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(Math.abs(arr[i]-num)<=diff){
                newArr.add(arr[i]);
            }
        }
        int[] a=new int[newArr.size()];
        for(int i=0;i<a.length;i++){
            a[i]=newArr.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a={12 ,3 ,14, 56 ,77 ,13};
        int[] print=find_Count(a,13,2);
        for(int i=0;i<a.length;i++){
            System.out.println(print[i]);
        }
    }
}
