package com.myCompany;

/**
 * this is a fun game .
 */
public class FunGame {
    public static final String FIZZ ="Fizz";
    public static final String BUZZ = "Buzz";
    public static void main(String args[]) {
        FunGame funGame = new FunGame();
        for (int i = 1; i <= 100; i++) {
            System.out.println(funGame.fizzAndBuzzNewGame(i));
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(funGame.fizzAndBuzzGame(i));
        }

    }

    /**
     *
     * @param i form 1 to 100
     * @return i But for multiples of three print "Fizz" instead of the number and for the multiples of
     *  * five print "Buzz". For numbers which are multiples of both three and five print"FizzBuzz".
     */
    String fizzAndBuzzGame(int i) {
        String result = "";
        if (i < 1 || i > 100) {
            result = "onley 1-100 is accepted.";
            return result;
        }
        boolean hasFizz = false, hasBuzz = false;
        if (i % 3 == 0) {
            result = FIZZ;
            hasFizz = true;
        }
        if (i % 5 == 0) {
            result += BUZZ;
            hasBuzz = true;
        }
        if (!hasFizz && !hasBuzz) {
            result = i + "";
        }
        return result;
    }

    String fizzAndBuzzNewGame(int i){
        String result = "";
        boolean hasNumber3 = false, hasNumber5 = false;
        if (i < 1 || i > 100) {
            result = "onley 1-100 is accepted.";
            return result;
        }
        if((String.valueOf(i)).contains("3")) {
            result = FIZZ;
            hasNumber3 = true;
        }
        if((String.valueOf(i)).contains("5")) {
            result += BUZZ;
            hasNumber5 = true;
        }
        if(!hasNumber3 && !hasNumber5){
            return this.fizzAndBuzzGame(i);
        }
        return result;


    }
}
