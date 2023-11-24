//Problem 3 - AVERAGE
public class IncompleteList {
    public static void main(String[] args) {
        String res = String.join(", ", intToStringArray(problem3(new int[]{1, 4, 3})));

        System.out.println(res);
    }

    public static int[] problem3(int[] in) {
        int size = in.length + 2;
        int[] output = new int[size];

        int[] sortedArray = selectionSort(in);
        for(int i = 1; i <= size; i++) {
            if(!hasValue(sortedArray, i))
                output[i - 1] = i;
        }

        return removeAllZeros(output);
    }

    public static boolean hasValue(int[] in, int target) {
        for(int i : in)
            if(i == target)
                return true;
        return false;
    }

    public static int[] selectionSort(int[] unsorted) {
        for(int i = 0; i < unsorted.length; i++) {
            for(int j = i; j < unsorted.length; j++) {
                int a = unsorted[i];
                int b = unsorted[j];
                unsorted[i] = Math.min(a, b);
                unsorted[j] = Math.max(a, b);
            }
        }

        return unsorted;
    }

    public static int[] removeAllZeros(int[] in) {
        int[] output = new int[countNonZeros(in)];
        int outputIndex = 0;
        for (int i : in) {
            if (i != 0)
                output[outputIndex++] = i;
        }

        return output;
    }

    public static int countNonZeros(int[] in) {
        int counter = 0;
        for(int i : in)
            if(i != 0)
                counter++;

        return counter;
    }

    public static String[] intToStringArray(int[] in) {
        String[] output = new String[in.length];
        for(int i = 0; i < in.length; i++) {
            output[i] = String.valueOf(in[i]);
        }

        return output;
    }
}
