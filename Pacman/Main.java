import java.awt.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        View w = new View();
        Graphics g = w.getGraphicsContext();


        //String temp = KBD.guiString("press enter");
        World m = new World("level1.csv");
        //m.printMap();
        //game loop
        Mon m1 = new Mon("Inky", m);
        Mon m2 = new Mon("Blinky", m);
        Mon m3 = new Mon("Pinky", m);
        Mon m4 = new Mon("Clyde", m);

        Pac p = new Pac("Paul",m);
        //Thread.sleep(1000);
        while(true) {
            m.paint(g);  //paint the map
            m1.move();   //move m1
            m1.paint1(g); //paint m1
            m2.move();   //move m2
            m2.paint2(g); //paint m2
            m3.move();   //move m3
            m3.paint3(g); //paint m3
            m4.move();   //move m4
            m4.paint4(g); //paint m4
            p.move();
            p.paint(g);
            Thread.sleep(200);  //delay 200
        }
    }
}