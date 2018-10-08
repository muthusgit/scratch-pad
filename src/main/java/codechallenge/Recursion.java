package codechallenge;

/**
 * Created by muthu on 21/09/2017.
 */
public class Recursion {

    private static int sumWithLoop(int n) {
        int sum = 0;
        for(int i = 1; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }

    private static int sumWithTraditionalRecursion(int n) {
        if(0 == n) {
            return n;
        } else {
            return n + sumWithTraditionalRecursion(n-1);
        }
    }

    private static int sumWithTailRecursion(int n, int sum) {
        if(0 == n) {
            return sum;
        } else {
            return sumWithTailRecursion(n-1, sum + n);
        }
    }



}
