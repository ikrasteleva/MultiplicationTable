package MyPackage;

public class FindMinimumValue {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        long c= 12345;
        long d=-3564;
        double e = 0.25;
        double f = -1.3;
        int minInt;
        long minLong;
        double minDouble;

        minInt = getMinValue(a, b);
        System.out.println("Minimum integer is:" + minInt);

        minLong = getMinValue(c, d);
        System.out.println("Minimum long is:" + minLong);

        minDouble = getMinValue(e, f);
        System.out.println("Minimum double is:" + minDouble);
    }

    static int getMinValue (int x, int y){
       if (x < y) {
           return x;
       }
       else return y;
    }

    static long getMinValue (long x, long y){
        if (x < y) {
            return x;
        }
        else return y;
    }

    static double getMinValue (double x, double y){
        if (x < y) {
            return x;
        }
        else return y;
    }
}
