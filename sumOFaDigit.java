public class sumOFaDigit {
    public static void digitSum(int n){
       int sum=0;
      while(n>0){
          int r=n%10;
          sum=sum+r;
          n=n/10;
      }
        System.out.println(sum);
    }
    public static void main(String[] args) {
     digitSum(357);
    }
}
