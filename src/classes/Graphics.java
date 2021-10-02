package classes;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    private JLabel id;
    private JTextField tid;
    private JButton buyTicket;
    private JButton consult;
    private JButton consultByZone;
    private JButton cancel;
    private JButton buySubmit;
    private JButton consultSubmit;
    private JButton consultByZoneSubmit;
    private JButton cancelSubmit;
    private JButton menu;
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

        buySubmit = new JButton("Submit");
        buySubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        buySubmit.setSize(100, 30);
        buySubmit.setLocation(100, 400);
        buySubmit.addActionListener(this);
        panel.add(buySubmit);
        
        menu = new JButton("Menu");
        menu.setFont(new Font("Arial", Font.PLAIN, 16));
        menu.setSize(100, 30);
        menu.setLocation(100, 440);
        menu.addActionListener(this);
        panel.add(menu);
    }

    private void consult() {
 
        JLabel title;

        title = new JLabel("Consult");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        id = new JLabel("Enter id");
        id.setFont(new Font("Arial", Font.PLAIN, 16));
        id.setSize(140, 20);
        id.setLocation(100, 100);
        panel.add(id);
  
        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 14));
        tid.setSize(190, 20);
        tid.setLocation(100, 130);
        panel.add(tid);

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

        consultSubmit = new JButton("Submit");
        consultSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        consultSubmit.setSize(100, 30);
        consultSubmit.setLocation(100, 400);
        consultSubmit.addActionListener(this);
        panel.add(consultSubmit);
        
        menu = new JButton("Menu");
        menu.setFont(new Font("Arial", Font.PLAIN, 16));
        menu.setSize(100, 30);
        menu.setLocation(100, 440);
        menu.addActionListener(this);
        panel.add(menu);
    }

    private void consultByZone() {
 
        JLabel title;

        title = new JLabel("Consult By Zone");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        zone = new JLabel("Select zone");
        zone.setFont(new Font("Arial", Font.PLAIN, 16));
        zone.setSize(180, 20);
        zone.setLocation(100, 100);
        panel.add(zone);

        czone = new JComboBox<String>(zonesOptions);
        czone.setFont(new Font("Arial", Font.PLAIN, 15));
        czone.setSize(160, 20);
        czone.setLocation(100, 130);
        panel.add(czone);

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

        consultByZoneSubmit = new JButton("Submit");
        consultByZoneSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        consultByZoneSubmit.setSize(100, 30);
        consultByZoneSubmit.setLocation(100, 400);
        consultByZoneSubmit.addActionListener(this);
        panel.add(consultByZoneSubmit);
                
        menu = new JButton("Menu");
        menu.setFont(new Font("Arial", Font.PLAIN, 16));
        menu.setSize(100, 30);
        menu.setLocation(100, 440);
        menu.addActionListener(this);
        panel.add(menu);
    }

    private void cancel() {
 
        JLabel title;

        title = new JLabel("Cancel");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        id = new JLabel("Enter id");
        id.setFont(new Font("Arial", Font.PLAIN, 16));
        id.setSize(140, 20);
        id.setLocation(100, 100);
        panel.add(id);
  
        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 14));
        tid.setSize(190, 20);
        tid.setLocation(100, 130);
        panel.add(tid);

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

        cancelSubmit = new JButton("Submit");
        cancelSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        cancelSubmit.setSize(100, 30);
        cancelSubmit.setLocation(100, 400);
        cancelSubmit.addActionListener(this);
        panel.add(cancelSubmit);
        
        menu = new JButton("Menu");
        menu.setFont(new Font("Arial", Font.PLAIN, 16));
        menu.setSize(100, 30);
        menu.setLocation(100, 440);
        menu.addActionListener(this);
        panel.add(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            
            if (e.getSource() == buyTicket) {
                clearPanel();
                buyTicket();
            } else if (e.getSource() == consult) {
                clearPanel();
                consult();
            } else if (e.getSource() == consultByZone) {
                clearPanel();
                consultByZone();
            
            } else if (e.getSource() == cancel) {
                clearPanel();
                cancel();
            
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
                Ticket ticket = new Ticket(Tickets.getNextId(), zoneValue, nameValue, discountValue, cost);
                
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

            } else if(e.getSource() == consultSubmit){
                 
                int idValue = Integer.valueOf(tid.getText());

                String data = "";

                for (Ticket ticket: tickets) {
                    if (ticket.getId() == idValue) {
                       data += ticket.toString(); 
                    }
                }
                
                if (data.isEmpty()) {
                    data = "\nNo ticket founded :(";
                }

                tout.setText(data);
                tout.setEditable(false);


            } else if(e.getSource() == consultByZoneSubmit){
                 
                String zoneValue = (String)czone.getSelectedItem();
                String data = "";
                Double totalCost = 0.0;
                int totalTickets = 0;
                DecimalFormat df4 = new DecimalFormat("#.##");

                for (Ticket ticket : tickets) {
                    if (ticket.getZone().equals(zoneValue)) {
                        if (totalTickets == 0) {
                            data += ticket.toString();
                            totalCost += ticket.getCost();
                            totalTickets++;    
                        } else {
                            data += "\n" + ticket.toString();
                            totalCost += ticket.getCost();
                            totalTickets++;
                        }
                    }
                }
                
                if (totalTickets==0) {
                    data = "\nNo tickets buyed yet :(";
                } else {
                    data += "\n\nTotal tickets: " + totalTickets; 
                    data += "\nTotal cost: " + "$" + df4.format(totalCost); 
                }

                tout.setText(data);
                tout.setEditable(false);

            } else if(e.getSource() == cancelSubmit) {
                
                int idValue = Integer.valueOf(tid.getText());
                String data;
                boolean found = false;

                for (Ticket ticket: tickets) {
                    if (ticket.getId() == idValue) {
                       tickets.remove(ticket);
                       found = true;
                    }
                }
                
                if (found) {
                    data = "\nTicket canceled successfully!";
                } else {
                    data = "\nNo ticket founded :(";
                }

                tout.setText(data);
                tout.setEditable(false);

            } else if(e.getSource() == menu) {
                clearPanel();
                menu();
            }

        } catch (Exception error) {
            System.out.println(error);
        }

    }
}
