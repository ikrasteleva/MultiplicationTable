package MyPackage;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i, j, res;
        for (i = 1; i < 10; i++) {
            for (j =1; j < 10; j++)
            {
                res = i * j;
                System.out.println(i+"*"+j+"="+res);
            }
        }
    }
}
