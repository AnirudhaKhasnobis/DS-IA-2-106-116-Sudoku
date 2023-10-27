import javax.swing.*;
import java.awt.*;

public class OvalRectangleJava extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw an oval
        g.setColor(Color.RED); // Set the color to red
        g.drawOval(50, 50, 100, 60);

        // Fill the oval with a different color
        g.setColor(Color.BLUE); // Set the color to blue
        g.fillOval(50, 50, 100, 60);

        // Draw a rectangle
        g.setColor(Color.GREEN); // Set the color to green
        g.drawRect(200, 50, 80, 80);

        // Fill the rectangle with a different color
        g.setColor(Color.YELLOW); // Set the color to yellow
        g.fillRect(200, 50, 80, 80);

        // Draw a line
        g.setColor(Color.BLACK); // Set the color to black
        g.drawLine(50, 150, 250, 150);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Shape Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new OvalRectangleJava());
            frame.setSize(400, 200);
            frame.setVisible(true);
        });
    }
}
