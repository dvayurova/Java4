package edu.school21.printer.logic;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BlackWhiteImageConverter {
    public static void convert(char whiteChar, char blackChar, String imagePath) throws IOException {
        BufferedImage image = ImageIO.read(new File(imagePath));
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                char outputChar = (image.getRGB(x, y) == Color.BLACK.getRGB()) ? blackChar : whiteChar;
                System.out.print(outputChar);
            }
            System.out.println();
        }
    }

}