package edu.school21.printer.app;

import edu.school21.printer.logic.*;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.io.IOException;

@Parameters(separators = "=")

public class Main {
    private static final String IMAGE = "src/resources/it.bmp";

    @Parameter(names = "--white")
    private static String whiteColor;

    @Parameter(names = "--black")
    private static String blackColor;
    
    public static void main(String[] args) {
        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(args);
        try {
            ImageColorChanger.printImage(whiteColor, blackColor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
