import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JLabel obrazek = new JLabel();
    ImageIcon palma = new ImageIcon("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/palma.jpg");

    JLabel obrazekFlaming = new JLabel();
    ImageIcon flaming = new ImageIcon("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/flaming.gif");

    JLabel txt = new JLabel("Co Ci chodzi po głowie?");
    JPanel pinkPanel = new JPanel();
    JPanel whitePanel = new JPanel();
    JButton button = new JButton();

    JLabel przyklepane = new JLabel();
    ImageIcon thumb = new ImageIcon("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/IMG_2329.GIF");


    MyFrame(){
        obrazek.setIcon(palma);
        obrazek.setVerticalAlignment(JLabel.TOP);
        //obrazek.setHorizontalAlignment(JLabel.CENTER);
        obrazek.setBounds(300, 0, 354, 354);
        obrazek.setVisible(true);

        obrazekFlaming.setIcon(flaming);
        obrazekFlaming.setBounds(50, 150, 240, 360);


        przyklepane.setIcon(thumb);
        przyklepane.setVerticalAlignment(JLabel.BOTTOM);
        przyklepane.setHorizontalAlignment(JLabel.RIGHT);
        przyklepane.setBounds(350, 500, 283, 283);
        przyklepane.setVisible(false);

        txt.setForeground(Color.white);
        txt.setFont(new Font("Papyrus", Font.ITALIC, 40));
        txt.setHorizontalAlignment(JLabel.CENTER);
        txt.setBounds(100, 150, 500, 150);

        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(0,0,700, 900);
        pinkPanel.setLayout(null);

        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(700, 0, 700, 900);
        whitePanel.setLayout(null);

        button.setBounds(200, 700, 300, 50);
        button.addActionListener(this);
        button.setText("Przyklep swoją szczęśliwą myśl!");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setFont(new Font("NoteWorthy", Font.PLAIN, 20));
        button.setBorder(BorderFactory.createRaisedSoftBevelBorder());

        this.setTitle("POSITIVE VIBES :)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1400,900);
        this.setVisible(true);
        this.add(pinkPanel);
        this.add(whitePanel);
        whitePanel.add(obrazek);
        whitePanel.add(obrazekFlaming);
        whitePanel.add(przyklepane);
        pinkPanel.add(txt);
        pinkPanel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            przyklepane.setVisible(true);
            System.out.println("Have a nice day!");
        }
    }
}
