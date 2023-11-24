//Problem 1 - EASY
public class BinarySearch {
    public static void main(String[] args) {
        String res = String.valueOf(binarySearchIndex(71, new int[]{0,1,21,33,45,45,61,71,72,73}, 0));

        System.out.println(res);
    }

    public static int binarySearchIndex(int target, int[] in, int startIndex) {
        if(in.length == 1) {
            if(target == in[0])
                return startIndex;
            else
                return -1;
        }

        int mid = in.length / 2;

        int[] a = new int[mid];
        for(int i = 0; i < a.length; i++) {
            a[i] = in[i];
        }

        int[] b = new int[in.length - a.length];
        int bIndex = 0;
        for(int i = mid; i < in.length; i++) {
            b[bIndex] = in[i];
            bIndex++;
        }

        return Math.max(binarySearchIndex(target, a, startIndex), binarySearchIndex(target, b, startIndex + mid));
    }
}
