import java.awt.Color;
import java.awt.Graphics;



public class cell {
    int x,y;
    int size = 10;

    public cell(int x, int y, Color c, Graphics g) {

        g.setColor(c);
        //g.setColor(Color.WHITE);
        g.fillRect(x * size, y * size, size, size);
        g.drawRect(x * size, y * size, size, size);

    }

}
