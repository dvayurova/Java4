package edu.school21.printer.logic;

public class ArgumentsValidator {
    public static boolean validate(String[] args){
        if (args.length != 2 || args[0].length() != 1 || args[1].length() != 1) {
            System.err.println("Usage: java App <white character> <black character> <path_to_image>");
            return false;
        }
        return true;
    }
}
