package StrCal;

public class StringCalculator {

    public int add(String numbers){

        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numberArray = numbers.split(",");
        int sum = 0;

        if(numberArray.length > 2){
            throw new IllegalArgumentException();
        }


        for (String i : numberArray) {

            int num = Integer.parseInt(i);
            sum += num;
        }

        return sum;


    }
}
