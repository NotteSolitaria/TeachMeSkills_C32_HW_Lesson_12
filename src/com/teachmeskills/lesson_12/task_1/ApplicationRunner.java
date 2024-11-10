package com.teachmeskills.lesson_12.task_1;

import com.teachmeskills.lesson_12.task_1.examination.HexCodeExamination;

/**
 * Write a program that the passed string is a hex code for the color description.
 * For example, when entering the value #8b2323 into the program, the program should return - Yes.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        String firstCheck = "#8b2323";
        String secondCheck = "#23u831";
        String thirdCheck = "7138";

        HexCodeExamination.hexExamination(firstCheck);
        HexCodeExamination.hexExamination(secondCheck);
        HexCodeExamination.hexExamination(thirdCheck);
    }
}
