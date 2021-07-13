import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeNumbers {

    static ArrayList<Integer> primes = new ArrayList<>();
    static ArrayList<Integer>primePalins = new ArrayList<>();

    public Boolean primeNumbers(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    static void updateFreq(int n, int[] freq) {

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
    }


    static boolean isAnagram(int num, int num1) {
        int[] freq1 = new int[10];
        int[] freq2 = new int[10];
        updateFreq(num,freq1);
        updateFreq(num1,freq2);
        for (int i = 0; i < 10; i++)
        {
            if (freq1[i] != freq2[i])
                return false;
        }
        return true;
    }

    public static Boolean  isPalindrome(int num1,int num2){
        int temp=0;
        while(num1>0){
            temp=temp*10+num1%10;
            num1=num1/10;
        }
        if(temp==num2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number upto which you want prime numbers");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        for (int i = 2; i < range; i++) {
            if (primeNumbers.primeNumbers(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
        System.out.println("The number of primes are " + primes.size());
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {

                if (isAnagram(primes.get(i), primes.get(j)) && isPalindrome(primes.get(i), primes.get(j))){
                    primePalins.add(primes.get(i));
                    primePalins.add(primes.get(j));

                }
            }
        }

        System.out.println(primePalins);
    }

}
