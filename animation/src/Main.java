import java.awt.*;

public class Main {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        panel.setBackground(Color.white);
        Graphics g = panel.getGraphics();
        {
            for (int i = 0; i <= 100; i++) {
                g.setColor(Color.BLUE);
                g.fillRect(10 * i+ 10, 85, 100, 35);
                g.fillRect(6 * i+ 10, 345, 100, 35);
                g.setColor(Color.BLACK);
                g.fillOval(10 * i+20, 110, 20, 20);
                g.fillOval(10 * i+80, 110, 20, 20);
                g.fillOval(6 * i+20, 370, 20, 20);
                g.fillOval(6 * i+80, 370, 20, 20);
                g.setColor(Color.BLACK);
                g.fillRect(10 * i+35, 60, 50, 25);
                g.fillRect(6 * i+35, 320, 50, 25);
                panel.sleep(200);
                panel.clear();

            }
        }
    }
}
