
// Problem 12 -> SumofDigits

public class SumofDigits {

    public int sumOfdigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
    public void digitSum(int n) {
        if (n < 1) {
            return;
        }
        int result = 0;
        for (int i = 1; i <= n; ++i) {
            result += sumOfdigit(i);
        }
        System.out.println("\n Given (1 to " + n + ")");
        System.out.println(" Result : " + result);
    }
    public static void main(String[] args) {
        SumofDigits sum = new SumofDigits();
        sum.digitSum(256);
    }
}
