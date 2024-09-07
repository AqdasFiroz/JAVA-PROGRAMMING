public class decimalToBinary {
    public static void convertingToBinary(int dec){
        int pow=0;
        int decimal=dec;
        int bin=0;
        while(dec>0){
            int rem=dec%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            dec=dec/2;
            pow++;
        }
        System.out.print("The binary of decmial "+decimal+" is "+bin);
    }
    public static void main(String[] args) {
        convertingToBinary(37);

    }
}
