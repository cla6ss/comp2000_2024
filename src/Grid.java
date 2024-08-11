import java.awt.*;
import java.awt.Color;

public class Grid {
    
        public cell[][] cells;
        public Grid() {
            cells = new cell[20][20];
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    //cells[i][j] = new cell(i,j,Color.BLACK,g);

                    if (i == 3 || j == 0) {
                        cells[i][j] = new cell(i,j,Color.BLACK);
                    } else {
                        cells[i][j] = new cell(i,j,Color.BLUE);
                    }
                    
                }
            }
        }
        public void draw(Graphics g) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    g.setColor(cells[i][j].myColor);
                    g.fillRect(i * 35,j * 35, 35, 35);
                }
            }
        }
    
}
