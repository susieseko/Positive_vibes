import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class FirstWindow extends JFrame implements ActionListener {

    JLabel obrazek = new JLabel();
    ImageIcon palma = new ImageIcon("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/palma.jpg");

    JLabel obrazekFlaming = new JLabel();
    ImageIcon flaming = new ImageIcon("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/flaming.gif");

    JLabel txt = new JLabel("Co Ci chodzi po głowie?");
    JPanel pinkPanel = new JPanel();
    JPanel whitePanel = new JPanel();
    JButton button = new JButton();
    JTextArea textArea = new JTextArea();

    FirstWindow(){
        obrazek.setIcon(palma);
        obrazek.setVerticalAlignment(JLabel.TOP);
        obrazek.setBounds(300, 0, 354, 354);
        obrazek.setVisible(true);

        obrazekFlaming.setIcon(flaming);
        obrazekFlaming.setBounds(50, 150, 240, 360);

        txt.setForeground(Color.white);
        txt.setFont(new Font("Papyrus", Font.ITALIC, 40));
        txt.setHorizontalAlignment(JLabel.CENTER);
        txt.setBounds(100, 150, 500, 150);

        textArea.setBounds(100, 300, 500, 300);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("NoteWorthy", Font.PLAIN, 40));

        button.setBounds(200, 700, 300, 50);
        button.addActionListener(this);
        button.setText("Przyklep swoją szczęśliwą myśl!");
        button.setFocusable(false);
        button.setBackground(Color.red);
        button.setForeground(Color.red);
        button.setFont(new Font("NoteWorthy", Font.PLAIN, 20));

        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(0,0,700, 900);
        pinkPanel.setLayout(null);

        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(700, 0, 700, 900);
        whitePanel.setLayout(null);

        this.setTitle("POSITIVE VIBES :)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());
        this.setSize(1400,900);
        this.setVisible(true);
        this.add(pinkPanel);
        this.add(whitePanel);
        whitePanel.add(obrazek);
        whitePanel.add(obrazekFlaming);
        pinkPanel.add(txt);
        pinkPanel.add(button);
        pinkPanel.add(textArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Have a nice day!");
            try {
                FileWriter plik = new FileWriter("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/teksty", true);
                plik.append(textArea.getText() + "\n");
                plik.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            this.dispose();

            HappyMessage happyMessage = new HappyMessage();
        }
    }
}
