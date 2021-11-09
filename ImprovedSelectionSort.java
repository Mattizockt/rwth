public class ImprovedSelectionSort {

    public static void sort(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {

            // returns smallest int, smallest int index
            int[] results_min = find_min_int(a, i);
            int min_int = results_min[0];
            int min_int_index = results_min[1];

            int min_temp = a[i];
            a[i] = min_int;
            a[min_int_index] = min_temp;

            // returns smallest int, smallest int index
            int[] results_max = find_max_int(a, i);
            int max_int = results_max[0];
            int max_int_index = results_max[1];

            int max_temp = a[a.length - 1 - i];
            a[a.length - i - 1] = max_int;
            a[max_int_index] = max_temp;

        }
    }

    // find highest element of array and its index
    static int[] find_max_int(int[] a, int search_start) {

        int max_int = Integer.MIN_VALUE;
        int max_int_index = Integer.MIN_VALUE;

        for (int x = a.length - search_start - 1; x >= 0; x--) {
            if (a[x] > max_int) {
                max_int = a[x];
                max_int_index = x;
            }
        }

        int[] results = new int[] { max_int, max_int_index };
        return results;
    }

    // find lowest element of array and its index
    static int[] find_min_int(int[] a, int search_start) {

        int min_int = Integer.MAX_VALUE;
        int min_int_index = Integer.MAX_VALUE;

        for (int x = 0 + search_start; x < a.length; x++) {
            if (a[x] < min_int) {
                min_int = a[x];
                min_int_index = x;
            }
        }

        int[] results = new int[] { min_int, min_int_index };
        return results;
    }
}
