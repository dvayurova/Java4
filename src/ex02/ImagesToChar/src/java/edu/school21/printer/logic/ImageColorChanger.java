package edu.school21.printer.logic;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

public class ImageColorChanger {
    private static final String IMAGE = "src/resources/it.bmp";
    private static final int HEIGHT = 16;
    private static final int WIDTH = 16;

    public static void printImage(String whiteColor, String blackColor) throws IOException {
        BufferedImage image = ImageIO.read(new File(IMAGE));

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                String colorCode = (image.getRGB(x, y) == Color.BLACK.getRGB()) ? blackColor : whiteColor;
                ColoredPrinter colorPrinter = new ColoredPrinter.Builder(1, false)
                        .background(Ansi.BColor.valueOf(colorCode))
                        .build();
                colorPrinter.print(" ");

            }
            System.out.println();
        }
    }
 
}
