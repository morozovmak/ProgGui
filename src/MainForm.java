import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class MainForm extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JButton button1;
    private JButton getImageButton;
    private JButton entURLButton;
    private JTextArea enterUrlTextArea;
    private JComboBox comboBox1;
    private JPanel JPanel2;
    private JPanel JPanel3;
    private JLabel imagelable;
    private JMenuBar menuBar;
    private static JMenu File,Option;
    private JMenuItem SaveImage, Exit;

    public MainForm() {


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.setImage(new URL(enterUrlTextArea.getText()));
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ссылка не работает");
                }
            }
        });
        getImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.getImage()==null){return;}
                imagelable.setIcon(new ImageIcon(Main.getImage()));
                imagelable.updateUI();
            }
        });
    }


    public static void main(String[] args) {

        JFrame frame=new JFrame("MainForm");
        frame.setContentPane(new MainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar=new JMenuBar();
        JMenu File =new JMenu("File");
        JMenu Option=new JMenu("Option");
        menuBar.add(File);
        menuBar.add(Option);

        JMenuItem sImage = new JMenuItem("Save Image");
        File.add(sImage);

        JMenuItem opt = new JMenuItem("Exit");
        Option.add(opt);

        menuBar.setVisible(true);

        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(900,600);

    }



    }
