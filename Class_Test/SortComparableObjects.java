import java.math.*;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {
            new BigInteger("2323"), new BigInteger("23"), new BigInteger("849")};
        Arrays.sort(hugeNumbers);
        for (BigInteger num : hugeNumbers) {
            System.out.print(num + " ");
        }
    }
}
// Atlanta Boston Savannah Tampa
// 23 849 2323
