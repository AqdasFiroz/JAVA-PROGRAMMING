public class pattern {
    public static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                int temp=i+j;
                if(temp%2==0){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }

            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=1;i<=n;i++){
            //front spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=1;i<=n;i++){
            //front-spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1||j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //end-spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            //star-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern5(int r,int c){
        int t=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(t+"   ");
                t++;
            }
            System.out.println();
        }
    }
    public static void pattern6(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                int temp=i+j;
                if(temp%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
    public static void pattern4(int r,int c){
        for(int i=0;i<=r;i++){
            for(int j=1;j<=c-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern3(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        //pattern3(4,4);
        //pattern4(5,5);
        //pattern5(5,5);
        //pattern6(5,5);
        //pattern7(4);
        //pattern8(5);
        //pattern9(5);
        //pattern10(4);
        pattern11(5);
        /*char ch='A';
        for(int i=5;i!=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(ch);
                ch++;

            }
            System.out.print("\n");
        }*/
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1||i==4||j==5){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }
}
