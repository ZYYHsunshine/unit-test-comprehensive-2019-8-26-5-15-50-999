package tw;

import tw.commands.GuessInputCommand;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static Void main(String[] args) throws Exception {
        String[] input = new String[4];
        int sumA = 0, sumB = 0;
        for (int i = 0; i < RUN_TIMES; i++) {
            List<String> inputList = Arrays.asList(input);
            String[] answer = {"6", "6", "6", "6"};
            List<String> answerList = Arrays.asList(answer);
            for (String number : inputList) {
                if (answerList.contains(number)) {
                    sumB++;
                    if (answerList.indexOf(number) == inputList.indexOf(number)) {
                        sumA++;
                        sumB--;
                    }
                }
            }
        }
        System.out.println(sumA + "A" + sumB + "B");
    }
}


