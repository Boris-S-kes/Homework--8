import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] star = new int[]{1, 2, 3};
        double[] work = {1.57, 7.654, 9.986};
        int[] numbers = new int[5];

        System.out.println(" track2");
        for (int i = 0; i < star.length; i++) {
            System.out.print(star[i] + ",");

        }
        for (int b = 0; b < work.length; b++) {
            System.out.print(work[b] + ",");

        }
        for (int c = 0; c < numbers.length; c++) {
            System.out.print(numbers[c] + ",");
        }
        System.out.println();

        System.out.println(" track 3");
        for (int w = star.length - 1; w >= 0; w--) {
            System.out.print(star[w]);
            if (w >-1) {
                System.out.print(" , ");
            }

        }
        for (int s = work.length - 1; s >= 0; s--) {
            System.out.print(work[s]);
            if (s >-1) {
                System.out.print(" , ");
            }
        }
        for (int z = numbers.length - 1; z >= 0; z--) {
            System.out.print(numbers[z]);

            if (z > -1) {
                System.out.print(",");
            }

        }
        System.out.println();

        System.out.println(" track 4");
        int[] star2 = new int[]{1, 2, 3};
        for (int r = 0; r < star2.length; r++) {
            if (star2[r] % 2 != 0) {
                star2[r] += 1;

                System.out.println(star2[r]);


            }
        }
    }
}







