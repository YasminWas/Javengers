import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search {
    private JButton searchButton;
    private JButton clearButton;
    private JPanel searchView;
    private JTextField search;


    public static void main(String [] args){
            JFrame frame = new JFrame("Search");
            frame.setContentPane(new Search().searchView);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        }
   }


