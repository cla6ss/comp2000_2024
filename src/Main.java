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
    private int numTrails = 200;
    private double[][] mPoints = new double[numTrails][2];
    private int mPointIndex = 0;
    
    //private boolean initPaint = true;
    
    Grid grid = new Grid();

    @Override
    public void paint(Graphics g) {
        
        
        
        Point latestMPoint = getMousePosition();

        
        mPoints[mPointIndex][0] = latestMPoint.getX();
        mPoints[mPointIndex][1] = latestMPoint.getY();

        mPointIndex =  (mPointIndex + 1) % numTrails;

        

        Color transparent = new Color(1,0,0, 0.1f);
        //g.setColor(Color.WHITE);
        //g.fillRect(0,0,720,720);
        grid.draw(g);
        g.setColor(transparent);
        
        for (int i = 0; i < numTrails; i++) {
            g.fillOval((int) mPoints[i][0] - 10, (int) mPoints[i][1] - 10,20,20);
        }
        //System.out.println();


    }

    public void run() {
        
        while (true) {
            this.repaint();
        }
       
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