import java.util.Scanner;
public class Calculations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1st task:
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int minimum =Calculations.min(arr);
        System.out.println(minimum);

        2nd task:
        int n=input.nextInt();
        float[] arr= new float[n];
        for(int i-0;i<n;i++){
            arr[i]=input.nextFloat();
        }
        float average=Calculations.avg(arr);
        System.out.println(average);

        3rd task:
        int n=input.nextInt();
        boolean prime=Calculations.isPrime(n);
        System.out.println(prime);

        4th task:
        int n=input.nextInt();
        int fact=Calculations.factorial(n);
        System.out.println(fact);

        5th task:


        6th task:
        int a=input.nextInt();
        int n=input.nextInt();
        int pow=Calculations.power(a,n);
        System.out.println(pow);

        7th task:
        String str = input.next();
        Calculations.permutations(str);

        8th task:
        String s = input.next();
        boolean alldgs = Calculations.allDigitsAreString(s);
        System.out.println(alldgs);

        9th task:
        int n = input.nextInt();
        int k = input.nextInt();
        int coef = Calculations.binCoef(n,k);
        System.out.println(coef);

        10th task:
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = Calculations.gcd(a,b);
        System.out.println(ans);
    */
    }
    //1
    public static int minimum(int[] arr) {
        return minimum(arr, 0);
    }
    private static int minimum(int[] arr, int i) {

        if (i == arr.length - 2)
            return Math.min(arr[i], arr[i + 1]);
        if (arr[i] < arr[i + 1]) {
            arr[i + 1] = arr[i];
        }

        return minimum(arr, i + 1);
    }


    //2
    public static float average(float[] arr) {
        return average(arr, 0);
    }
    private static float average(float[] arr, int i) {
        if (i == (arr.length - 1)) {
            return (arr[i] / arr.length);
        }
        arr[i + 1] = arr[i] + arr[i + 1];
        return average(arr, i + 1);
    }

    //3
    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }
    private static boolean isPrime(int n, int i) {
        if (i == n / 2) {
            return n % i != 0;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }

    //4
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    //5




    //6
    public static int pow(int a, int n) {
        if (n <= 1) {
            return a;
        }
        return a * pow(a, n - 1);
    }


    //7
    public static void str(String input) {
        str(input, "");
    }
    public static void str(String input, String output)
    {
        if (input.isEmpty()) {
            System.out.println(output + "");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char item = input.charAt(i);
            String itemsLeft = input.substring(0, i) + input.substring(i + 1);
            str(itemsLeft, output + item);
        }
    }

    //8
    public static boolean alldgs(String s) {
        if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        }
        return alldgs(s.substring(0, s.length() / 2)) && alldgs(s.substring(s.length() / 2));
    }

    //9
    public static int binCoef(int n, int k) {
        if (k <= 0 || k == n) {
            return 1;
        }
        return binCoef(n-1, k-1) + binCoef(n-1, k);
    }

    //10
    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
