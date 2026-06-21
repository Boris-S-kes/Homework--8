import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] star = new int[]{1, 2, 3};
        double[] work = {1.57, 7.654, 9.986};
        int[] numbers = new int[5];

        System.out.println(" track2");

        for (int i = 0; i < star.length; i++) {
            if (i == star.length - 1) {
                System.out.print(star[i]);
            } else {
                System.out.print(star[i] + ",");
            }
        }
        System.out.println();


        for (int s = 0; s < work.length; s++) {
            if (s == work.length - 1) {
                System.out.print(work[s]);
            } else {
                System.out.print(work[s] + ",");
            }
        }
        System.out.println();

        for (int e = 0; e < numbers.length; e++) {
            if (e == numbers.length - 1) {
                System.out.print(numbers[e]);
            }
        }
            System.out.println();


            System.out.println(" track 3");



        for (int w = star.length - 1; w >= 0; w--) {
            if (w == 0) {
                System.out.print(star[w]);
            } else {
                System.out.print(star[w] + " , ");
            }
        }
        System.out.println();

        for (int s = work.length - 1; s >= 0; s--) {
            if (s == 0) {
                System.out.print(work[s]);
            } else {
                System.out.print(work[s] + " , ");
            }
        }
        System.out.println();

        for (int z = numbers.length - 1; z >= 0; z--) {
            if (z == 0) {
                System.out.print(numbers[z]);
            } else {
                System.out.print(numbers[z] + ",");
            }
        }

        System.out.println();


        System.out.println(" track 4");



        int[] arr = new int[]{1, 2, 3};
            for (int r = 0; r < arr.length; r++) {
                arr[r] = r + 1;
                if (arr[r] % 2 != 0) {
                    arr[r] += 1;
                }
            }

                    System.out.println(Arrays.toString(arr));

                }
            }

