import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by mmorozov on 20.01.2017.
 */
public class Main {
    private static MainForm Wind;
    private static BufferedImage image;

    public static void main(String[] args) {
        

    }


    public static BufferedImage getImage() {
        return image;
    }

    public static void setImage(URL url) {
        try {
            image=ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void setImage(File file) {
        try {
            image=ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveImage (File file, String format){
        try {
            ImageIO.write(image,format,file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
