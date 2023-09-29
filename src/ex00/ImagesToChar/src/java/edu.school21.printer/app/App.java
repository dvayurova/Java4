package edu.school21.printer.app;
import edu.school21.printer.logic.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        if (!ArgumentsValidator.validate(args)) {
            System.err.println("Incorrect input");
            System.exit(-1);
        }
        try {
            BlackWhiteImageConverter.convert(args[0].charAt(0), args[1].charAt(0), args[2]);
        } catch (IOException e) {
            System.err.println("Something went wrong when reading a file" + e.getMessage());
        }
    }
}
