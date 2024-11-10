package com.teachmeskills.lesson_12.task_2;

import com.teachmeskills.lesson_12.task_2.validation.AddressValidation;

/**
 * Write a program that will check that the entered link is valid.
 * For example, when analyzing a link like this https://teachmeskills.by/kursy/programmirovaniya-online - the program should return that the link is valid.
 * and when entering tcp://teachmeskills.by/kursy/programmirovaniya-online - the program should return that the link is invalid (the link starts with neither http nor https)
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        String firstCheck = "https://teachmeskills.by/kursy/programmirovaniya-online";
        String secondCheck = "tcp://teachmeskills.by/kursy/programmirovaniya-online";

        AddressValidation.addressValidation(firstCheck);
        AddressValidation.addressValidation(secondCheck);
    }
}
