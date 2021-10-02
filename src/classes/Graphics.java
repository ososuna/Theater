package classes;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Graphics extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel title;
    private JLabel amount;
    private JTextField tamount;
    private JLabel paydown;
    private JTextField tpaydown;
    private JLabel interest;
    private JLabel option;
    private JComboBox<String> coption;
    private JButton submit;
    private JButton reset;
    private JTextArea tout;

    private String options[] = {"12 months", "24 months", "36 months"};

    public Graphics() {

        setSize(900, 600);
        setTitle("Credit Simulator");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        initializeComponents();
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);      
    
    }

    private void initializeComponents() {
    
        panel = new JPanel();
        panel.setLayout(null);
        
        title = new JLabel("Credit Simulator");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(200, 20);
        title.setLocation(379, 40);
        panel.add(title);
        
        amount = new JLabel("Select amount");
        amount.setFont(new Font("Arial", Font.PLAIN, 16));
        amount.setSize(140, 20);
        amount.setLocation(100, 100);
        panel.add(amount);
  
        tamount = new JTextField();
        tamount.setFont(new Font("Arial", Font.PLAIN, 14));
        tamount.setSize(190, 20);
        tamount.setLocation(100, 130);
        panel.add(tamount);

        paydown = new JLabel("Select paydown");
        paydown.setFont(new Font("Arial", Font.PLAIN, 16));
        paydown.setSize(140, 20);
        paydown.setLocation(100, 190);
        panel.add(paydown);
  
        tpaydown = new JTextField();
        tpaydown.setFont(new Font("Arial", Font.PLAIN, 14));
        tpaydown.setSize(190, 20);
        tpaydown.setLocation(100, 220);
        panel.add(tpaydown);

        interest = new JLabel("Interest rate: 15.99%");
        interest.setFont(new Font("Arial", Font.PLAIN, 16));
        interest.setSize(180, 20);
        interest.setLocation(100, 280);
        panel.add(interest);

        option = new JLabel("Select payment option");
        option.setFont(new Font("Arial", Font.PLAIN, 16));
        option.setSize(180, 20);
        option.setLocation(100, 330);
        panel.add(option);

        coption = new JComboBox<String>(options);
        coption.setFont(new Font("Arial", Font.PLAIN, 15));
        coption.setSize(160, 20);
        coption.setLocation(100, 360);
        panel.add(coption);

        tout = new JTextArea();
        tout.setBorder(BorderFactory.createCompoundBorder(
        tout.getBorder(), 
        BorderFactory.createEmptyBorder(20, 20, 5, 20)));
        tout.setFont(new Font("Arial", Font.PLAIN, 16));
        tout.setSize(400, 400);
        tout.setLocation(360, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel.add(tout);

        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 16));
        submit.setSize(100, 30);
        submit.setLocation(100, 420);
        submit.addActionListener(this);
        panel.add(submit);
        
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 16));
        reset.setSize(100, 30);
        reset.setLocation(200, 420);
        reset.addActionListener(this);
        panel.add(reset);
        
        this.getContentPane().add(panel);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {

            Double amountValue = Double.parseDouble(tamount.getText());
            Double paydownValue = Double.parseDouble(tpaydown.getText());
            String optionValue = (String)coption.getSelectedItem();

            if(e.getSource() == submit) {


            } else if (e.getSource() == reset) {
 
            }
        } catch (Exception error) {
            System.out.println(error);
        }

    }
}
