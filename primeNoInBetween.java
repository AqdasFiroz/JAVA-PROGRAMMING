public class primeNoInBetween {
    /*public static int prime(int a,int b) {
        boolean isPrime = true;
        if(a==0 && b==3){
            System.out.println("1 2");
        }
        for(int j=a;j<b;j++){
            for (int i = 2; i < a; i++) {
                if (j % i == 0) {
                    isPrime = false;
                }
                if (isPrime == true) {
                    System.out.println(j);
                }
            }
        }
    return 1;
    }*/
    /*public static int prime(int a) {
        boolean isPrime = true;
        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                isPrime = false;
            }

        }
        if (isPrime = true) {
            return a;
        }
        return 1;
    }*/
    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void primeInBetween(int a,int b){
        for(int i=a;i<b;i++){
            if(prime(i)==true){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        primeInBetween(9,20);
    }
}
