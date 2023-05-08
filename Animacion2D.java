import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Animacion2D {

    public static void main(String[] args) {

        Runnable initialFrama = new Runnable() {
            @Override
            public void run() {
                new GUI();

            }
        };

        try {
            SwingUtilities.invokeAndWait(initialFrama);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);



        }

    }

}