package classes;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Graphics extends JFrame implements ActionListener {
    
    private ArrayList<Ticket> tickets = Tickets.tickets;
    
    private Zone principal = new Zone("Principal", 200, 2500, 1750);
    private Zone box = new Zone("Box", 40, 7000, 4000);
    private Zone central = new Zone("Central", 400, 2000, 1400);
    private Zone side = new Zone("Side", 100, 1550, 1000);
    
    private JPanel panel;

    private JLabel name;
    private JTextField tname;
    private JLabel zone;
    private JComboBox<String> czone;
    private JLabel discount;
    private JComboBox<String> cdiscount;
    private JButton buyTicket;
    private JButton consult;
    private JButton consultByZone;
    private JButton cancel;
    private JButton buySubmit;
    private JButton reset;
    private JTextArea tout;

    private String zonesOptions[] = {"Principal", "Box", "Central", "Side"};
    private String discountsOptions[] = {"Normal", "Discount", "Old Age"};


    public Graphics() {

        setSize(900, 600);
        setTitle("Magic Monkey Theater");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        initializeComponents();
        menu();
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);      
    
    }

    private void initializeComponents() {
    
        panel = new JPanel();
        panel.setLayout(null);
                
        this.getContentPane().add(panel);
    
    }

    private void clearPanel() {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
        this.getContentPane().add(panel);
    }

    private void menu() {
        
        JLabel title;
        
        title = new JLabel("Magic Monkey Theater");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(360, 40);
        panel.add(title);

        buyTicket = new JButton("Buy Ticket");
        buyTicket.setFont(new Font("Arial", Font.PLAIN, 16));
        buyTicket.setSize(200, 60);
        buyTicket.setLocation(360, 100);
        buyTicket.addActionListener(this);
        panel.add(buyTicket);

        consult = new JButton("Consult");
        consult.setFont(new Font("Arial", Font.PLAIN, 16));
        consult.setSize(200, 60);
        consult.setLocation(360, 200);
        consult.addActionListener(this);
        panel.add(consult);

        consultByZone = new JButton("Consult By Zone");
        consultByZone.setFont(new Font("Arial", Font.PLAIN, 16));
        consultByZone.setSize(200, 60);
        consultByZone.setLocation(360, 300);
        consultByZone.addActionListener(this);
        panel.add(consultByZone);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 16));
        cancel.setSize(200, 60);
        cancel.setLocation(360, 400);
        cancel.addActionListener(this);
        panel.add(cancel);
    
    }

    private void buyTicket() {
 
        JLabel title;

        title = new JLabel("Buy Ticket");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        name = new JLabel("Enter name");
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setSize(140, 20);
        name.setLocation(100, 100);
        panel.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 14));
        tname.setSize(190, 20);
        tname.setLocation(100, 130);
        panel.add(tname);

        zone = new JLabel("Select zone");
        zone.setFont(new Font("Arial", Font.PLAIN, 16));
        zone.setSize(180, 20);
        zone.setLocation(100, 200);
        panel.add(zone);

        czone = new JComboBox<String>(zonesOptions);
        czone.setFont(new Font("Arial", Font.PLAIN, 15));
        czone.setSize(160, 20);
        czone.setLocation(100, 230);
        panel.add(czone);

        discount = new JLabel("Select discount type");
        discount.setFont(new Font("Arial", Font.PLAIN, 16));
        discount.setSize(180, 20);
        discount.setLocation(100, 300);
        panel.add(discount);

        cdiscount = new JComboBox<String>(discountsOptions);
        cdiscount.setFont(new Font("Arial", Font.PLAIN, 15));
        cdiscount.setSize(160, 20);
        cdiscount.setLocation(100, 330);
        panel.add(cdiscount);

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

        buySubmit = new JButton("buySubmit");
        buySubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        buySubmit.setSize(100, 30);
        buySubmit.setLocation(100, 420);
        buySubmit.addActionListener(this);
        panel.add(buySubmit);
        
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 16));
        reset.setSize(100, 30);
        reset.setLocation(200, 420);
        reset.addActionListener(this);
        panel.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            
            if (e.getSource() == buyTicket) {
            
                clearPanel();
                buyTicket();
            
            } else if (e.getSource() == consult) {
            
                System.out.println("Consult");
            
            } else if (e.getSource() == consultByZone) {
                System.out.println("Consult by zone");
            
            } else if (e.getSource() == cancel) {
                System.out.println("Cancel");
            
            } else if (e.getSource() == buySubmit) {
                
                String zoneValue = (String)czone.getSelectedItem();
                String discountValue = (String)cdiscount.getSelectedItem();
                double cost = 0;

                switch (zoneValue) {
                    case "Principal":
                        if (principal.getAvailability() == 0) {
                            tout.setText("Not available principal seats.");
                            tout.setEditable(false);
                        }
                        principal.setAvailability(principal.getAvailability()-1);
                        if (discountValue.equals("Old Age")) {
                            cost = principal.getOldAgePrice();
                        } else {
                            cost = principal.getPrice();
                        }
                        break;
                    case "Box":
                        if (box.getAvailability() == 0) {
                            tout.setText("Not available box seats.");
                            tout.setEditable(false);
                        }   
                        box.setAvailability(box.getAvailability()-1);
                        if (discountValue.equals("Old Age")) {
                            cost = box.getOldAgePrice();
                        } else {
                            cost = box.getPrice();
                        }
                        break;
                    case "Central":
                        if (central.getAvailability() == 0) {
                            tout.setText("Not available central seats.");
                            tout.setEditable(false);
                        }
                        central.setAvailability(central.getAvailability()-1);
                        if (discountValue.equals("Old Age")) {
                            cost = central.getOldAgePrice();
                        } else {
                            cost = central.getPrice();
                        }
                        break;
                    case "Side":
                        if (side.getAvailability() == 0) {
                            tout.setText("Not available side seats.");
                            tout.setEditable(false);
                        }
                        side.setAvailability(side.getAvailability()-1);
                        if (discountValue.equals("Old Age")) {
                            cost = side.getOldAgePrice();
                        } else {
                            cost = side.getPrice();
                        }
                        break;
                    default:
                        break;
                }
                
                if ( discountValue == "Discount" ) {
                    cost *= .85;
                }
                
                String nameValue = tname.getText();
                
                Client client = new Client(nameValue, discountValue);
                Ticket ticket = new Ticket(Tickets.getNextId(), zoneValue, nameValue, cost);
                
                client.setTicket(ticket);

                tickets.add(ticket);
                
                DecimalFormat df4 = new DecimalFormat("#.##");

                String data
                            = "Ticket buyed successfully\n\n"
                            + "Name: "
                            + nameValue + "\n"
                            + "Zone: "
                            + zoneValue + "\n"
                            + "Discount Type: "
                            + discountValue + "\n"
                            + "Cost: "
                            + "$" + df4.format(cost);
                
                tout.setText(data);
                tout.setEditable(false);

            } else if (e.getSource() == reset) {
                tname.setText("");
                czone.setSelectedIndex(0);
                cdiscount.setSelectedIndex(0);
                tout.setText("");
                tout.setEditable(false);
            }

        } catch (Exception error) {
            System.out.println(error);
        }

    }
}
