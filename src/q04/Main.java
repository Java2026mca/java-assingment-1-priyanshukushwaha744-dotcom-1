import java.util.*;
public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean prime = isPrime(num);
            boolean perfect = isPerfect(num);
            if (prime && perfect) {
                System.out.println("Both");
            } else if (prime) {
                System.out.println("Prime");
            } else if (perfect) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
        // TODO: Read n integers. For each number print:
        //   "Prime"     if it is prime
        //   "Perfect"   if it is a perfect number (sum of proper divisors == itself, e.g. 6=1+2+3)
        //   "Both"      if it is both (there are none < 100, but handle it)
        //   "Neither"   otherwise
        //
        // Input:
        // 4
        // 6 13 8 28
        //
        // Output:
        // Perfect
        // Prime
        // Neither
        // Perfect

    }
}
