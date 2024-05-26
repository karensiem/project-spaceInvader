package functions;

import java.awt.Color;

public class Spaceship {

    public static final int x_size = 10;

    public static final int y_size = 3;

    public static final int tempo = 2;

    public static final int pos_y = -4;

    public static final Color color = new Color(255, 255, 230);

    private int x;

    private int direction;

    //constructor
    public Spaceship(int x) {
        this.x = x;
        direction = 1;
    }

    void goRight() {
        direction = 1;
    }

    void goLeft() {
        direction = -1;
    }

    //Get coordinate x;
    public int getX() {
        return x;
    }


    //updates the movement of the bullets
    public void update() {
        x = x + tempo * direction;
    }

}
