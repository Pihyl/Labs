package StrCal;

public class StringCalculator {

    public int add(String numbers){

        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numberArray = numbers.split(",");
        int sum = 0;

        for (String i : numberArray) {

            int num = Integer.parseInt(i);
            sum += num;
        }

        return sum;


    }
}
