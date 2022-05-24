package com.codefun.demo;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakePictureExample {
    public static void main(String[] args) throws IOException {

        Webcam webcam = Webcam.getDefault();

        webcam.setViewSize(new Dimension(1024,768));

        webcam.open(false);

        // get image
        BufferedImage image = webcam.getImage();

        // save image to PNG file
        ImageIO.write(image, "PNG", new File("test.png"));
    }
}
