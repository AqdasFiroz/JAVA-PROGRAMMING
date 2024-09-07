
public class binaryToDecimal{
    public static void convertingToDecimal(int bin) {
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int lastdigit = bin % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            bin = bin / 10;
            pow++;
        }
        System.out.print("decimal no. of "+bin+ " is " + dec);
    }

    public static void main(String[] args) {
        convertingToDecimal(100101 );
    }
}
