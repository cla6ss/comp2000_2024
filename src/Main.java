import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
       
        window.run();

        //window.paint();
    }


    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720)); 
        }
        

    }   

    private Main() { 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
       
    }
    @Override
    public void paint(Graphics g) {
        Grid grid = new Grid(g);



    }

    public void run() {
        this.repaint();
    }
/*     public void paint() {

        
        Point p = getMousePosition();
        int xIndex = p.x / 10;
        int yIndex = p.y / 10;




        Grid grid = new Grid(g);
        grid.cells[3][3] = new cell(3,3,Color.WHITE,g);
        grid.cells[xIndex][yIndex] = new cell(xIndex,yIndex,Color.WHITE,g);
    } */

    
    
    
}