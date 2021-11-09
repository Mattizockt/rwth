public class SelectionSort {

    public static void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {

            // returns smallest int, smallest int index
            int[] results = find_min_int(a, i);
            int min_int = results[0];
            int min_int_index = results[1];

            int temp = a[i];
            a[i] = min_int;
            a[min_int_index] = temp;

        }
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
