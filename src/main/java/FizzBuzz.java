//Problem 6 - DIFFICULT
public class FizzBuzz {
    public static void main(String[] args) {
        String res = fizzBuzz(16);

        System.out.println(res);
    }

    public static String fizzBuzz(int num) {
        String output = "";
        for(int i = 1; i <= num; i++) {
            String fizzBuzz = "";
            if(i % 3 == 0)
                fizzBuzz += "Fizz";
            if(i % 5 == 0)
                fizzBuzz += "Buzz";

            if(fizzBuzz == "")
                fizzBuzz += i;

            output += fizzBuzz + " ";
        }

        return output;
    }
}
