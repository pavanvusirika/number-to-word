package com.test.numbertoword;

import static com.test.numbertoword.def.Constants.*;
import java.util.Scanner;

/**
 *
 * @author pavan
 */
public class NumberToWord {

    private String calculationForThousand(int no) {
        String val;

        if (no % 100 < 20) {
            val = SINGLES[no % 100];
            no = no / 100;
        } else {
            val = SINGLES[no % 10];
            no = no / 10;

            val = TENS[no % 10] + val;
            no = no / 10;
        }
        if (no == 0) {
            return val;
        }
        return SINGLES[no] + " hundred and" + val;
    }

    public String doWordConversion(int no) {
        String pos = "";
        int index = 0;

        if (no <= 0) {
            return "It's zero or -ve Number, Please enter a Valid number";
        } else {
            do {
                int tmp = no % 1000;
                if (tmp != 0) {
                    String s = calculationForThousand(tmp);
                    pos = s + CURRENCY_MEASURE[index] + pos;
                }
                index++;
                no /= 1000;
            } while (no > 0);
        }
        return pos.trim();
    }

    public static void main(String args[]) {

        NumberToWord noToWord = new NumberToWord();
        
        int number = 0;
        while (true) {
            System.out.print("Enter a number:");
            Scanner input = new Scanner(System.in);
            String inputString = input.nextLine();
            try {
                number = Integer.parseInt(inputString);
            } catch (NumberFormatException nf) {
                System.out.println("Invalid input.");
                continue;
            }
            String converted = noToWord.doWordConversion(number);
            System.out.println(converted);
        }

    }

}
