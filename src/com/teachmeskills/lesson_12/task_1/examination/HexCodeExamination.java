package com.teachmeskills.lesson_12.task_1.examination;

import com.teachmeskills.lesson_12.task_1.constants.Constant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexCodeExamination {

    public static void hexExamination(String hexForCheck) {

        Pattern pattern = Pattern.compile(Constant.HEX_CODE_REGEXP);
        Matcher matcher = pattern.matcher(hexForCheck);

        if (matcher.find()) {
            System.out.println("Yes");;
        } else {
            System.out.println("No");;
        }
    }
}
