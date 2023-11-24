//Problem 2 - EASY
public class CollatzConjecture {
    public static void main(String[] args) {
        String res = String.valueOf(doCollatz(0, 97));

        System.out.println(res);
    }

    public static int doCollatz(int index, int number) {
        if(number != 1) {
            if(number % 2 == 0)
                return doCollatz(index + 1, number / 2);
            else
                return doCollatz(index + 1, (number * 3) + 1);
        } else
            return index;
    }
}