import java.util.Arrays;

public class altProduct {

    public int altProduct(int[] arr) {
        Arrays.sort(arr);

        int i = 0, j = arr.length - 1;
        int product = 0;

        while (i < j) {
            product += arr[i] * arr[j];
            i++;
            j--;
        }

        return product;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 6, 7, 3, 4, 2, 0};

        altProduct obj = new altProduct();
        System.out.println(obj.altProduct(arr));
    }
} 
