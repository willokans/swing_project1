import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JButton btn;
    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame(){
        super("Hello World!");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new TextPanel();
        btn = new JButton("Click me");

        toolbar.setTextPanel(textPanel);

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//        https://www.youtube.com/watch?v=WRwPVZ4jmNY&t=612s
    }
}
