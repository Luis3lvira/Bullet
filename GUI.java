
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;


import static java.lang.Math.abs;
import static java.lang.Math.round;

public class GUI extends JFrame implements Runnable {

    private BufferedImage boddyCatBuffer, backgroundBuffer, stellaBufferInitial, stellaBufferFinal;

    private BufferedImage  starBuffer_1, starBuffer_2, starBuffer_3, starBuffer_4, starBuffer_5, starBuffer_6;

    public Graphics graphics;

    public Random random;

    boolean stella = true;
    short  step = 0;

    URL audioSrc;

    AudioInputStream inputStream;

    Clip clip;

    public boolean filling = false;
    Runnable backGroundRunable = new Runnable() {
        @Override
        public void run() {
            try {

                for (int i = 0; i <= 599; i++)
                    for (int j = 0; j < 999; j++)
                        putPixel(j, i, backgroundBuffer, new Color(0x003366)); //FONdO
                graphics.drawImage(backgroundBuffer, 0, 0, GUI.this);
//StarModel_1
                drawRecFill(0, 0, 139, 139, starBuffer_1, new Color(0x003365));
                drawRecFill(60, 0, 79, 19, starBuffer_1, new Color(0xFFFFFF));
                drawRecFill(20, 20, 39, 39, starBuffer_1, new Color(0xFFFFFF));
                drawRecFill(100, 20, 119, 39, starBuffer_1, new Color(0xFFFFFF));

                drawRecFill(0, 60, 19, 79, starBuffer_1, new Color(0xFFFFFF));
                drawRecFill(120, 60, 139, 79, starBuffer_1, new Color(0xFFFFFF));

                drawRecFill(20, 100, 39, 119, starBuffer_1, new Color(0xFFFFFF));
                drawRecFill(100, 100, 119, 119, starBuffer_1, new Color(0xFFFFFF));
                drawRecFill(60, 120, 79, 139, starBuffer_1, new Color(0xFFFFFF));
//StarModel_2
                drawRecFill(0, 0, 139, 139, starBuffer_2, new Color(0x003365));
                drawRecFill(60, 0, 79, 39, starBuffer_2, new Color(0xFFFFFF));
                drawRecFill(60, 60, 79, 79, starBuffer_2, new Color(0xFFFFFF));
                drawRecFill(0, 60, 39, 79, starBuffer_2, new Color(0xFFFFFF));
                drawRecFill(99, 60, 139, 79, starBuffer_2, new Color(0xFFFFFF));
                drawRecFill(60, 100, 79, 139, starBuffer_2, new Color(0xFFFFFF));
//StarModel_3
                drawRecFill(0, 0, 139, 139, starBuffer_3, new Color(0x003365));
                drawRecFill(0, 60, 19, 79, starBuffer_3, new Color(0xFFFFFF));
                drawRecFill(60, 0, 79, 19, starBuffer_3, new Color(0xFFFFFF));
                drawRecFill(120, 60, 139, 79, starBuffer_3, new Color(0xFFFFFF));
                drawRecFill(60, 120, 79, 139, starBuffer_3, new Color(0xFFFFFF));
//StarModel_4
                drawRecFill(0, 0, 69, 69, starBuffer_4, new Color(0x003365));
                drawRecFill(19, 40, 39, 49, starBuffer_4, new Color(0xFFFFFF));
                drawRecFill(40, 19, 49, 39, starBuffer_4, new Color(0xFFFFFF));
                drawRecFill(50, 40, 69, 49, starBuffer_4, new Color(0xFFFFFF));
                drawRecFill(40, 50, 49, 69, starBuffer_4, new Color(0xFFFFFF));
//StarModel_5
                drawRecFill(0, 0, 29, 29, starBuffer_5, new Color(0xFFFFFF));

//StarModel_6
                drawRecFill(0, 0, 44, 44, starBuffer_6, new Color(0x003565));
                drawRecFill(0, 15, 14, 29, starBuffer_6, new Color(0xFFFFFF));
                drawRecFill(15, 0, 29, 14, starBuffer_6, new Color(0xFFFFFF));
                drawRecFill(30, 15, 44, 29, starBuffer_6, new Color(0xFFFFFF));
                drawRecFill(15, 30, 29, 44, starBuffer_6, new Color(0xFFFFFF));

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    };
    Runnable StellaRunable = new Runnable() {
        @Override
        public void run() {
            try {
                //Rojo
                drawRecFill(0, 10, 74, 44, stellaBufferInitial, new Color(0xFF2D0E));
                drawRecFill(75, 0, 224, 34, stellaBufferInitial, new Color(0xFF2D0E));
                drawRecFill(225, 10, 374, 44, stellaBufferInitial, new Color(0xFF2D0E));
                drawRecFill(375, 0, 474, 34, stellaBufferInitial, new Color(0xFF2D0E));
                //Naranja
                drawRecFill(0, 45, 74, 79, stellaBufferInitial, new Color(0xFFA804));
                drawRecFill(75, 35, 224, 69, stellaBufferInitial, new Color(0xFFA804));
                drawRecFill(225, 45, 374, 79, stellaBufferInitial, new Color(0xFFA804));
                drawRecFill(375, 35, 474, 69, stellaBufferInitial, new Color(0xFFA804));
                //Amarillo
                drawRecFill(0, 80, 74, 114, stellaBufferInitial, new Color(0xFFFF00));
                drawRecFill(75, 70, 224, 104, stellaBufferInitial, new Color(0xFFFF00));
                drawRecFill(225, 80, 374, 114, stellaBufferInitial, new Color(0xFFFF00));
                drawRecFill(375, 70, 474, 104, stellaBufferInitial, new Color(0xFFFF00));

                drawRecFill(0, 115, 74, 149, stellaBufferInitial, new Color(0xFFFF00));
                drawRecFill(75, 105, 224, 139, stellaBufferInitial, new Color(0xFFFF00));
                drawRecFill(225, 115, 374, 149, stellaBufferInitial, new Color(0xFFFF00));
                drawRecFill(375, 105, 474, 139, stellaBufferInitial, new Color(0xFFFF00));


                drawRecFill(0, 150, 74, 184, stellaBufferInitial, new Color(0xFFA804));
                drawRecFill(75, 140, 224, 174, stellaBufferInitial, new Color(0xFFA804));
                drawRecFill(225, 150, 374, 184, stellaBufferInitial, new Color(0xFFA804));
                drawRecFill(375, 140, 474, 174, stellaBufferInitial, new Color(0xFFA804));
                //Naranja
                drawRecFill(0, 185, 74, 219, stellaBufferInitial, new Color(0xFF2D0E));
                drawRecFill(75, 175, 224, 209, stellaBufferInitial, new Color(0xFF2D0E));
                drawRecFill(225, 185, 374, 219, stellaBufferInitial, new Color(0xFF2D0E));
                drawRecFill(375, 175, 474, 209, stellaBufferInitial, new Color(0xFF2D0E));

                //Rellenar fondo
                drawRecFill(0, 0, 74, 9, stellaBufferInitial, new Color(0x003366));
                drawRecFill(225, 0, 374, 9, stellaBufferInitial, new Color(0x003366));
                drawRecFill(75, 210, 224, 219, stellaBufferInitial, new Color(0x003366));
                drawRecFill(375, 210, 474, 219, stellaBufferInitial, new Color(0x003366));



                System.out.println("Estela inicial creada :D!");
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                //Rojo
                drawRecFill(0, 0, 74, 34, stellaBufferFinal, new Color(0xFF2D0E));
                drawRecFill(75, 10, 224, 44, stellaBufferFinal, new Color(0xFF2D0E));
                drawRecFill(225, 0, 374, 34, stellaBufferFinal, new Color(0xFF2D0E));
                drawRecFill(375, 10, 474, 44, stellaBufferFinal, new Color(0xFF2D0E));
                //Naranja
                drawRecFill(0, 35, 74, 69, stellaBufferFinal, new Color(0xFFA804));
                drawRecFill(75, 45, 224, 79, stellaBufferFinal, new Color(0xFFA804));
                drawRecFill(225, 35, 374, 69, stellaBufferFinal, new Color(0xFFA804));
                drawRecFill(375, 45, 474, 79, stellaBufferFinal, new Color(0xFFA804));
//                //Amarillo
                drawRecFill(0, 70, 74, 104, stellaBufferFinal, new Color(0xFFFF00));
                drawRecFill(75, 80, 224, 114, stellaBufferFinal, new Color(0xFFFF00));
                drawRecFill(225, 70, 374, 104, stellaBufferFinal, new Color(0xFFFF00));
                drawRecFill(375, 80, 474, 114, stellaBufferFinal, new Color(0xFFFF00));
//
                drawRecFill(0, 105, 74, 139, stellaBufferFinal, new Color(0xFFFF00));
                drawRecFill(75, 115, 224, 149, stellaBufferFinal, new Color(0xFFFF00));
                drawRecFill(225, 105, 374, 139, stellaBufferFinal, new Color(0xFFFF00));
                drawRecFill(375, 115, 474, 149, stellaBufferFinal, new Color(0xFFFF00));
//
//
                drawRecFill(0, 140, 74, 174, stellaBufferFinal, new Color(0xFFA804));
                drawRecFill(75, 150, 224, 184, stellaBufferFinal, new Color(0xFFA804));
                drawRecFill(225, 140, 374, 174, stellaBufferFinal, new Color(0xFFA804));
                drawRecFill(375, 150, 474, 184, stellaBufferFinal, new Color(0xFFA804));
//
                drawRecFill(0, 175, 74, 209, stellaBufferFinal, new Color(0xFF2D0E));
                drawRecFill(75, 185, 224, 219, stellaBufferFinal, new Color(0xFF2D0E));
                drawRecFill(225, 175, 374, 209, stellaBufferFinal, new Color(0xFF2D0E));
                drawRecFill(375, 185, 474, 219, stellaBufferFinal, new Color(0xFF2D0E));
//
//
//azuldelazz
                drawRecFill(0, 210, 74, 219, stellaBufferFinal, new Color(0x003366));
                drawRecFill(75, 0, 224, 9, stellaBufferFinal, new Color(0x003366));
                drawRecFill(225, 210, 374, 219, stellaBufferFinal, new Color(0x003366));
                drawRecFill(375, 0, 474, 9, stellaBufferFinal, new Color(0x003366));



                System.out.println("Estala Final creada :D!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    };

    Runnable bodyCatRunable = new Runnable() {
        @Override
        public void run() {

            try {
                drawRecFill(60, 0, 399, 219, boddyCatBuffer, new Color(0x000000));
                drawRecFill(0, 5, 399, 199, boddyCatBuffer, new Color(0x000000));
               drawRecFill(0, 10, 350, 20, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(0, 20, 350, 25, boddyCatBuffer, new Color(0x333333));
                drawRecFill(351, 25, 371, 35, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(351, 35, 371, 40, boddyCatBuffer, new Color(0x333333));
                drawRecFill(371, 43, 396, 50, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(0, 211, 390, 216, boddyCatBuffer, new Color(0x333333));//linea gris adentro
                drawRecFill(80, 190, 100, 198, boddyCatBuffer, new Color(0x333333));
                drawRecFill(80, 178, 100, 181, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(0, 200, 80, 211, boddyCatBuffer, new Color(0xFFFFFF));
              //  drawRecFill(100, 208, 390, 211, boddyCatBuffer, new Color(0xFFFFFF));




                drawRecFill(0, 50, 380, 170, boddyCatBuffer, new Color(0x000000));


               //Dentro de la bala
              //  drawRecFill(45, 55, 65, 75, boddyCatBuffer, new Color(0x666666));
              //  drawRecFill(30, 135, 50, 155, boddyCatBuffer, new Color(0x666666));
              //  drawRecFill(85, 165, 105, 185, boddyCatBuffer, new Color(0x666666));
              //  drawRecFill(115, 105, 135, 125, boddyCatBuffer, new Color(0x666666));
                drawRecFill(280, 120, 399, 185, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(310, 120, 313, 185, boddyCatBuffer, new Color(0x000000));
                drawRecFill(340, 120, 343, 185, boddyCatBuffer, new Color(0x000000));
                drawRecFill(370, 120, 373, 185, boddyCatBuffer, new Color(0x000000));
                drawRecFill(395, 120, 399, 185, boddyCatBuffer, new Color(0x000000));
                drawRecFill(280, 50, 330, 80, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(293, 55, 329, 80, boddyCatBuffer, new Color(0x000000));
                //drawRecFill(76, 3, 78, 216, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(80, 28, 100, 31, boddyCatBuffer, new Color(0xFFFFFF));
                drawRecFill(80, 40, 100, 55, boddyCatBuffer, new Color(0xFFFFFF));




                //Borde redondeados de la bala)
                drawRecFill(359, 0, 399, 20, boddyCatBuffer, new Color(0x003366));//arrba
                drawRecFill(379, 21, 399, 39, boddyCatBuffer, new Color(0x003366));
                drawRecFill(80, 0, 100, 25, boddyCatBuffer, new Color(0x003366)); //cla arrba
                drawRecFill(359, 200, 399, 219, boddyCatBuffer, new Color(0x003366));//abaj
                drawRecFill(380, 180, 399, 219, boddyCatBuffer, new Color(0x003366));
                drawRecFill(80, 200, 100, 219, boddyCatBuffer, new Color(0x003366));


            } catch (Exception e) {
                System.out.println(e);
            }
        }
    };






    public GUI() {

        super("Animacion2D");
        boolean DoubleBuffer = true;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setVisible(true);
        setResizable(false);


        random = new Random();
        graphics = this.getGraphics();
        backgroundBuffer = new BufferedImage(1000, 600, BufferedImage.TYPE_INT_RGB);
        stellaBufferFinal = new BufferedImage(475, 220, BufferedImage.TYPE_INT_RGB);
        stellaBufferInitial = new BufferedImage(475, 220, BufferedImage.TYPE_INT_RGB);
        boddyCatBuffer = new BufferedImage(400, 220, BufferedImage.TYPE_INT_RGB);

        starBuffer_1 = new BufferedImage(140, 140, BufferedImage.TYPE_INT_RGB);
        starBuffer_2 = new BufferedImage(140, 140, BufferedImage.TYPE_INT_RGB);
        starBuffer_3 = new BufferedImage(140, 140, BufferedImage.TYPE_INT_RGB);
        starBuffer_4 = new BufferedImage(70, 70, BufferedImage.TYPE_INT_RGB);
        starBuffer_5 = new BufferedImage(30, 30, BufferedImage.TYPE_INT_RGB);
        starBuffer_6 = new BufferedImage(45, 45, BufferedImage.TYPE_INT_RGB);

        new Thread(this::run, "Background").start();

    }

    @Override
    public void paint(Graphics g) {

        graphics.drawImage(backgroundBuffer, 0, 0, this);

        switch (step) {
            case 0:
                graphics.drawImage(starBuffer_1, 900, 80, this);
                graphics.drawImage(starBuffer_4, 900, 470, this);
                step++;
                break;
            case 1:
                graphics.drawImage(starBuffer_3, 720, 80, GUI.this);
                graphics.drawImage(starBuffer_2, 950, 550, this);
                step++;
                break;
            case 2:
                graphics.drawImage(starBuffer_6, 520, 40, this);
                graphics.drawImage(starBuffer_1, 660, 400, GUI.this);
                step++;
                break;
            case 3:
                graphics.drawImage(starBuffer_5, 350, 100, this);
                graphics.drawImage(starBuffer_3, 460, 400, GUI.this);
                step++;
                break;
            case 4:
                graphics.drawImage(starBuffer_4, 180, 60, this);
                graphics.drawImage(starBuffer_1, 850, 280, this);
                graphics.drawImage(starBuffer_6, 210, 400, GUI.this);
                step++;
                break;
            case 5:
                graphics.drawImage(starBuffer_2, 0, 240, this);
                graphics.drawImage(starBuffer_5, 20, 400, GUI.this);
                step = 0;
                break;
        }


        if (stella) {
            graphics.drawImage(stellaBufferInitial, 7, 200, this);
            stella = false;
        } else {
            graphics.drawImage(stellaBufferFinal, 7, 200, this);
            stella = true;
        }


        // graphics.drawImage(feetBuffer_1, 450, 400, this);
        graphics.drawImage(boddyCatBuffer, 475, 200, this);



    }

    public synchronized void canFillFigure(int x0, int y0, Color color, BufferedImage buffer) {

        while (filling) {
            try {
                System.out.println("Se esta usando el rellenado");
                wait();

            } catch (InterruptedException error) {
                System.out.println("Error " + error);
            }
        }
        filling = true;
        floodFill(x0 + 1, y0 + 1, color, buffer);
        filling = false;
        notifyAll();

    }


    public void putPixel(int x, int y, BufferedImage buffer, Color color) {
        buffer.setRGB(x, y, color.getRGB());
    }

    public void drawRecFill(int x0, int y0, int x1, int y1, BufferedImage buffer, Color color) {

        Línea_DDA(x0, y0, x1, y0, buffer, color);
        Línea_DDA(x0, y1, x1, y1, buffer, color);
        Línea_DDA(x1, y0, x1, y1, buffer, color);
        Línea_DDA(x0, y0, x0, y1, buffer, color);
        //175 - 17
        canFillFigure(x0, y0, color, buffer);

    }

    public void Línea_DDA(int x0, int y0, int x1, int y1, BufferedImage buffer, Color color) {
        int x = x0, xinc, yinc, dx, dy, steps;
        double y = y0;

        dx = x1 - x0;
        dy = y1 - y0;

        if (abs(dx) > abs(dy)) {
            steps = abs(dx);

        } else {
            steps = abs(dy);
        }

        xinc = dx / steps;
        yinc = dy / steps;

        putPixel(round(x), (int) round(y), buffer, color);

        for (int k = 1; k <= steps; k++) {
            x = (x + xinc);
            y = y + yinc;
            putPixel(round(x), (int) round(y), buffer, color);
        }
    }


    public void floodFill(int x, int y, Color newColor, BufferedImage buffer) {

        if (newColor.getRGB() != buffer.getRGB(x, y)) {
            putPixel(x, y, buffer, newColor);
            if (buffer.getRGB(x + 1, y) != newColor.getRGB())
                floodFill(x + 1, y, newColor, buffer);
//            if (buffer.getRGB(x - 1, y) != newColor.getRGB())
//                floodFill(x - 1, y, newColor, buffer);
            if (buffer.getRGB(x, y + 1) != newColor.getRGB())
                floodFill(x, y + 1, newColor, buffer);
//            if (buffer.getRGB(x, y - 1) == newColor.getRGB())
//                floodFill(x, y - 1, newColor, buffer);
        }
    }


    @Override
    public void run() {


        try {
            audioSrc = getClass().getResource("mario.wav");
            inputStream = AudioSystem.getAudioInputStream(audioSrc);
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Thread threadBackground = new Thread(backGroundRunable, "Fondo");
        threadBackground.start();
        Thread stellaInitial = new Thread(StellaRunable, "StelaInitial");
        stellaInitial.start();
        Thread bodyCat = new Thread(bodyCatRunable, "BodyCat");
        bodyCat.start();
      // Thread headCatInitial = new Thread(headRunable, "HeadCatInitial");
      //  headCatInitial.start();
      // Thread feets = new Thread(feetsRunable, "Feets");
      // feets.start();


        while (true) {


            try {
                Thread.sleep(400);
                repaint();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}