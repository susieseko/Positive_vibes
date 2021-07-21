import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HappyMessage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel tekst = new JLabel("Twoja szczęśliwa myśl na dziś to:");
    JLabel haslo = new JLabel();
    JButton button = new JButton();
    JLayeredPane layeredPane = new JLayeredPane();

    HappyMessage(){
        layeredPane.setBounds(0, 0, 1400, 900);
        layeredPane.add(label, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(tekst, JLayeredPane.DRAG_LAYER);
        layeredPane.add(button, JLayeredPane.DRAG_LAYER);
        layeredPane.add(haslo, JLayeredPane.DRAG_LAYER);

        label.setOpaque(true);
        label.setBounds(0,0,1400,900);
        label.setBackground(Color.pink);

        tekst.setOpaque(true);
        tekst.setBounds(300,100,800,300);
        tekst.setHorizontalAlignment(JLabel.CENTER);
        tekst.setBackground(Color.pink);
        tekst.setForeground(Color.white);
        tekst.setFont(new Font("Papyrus", Font.BOLD, 50));

        button.setBounds(400, 400, 600, 200);
        button.setText("Uchyl rąbka tajemnicy (:");
        button.setFocusable(false);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setBackground(Color.pink);
        button.setForeground(Color.pink);
        button.setFont(new Font("NoteWorthy", Font.BOLD, 20));
        button.addActionListener(this);

        haslo.setOpaque(true);
        haslo.setVisible(false);
        haslo.setBounds(400,400,600,200);
        haslo.setHorizontalAlignment(JLabel.CENTER);
        haslo.setVerticalAlignment(JLabel.CENTER);
        haslo.setForeground(Color.pink);
        haslo.setFont(new Font("NoteWorthy", Font.PLAIN, 50));

        frame.setTitle("POSITIVE VIBES :)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1400,900);
        frame.setVisible(true);
        frame.add(layeredPane);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            button.setVisible(false);
            Random random = new Random();
            ArrayList<String> listaTekstow = new ArrayList<>();
            int count = 0;
            File plik = new File("/Users/zuzia/Library/Mobile Documents/com~apple~CloudDocs/MINE/JAVA/Positive vibes/src/teksty");
            try {
                Scanner sc = new Scanner(plik);

                while(sc.hasNextLine()){
                    String wiersz = sc.nextLine();
                    listaTekstow.add(wiersz);
                    count++;
                }

                sc.close();

                int r = random.nextInt(count-1);
                haslo.setText(listaTekstow.get(r));
                haslo.setVisible(true);

            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        }
    }
}
