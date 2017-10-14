package sample;


import java.awt.geom.Point2D;
import java.util.List;


class Zbroja {
    int down;
    List<Point2D> model2D;

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        System.out.println("Wartość zmiennej down zmieniana z " + this.down + " na " + down);
        this.down = down;
    }
}


public class B {

    //dialog
    public static void edytujLiczbe(Zbroja zbroja) {
        zbroja.down += 10;
    }


    public static void main(String[] args) {
        Zbroja nasza = new Zbroja();
        nasza.setDown(12);

        //
        System.out.println(nasza.getDown());
        edytujLiczbe(nasza);    //przekazuje instancje klasy (referencje do obiektu)
        System.out.println(nasza.getDown());

    }
}