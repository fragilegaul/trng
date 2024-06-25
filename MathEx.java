import java.util.stream.LongStream;

public class MathEx {
    public static long factorialNoLoopNoRec(int a) {
        return LongStream.rangeClosed(1, a)
                        .reduce(1, (long b, long c) -> b * c);
    }

    public static void main(String[] args) {
        double sr1 = Math.sqrt(100);
        System.out.println(sr1);

        double sr2 = Math.sqrt(10);
        System.out.printf("%.0f", sr2);

        System.out.println();

        double sr3 = Math.exp(3);
        System.out.println(sr3);

        double sr4 = Math.log(6);
        System.out.println(sr4);

        System.out.println(factorialNoLoopNoRec(5));

    }
}
