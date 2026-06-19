import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] star = new int[]{1, 2, 3};
        double[] work = {1.57, 7.654, 9.986};
        int[] numbers = new int[5];

        System.out.println(" track2");
        for (int i = 0; i < star.length; i++) {
            System.out.println(star[i]);
        }
        for (int b = 0; b < work.length; b++) {
            System.out.println(work[b]);
        }
        for (int c = 0; c < numbers.length; c++) {
            System.out.println(numbers[c]);
        }
        System.out.println(" track 3");
        for (int w = star.length - 1; w >= 0; w--) {
            if (w < star.length - 1) {
                System.out.println(" , ");
            }
            System.out.println(star[w]);
        }
        for (int s = work.length - 1; s >= 0; s--) {
            if (s < work.length - 1) {
                System.out.println(" , ");
            }
            System.out.println(work[s]);
        }
        for (int z = numbers.length - 1; z >= 0; z--) {
            if (z < numbers.length - 1) {
                System.out.println(",");
            }
            System.out.println(numbers[z]);
        }
        System.out.println(" track 4");
        for (int x = 0; x < star.length - 1; x++) {
            if (star[x] % 2 != 0) {
                star[x] += 1;
                System.out.println(star[x] + " , ");
            }
            for (int c = 0; c < work.length - 1; c++) {
                if (work[c] % 2 != 0) {
                    work[c] += 1;
                    System.out.println(work[c] + " ,");
                }
                for (int v = 0; v < numbers.length - 1; v++) {
                    if (numbers[v] % 2 != 0) {
                        numbers[v] += 1;
                        System.out.println(numbers[v] + ",");
                    }
                }
            }
        }
    }
}






