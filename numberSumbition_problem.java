package accenture_questions;

public class numberSumbition_problem {
    public static void main(String[] args) {
        String str="2,5,1,4,3,2,7,8",res="";
        String[] arr=str.split(",");
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            int x=Integer.parseInt(arr[i]);
            if(x==4) {
                while(i<arr.length) {
                    res+=arr[i];
                    int y = Integer.parseInt(arr[i]);
                    if (y == 7) break;
                    i++;
                }
            }
            else{
                sum+=x;
            }
        }
        System.out.println(res);
        System.out.println(sum);
        System.out.println(Integer.parseInt(res)+sum);
    }
}
