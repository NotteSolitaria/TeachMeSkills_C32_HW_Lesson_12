package com.teachmeskills.lesson_12.task_2.validation;

import com.teachmeskills.lesson_12.task_2.constants.Constant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressValidation {

    public static void addressValidation(String addressCheck){

        Pattern pattern = Pattern.compile(Constant.ADDRESS_REGEXP);
        Matcher matcher = pattern.matcher(addressCheck);

        if (matcher.find()){
            System.out.println("The link is valid");
        } else {
            System.out.println("The link is not valid");
        }
    }
}
