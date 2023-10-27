import java.awt.*;
import java.awt.event.*;

class MouseEventHandling extends Frame {
    private String message = "No Event";

    public MouseEventHandling() {
        setTitle("Mouse Event Handling");
        setSize(400, 400);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                message = "Mouse Clicked";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                message = "Mouse Entered";
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                message = "Mouse Exited";
                repaint();
            }

            public void mouseMoved(MouseEvent e) {
                message = "Mouse Moved";
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 18);
        g.setFont(font);
        g.drawString(message, getWidth() / 2 - 50, getHeight() / 2);
    }

    public static void main(String[] args) {
        new MouseEventHandling();
    }
}
