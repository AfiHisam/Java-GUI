import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class subBooking extends JFrame {

	private JPanel contentPane;
	private JTextField orgName;
	private JTextField OrgIc;
	private JTextField OrgEmail;
	private JTextField OrgNo;
	private JTextField EveName;
	private JTextField date;
	private String msg2;
	private String stu2;
	private double transFee=0.0;
	private String t1,t2,t3,t4;
	private String loc,trans;
	private double locFee=0.0;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subBooking frame = new subBooking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public subBooking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookingApplication = new JLabel("Booking Application");
		lblBookingApplication.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBookingApplication.setBounds(123, 11, 201, 23);
		contentPane.add(lblBookingApplication);
		
		JLabel lblOrganizerName = new JLabel("Organizer Name        :");
		lblOrganizerName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrganizerName.setBounds(10, 87, 142, 14);
		contentPane.add(lblOrganizerName);
		
		JLabel lblOrganizerIc = new JLabel("Organizer IC             :");
		lblOrganizerIc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrganizerIc.setBounds(10, 112, 142, 14);
		contentPane.add(lblOrganizerIc);
		
		JLabel lblOrganizerEmail = new JLabel("Organizer Email        :");
		lblOrganizerEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrganizerEmail.setBounds(10, 137, 142, 14);
		contentPane.add(lblOrganizerEmail);
		
		JLabel lblOrganizerContactNo = new JLabel("Organizer Contact No :");
		lblOrganizerContactNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrganizerContactNo.setBounds(10, 164, 142, 14);
		contentPane.add(lblOrganizerContactNo);
		
		JLabel lblEventName = new JLabel("Event Name              :");
		lblEventName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEventName.setBounds(10, 192, 142, 14);
		contentPane.add(lblEventName);
		
		JLabel lblTypeOfEvent = new JLabel("Type of Event            :");
		lblTypeOfEvent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTypeOfEvent.setBounds(10, 217, 142, 14);
		contentPane.add(lblTypeOfEvent);
		
		JLabel lblHowManyPeople = new JLabel("Student Required       :");
		lblHowManyPeople.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHowManyPeople.setBounds(10, 242, 142, 14);
		contentPane.add(lblHowManyPeople);
		
		JLabel lblLocation = new JLabel("Location                    :");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLocation.setBounds(10, 367, 142, 14);
		contentPane.add(lblLocation);
		
		JLabel lblDate = new JLabel("Date                         :");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDate.setBounds(10, 317, 142, 14);
		contentPane.add(lblDate);
		
		JLabel lblTime = new JLabel("Time                        :");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTime.setBounds(10, 342, 142, 14);
		contentPane.add(lblTime);
		
		orgName = new JTextField();
		orgName.setBounds(145, 85, 238, 20);
		contentPane.add(orgName);
		orgName.setColumns(10);
		
		OrgIc = new JTextField();
		OrgIc.setColumns(10);
		OrgIc.setBounds(145, 110, 121, 20);
		contentPane.add(OrgIc);
		
		OrgEmail = new JTextField();
		OrgEmail.setColumns(10);
		OrgEmail.setBounds(145, 135, 142, 20);
		contentPane.add(OrgEmail);
		
		OrgNo = new JTextField();
		OrgNo.setColumns(10);
		OrgNo.setBounds(145, 162, 121, 20);
		contentPane.add(OrgNo);
		
		EveName = new JTextField();
		EveName.setColumns(10);
		EveName.setBounds(145, 190, 238, 20);
		contentPane.add(EveName);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					if (e.getSource() == comboBox){
					
					JComboBox cb = (JComboBox)e.getSource();
                    
					String msg = (String)cb.getSelectedItem();
					
					
					if (msg == "Tahlil"){ msg2 = "Tahlil"; }
					else if (msg == "Khatam Al-Quran"){ msg2 = "Khatam Al-Quran"; }
					else if (msg == "Doa Selamat"){ msg2 = "Doa Selamat"; }
					else if (msg == "Nasyid"){ msg2 = "Nasyid"; }
					else if (msg == "Select Type of Event"){JOptionPane.showMessageDialog(null,"Please Select type of Event"); }
					
					
					
					}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Type of Event","Tahlil", "Khatam Al-Quran", "Doa Selamat", "Nasyid"}));
		comboBox.setBounds(144, 217, 171, 20);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnPeople = new JRadioButton("8 Student ( 1 Van) RM 330");
		buttonGroup_1.add(rdbtnPeople);
		rdbtnPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String stu = rdbtnPeople.getText();
					stu2 = "8 Student";
					trans = "1 Van";
					transFee = 330;
	
			}
		});
		rdbtnPeople.setBounds(145, 239, 170, 23);
		contentPane.add(rdbtnPeople);
	
		
		JRadioButton rdbtnPeople_1 = new JRadioButton("9-16 Student ( 2 Van) RM 660");
		buttonGroup_1.add(rdbtnPeople_1);
		rdbtnPeople_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					stu2 = "9-16 Student";
					trans = "2 Van";
					transFee = 660; 
			}
		});
		rdbtnPeople_1.setBounds(145, 263, 214, 23);
		contentPane.add(rdbtnPeople_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(">19 Student ( Bus ) RM 950");
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stu2 = ">19 Student";
				trans = "1 Bus";
				transFee = 950; 
			}
		});
		rdbtnNewRadioButton.setBounds(145, 287, 214, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(145, 315, 94, 20);
		contentPane.add(date);
		
		JRadioButton rdbtnJasin = new JRadioButton("Merlimau ( RM 50)");
		buttonGroup_2.add(rdbtnJasin);
		rdbtnJasin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loc = "Merlimau";
				locFee = 50;
			}
		});
		rdbtnJasin.setBounds(145, 364, 179, 23);
		contentPane.add(rdbtnJasin);
		
		JRadioButton rdbtnMelaka = new JRadioButton("Jasin ( RM 100)");
		buttonGroup_2.add(rdbtnMelaka);
		rdbtnMelaka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loc = "Jasin";
				locFee = 100;
			}
		});
		rdbtnMelaka.setBounds(145, 388, 179, 23);
		contentPane.add(rdbtnMelaka);
		
		JRadioButton rdbtnMelakaTengah = new JRadioButton("Melaka Tengah ( RM 150)");
		buttonGroup_2.add(rdbtnMelakaTengah);
		rdbtnMelakaTengah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loc = "Melaka Tengah";
				locFee = 150;
			}
		});
		rdbtnMelakaTengah.setBounds(145, 410, 170, 23);
		contentPane.add(rdbtnMelakaTengah);
		
		JLabel lblchargeForLocation = new JLabel("*Charge for location");
		lblchargeForLocation.setBounds(10, 384, 109, 14);
		contentPane.add(lblchargeForLocation);
		
		JLabel lblchargeForTransportation = new JLabel("*Charge for transportation");
		lblchargeForTransportation.setBounds(10, 256, 142, 14);
		contentPane.add(lblchargeForTransportation);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if (e.getSource() == comboBox_1){
				
				JComboBox cb = (JComboBox)e.getSource();
                
				String msg = (String)cb.getSelectedItem();
				
				if(msg=="1"){t1="1";}
				else if(msg=="2"){t1="2";}
				else if(msg=="3"){t1="3";}
				else if(msg=="4"){t1="4";}
				else if(msg=="5"){t1="5";}
				else if(msg=="6"){t1="6";}
				else if(msg=="7"){t1="7";}
				else if(msg=="8"){t1="8";}
				else if(msg=="9"){t1="9";}
				else if(msg=="10"){t1="10";}
				else if(msg=="11"){t1="11";}
				else if(msg=="12"){t1="12";}
				else if(msg=="0"){JOptionPane.showMessageDialog(null,"Select Hour");}
				}
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(145, 342, 40, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if (e.getSource() == comboBox_2){
					
					JComboBox cb = (JComboBox)e.getSource();
	                
					String msg = (String)cb.getSelectedItem();
					
					if(msg=="AM"){t2="AM";}
					else if (msg=="PM"){t2="PM";}
					else if (msg=="..M"){JOptionPane.showMessageDialog(null, "Please Select a midday AM or PM");}
					
					
					}
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"..M","AM", "PM"}));
		comboBox_2.setBounds(195, 342, 44, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblUntil = new JLabel("until");
		lblUntil.setBounds(250, 345, 46, 14);
		contentPane.add(lblUntil);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((orgName.getText().trim().length()==0)||
						(OrgIc.getText().trim().length()==0)||
						(OrgEmail.getText().trim().length()==0)||
						(OrgNo.getText().trim().length()==0)||
						(EveName.getText().trim().length()==0)||
						(date.getText().trim().length()==0)){
					
					JOptionPane.showMessageDialog(null, "Please fill all form !!!");
				}
				
				
				
				
				else{
				dispose();
			    String OName = orgName.getText();
			    String Oic = OrgIc.getText();
			    String OEmail = OrgEmail.getText();
			    String ONo = OrgNo.getText();
			    String EName = EveName.getText();
			    String Date = date.getText();
			    String tt = t1+" "+t2+"  until  "+""+t3+" "+t4;
			    double total = transFee+locFee;
			    
			    displayBooking db = new displayBooking(OName,Oic,OEmail,ONo,EName,msg2,stu2,Date,tt,loc,trans,transFee,locFee,total);
			    db.setVisible(true);
			}
				}
		});
		btnSubmit.setBounds(214, 464, 82, 23);
		contentPane.add(btnSubmit);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				if (e.getSource() == comboBox_3){
				
				JComboBox cb = (JComboBox)e.getSource();
                
				String msg = (String)cb.getSelectedItem();
				
				if(msg=="1"){t3="1";}
				else if(msg=="2"){t3="2";}
				else if(msg=="3"){t3="3";}
				else if(msg=="4"){t3="4";}
				else if(msg=="5"){t3="5";}
				else if(msg=="6"){t3="6";}
				else if(msg=="7"){t3="7";}
				else if(msg=="8"){t3="8";}
				else if(msg=="9"){t3="9";}
				else if(msg=="10"){t3="10";}
				else if(msg=="11"){t3="11";}
				else if(msg=="12"){t3="12";}
				else if(msg=="0"){JOptionPane.showMessageDialog(null,"Select Hour");}
				}
				
				
				
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setBounds(284, 342, 40, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if (e.getSource() == comboBox_4){
					
					JComboBox cb = (JComboBox)e.getSource();
	                
					String msg = (String)cb.getSelectedItem();
					
					if(msg=="AM"){t4="AM";}
					else if (msg=="PM"){t4="PM";}
					else if (msg=="..M"){JOptionPane.showMessageDialog(null, "Please Select a midday AM or PM");}
					
					
					}
				
			}
		});
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"..M","AM", "PM"}));
		comboBox_4.setBounds(334, 342, 44, 20);
		contentPane.add(comboBox_4);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ico.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 0, 85, 78);
		contentPane.add(label);
		
		JLabel lblBookingAsSolihin = new JLabel("Booking As Solihin Student for an Event");
		lblBookingAsSolihin.setBounds(123, 47, 278, 14);
		contentPane.add(lblBookingAsSolihin);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				main mn = new main();
				mn.setVisible(true);
			}
		});
		btnBack.setBounds(123, 464, 82, 23);
		contentPane.add(btnBack);
		
		JLabel lblExp = new JLabel("E.g. 12/12/16");
		lblExp.setBounds(249, 318, 110, 14);
		contentPane.add(lblExp);
	}
}
