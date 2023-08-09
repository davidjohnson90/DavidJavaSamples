package com.david.java.blogbeats;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;

/**
 * The PPTToImages class loads the PPT file and converts its slides to images.
 * <p>
 * author David
 */
public class PPTToImages {
    private static XSLFSlide xslfSlide;

    /**
     * The main method to convert PPT slides to images and save them as PNG files.
     *
     * @param args an array of command-line arguments (not used in this application).
     * @throws FileNotFoundException if the PPT file is not found.
     * @throws IOException           if an I/O error occurs during file operations.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // creating an empty presentation
        File file = new File("D:\\Office\\Learning\\Protocols.pptx");
        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(file));

        // getting the dimensions and size of the slide
        Dimension pgsize = ppt.getPageSize();
        List<XSLFSlide> slide = ppt.getSlides();

        xslfSlide = null;
        BufferedImage img = null;
        for (int i = 0; i < slide.size(); i++) {
            img = new BufferedImage(pgsize.width, pgsize.height, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = img.createGraphics();

            // clear the drawing area
            graphics.setPaint(Color.white);
            graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));

            // render
            slide.get(i).draw(graphics);
        }

        // creating an image file as output
        FileOutputStream out = new FileOutputStream("D:\\Office\\Learning\\Images\\ppt_image.png");
        javax.imageio.ImageIO.write(img, "png", out);
        ppt.write(out);

        System.out.println("Image successfully created");
        out.close();
    }
}
