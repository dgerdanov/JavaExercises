public class Fib {
    public static void main(String[] args) {
        int n = 50;
        long[] fib = new long[n];
        long fib8 = fibFunction(50, fib);
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <n ; i++) {
            fib [i] = -1;

        }
        System.out.println(fib8);

    }

    public static long fibFunction(int numberInput, long [] fib) {
        if (fib[numberInput]!=-1) {
            return fib[numberInput];

        }
//        if (numberInput == 1) {
//            return 1;
//
//        }
//        if (numberInput == 0) {
//            return 0;
//
//        }
        long curr = fibFunction(numberInput - 1,fib);
        long prev = fibFunction(numberInput - 2,fib);
        long result = curr + prev;
        return result;
    }

}
