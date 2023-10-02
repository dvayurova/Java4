package edu.school21.printer.logic;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class ImageColorChanger {
    private static final String IMAGE = "src/resources/it.bmp";

    public static void printImage(String whiteColor, String blackColor) throws IOException {
        BufferedImage image = ImageIO.read(new File(IMAGE));
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                String colorCode = (image.getRGB(x, y) == Color.BLACK.getRGB()) ? blackColor : whiteColor;
                System.out.print(getColoredString(" ", colorCode));
            }
            System.out.println();
        }
    }
    private static String getColoredString(String s, String colorCode) {
        return "\u001B[48;5;" + getColorCode(colorCode) + "m\u001B[38;5;" + getColorCode(colorCode) + "m" + s + "\u001B[0m";
    }

    private static int getColorCode(String colorCode) {
        return switch (colorCode) {
            case "BLACK" -> 0;
            case "RED" -> 196;
            case "GREEN" -> 46;
            case "YELLOW" -> 226;
            case "BLUE" -> 21;
            case "MAGENTA" -> 201;
            case "CYAN" -> 51;
            case "WHITE" -> 231;
            default -> 0; // Если передан неизвестный цвет
        };
    }
}
