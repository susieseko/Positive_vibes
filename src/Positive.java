import javax.swing.*;
import java.awt.*;

public class Positive {
    public static void main(String[] args) {

        ImageIcon kciuki = new ImageIcon("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/the-psychology-of-happiness.jpg");
        JLabel label = new JLabel("Co Ci chodzi po głowie?");
        label.setIcon(kciuki);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setFont(new Font("Papyrus", Font.ITALIC, 40));

        JFrame frame = new JFrame();
        frame.setTitle("POSITIVE VIBES :)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400,900);
        frame.setVisible(true);
        frame.add(label);

        ImageIcon image = new ImageIcon("emoji.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.pink);
    }
}

