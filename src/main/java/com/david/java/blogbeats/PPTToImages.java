package com.david.java.blogbeats;

/**
 *
 * {@link PPTToImages} class to load the ppt file and convert them to images
 * @author David
 *
 */
public class PPTToImages {
  // private static XSLFSlide xslfSlide;
  //
  // public static void main(String[] args) throws FileNotFoundException, IOException {
  // // creating an empty presentation
  // File file = new File("D:\\Documents\\ScrumTetra_Sprint1_Review.pptx");
  // XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(file));
  //
  // // getting the dimensions and size of the slide
  // Dimension pgsize = ppt.getPageSize();
  // List<XSLFSlide> slide = ppt.getSlides();
  //
  // xslfSlide = null;
  // BufferedImage img = null;
  // for (int i = 0; i < slide.size(); i++) {
  // img = new BufferedImage(pgsize.width, pgsize.height, BufferedImage.TYPE_INT_RGB);
  // Graphics2D graphics = img.createGraphics();
  //
  // // clear the drawing area
  // graphics.setPaint(Color.white);
  // graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));
  //
  // // render
  // slide[i].draw(graphics);
  // }
  //
  // // creating an image file as output
  // FileOutputStream out = new FileOutputStream("D:\\Documents\\ppt_image.png");
  // javax.imageio.ImageIO.write(img, "png", out);
  // ppt.write(out);
  //
  // System.out.println("Image successfully created");
  // out.close();
  // }
}