import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayBooking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayBooking frame = new displayBooking("","","","","","","","","","","",0.0,0.0,0.0);
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
	public displayBooking(String name,String ic,String email, String no,String eve,String eveT,String stuR,String date,String time,String loc,String trans,double transFee,double locFee,double total) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookingApplication = new JLabel("Booking Application");
		lblBookingApplication.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblBookingApplication.setBounds(110, 11, 234, 26);
		contentPane.add(lblBookingApplication);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ico.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 0, 80, 81);
		contentPane.add(label);
		
		JLabel lblSuccessfully = new JLabel("Successfully !!!");
		lblSuccessfully.setFont(new Font("Sitka Small", Font.BOLD, 18));
		lblSuccessfully.setBounds(141, 36, 181, 37);
		contentPane.add(lblSuccessfully);
		
		JLabel lblNameOrganizer = new JLabel("Name Organizer          : ");
		lblNameOrganizer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNameOrganizer.setBounds(44, 92, 152, 14);
		contentPane.add(lblNameOrganizer);
		
		JLabel lblIcOrganizer = new JLabel("IC Organizer               : ");
		lblIcOrganizer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIcOrganizer.setBounds(44, 117, 152, 14);
		contentPane.add(lblIcOrganizer);
		
		JLabel lblEmailOrganizer = new JLabel("Email Organizer           :");
		lblEmailOrganizer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmailOrganizer.setBounds(44, 142, 181, 14);
		contentPane.add(lblEmailOrganizer);
		
		JLabel lblEventName = new JLabel("Event Name                :");
		lblEventName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEventName.setBounds(44, 192, 181, 14);
		contentPane.add(lblEventName);
		
		JLabel lblTypeOfEvent = new JLabel("Type of Event              :");
		lblTypeOfEvent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTypeOfEvent.setBounds(44, 217, 169, 14);
		contentPane.add(lblTypeOfEvent);
		
		JLabel lblStudentRequirement = new JLabel("Student Requirement   :");
		lblStudentRequirement.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStudentRequirement.setBounds(44, 242, 141, 14);
		contentPane.add(lblStudentRequirement);
		
		JLabel lblDate = new JLabel("Date                           :");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDate.setBounds(44, 267, 152, 14);
		contentPane.add(lblDate);
		
		JLabel lblTime = new JLabel("Time                          :");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTime.setBounds(44, 292, 141, 14);
		contentPane.add(lblTime);
		
		JLabel lblLocation = new JLabel("Location                      :");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLocation.setBounds(44, 317, 141, 14);
		contentPane.add(lblLocation);
		
		JLabel lblTransportationFeeRm = new JLabel("Transportation Fee       : RM");
		lblTransportationFeeRm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTransportationFeeRm.setBounds(44, 370, 169, 14);
		contentPane.add(lblTransportationFeeRm);
		
		JLabel lblLocationFeeRm = new JLabel("Location Fee                : RM");
		lblLocationFeeRm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLocationFeeRm.setBounds(44, 395, 181, 14);
		contentPane.add(lblLocationFeeRm);
		
		JLabel lblTotalPaymentRm = new JLabel("Total Payment             : RM  ");
		lblTotalPaymentRm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotalPaymentRm.setBounds(44, 420, 181, 14);
		contentPane.add(lblTotalPaymentRm);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(165, 482, 89, 23);
		contentPane.add(btnClose);
		
		JLabel orgLabel = new JLabel("");
		orgLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		orgLabel.setBounds(189, 93, 235, 14);
		contentPane.add(orgLabel);
		orgLabel.setText(name);
		
		JLabel icLabel = new JLabel("");
		icLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		icLabel.setBounds(189, 118, 120, 14);
		contentPane.add(icLabel);
		icLabel.setText(ic);
		
		JLabel emailLabel = new JLabel("");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailLabel.setBounds(189, 143, 120, 14);
		contentPane.add(emailLabel);
		emailLabel.setText(email);
		
		JLabel eveLabel = new JLabel("");
		eveLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eveLabel.setBounds(189, 192, 235, 14);
		contentPane.add(eveLabel);
		eveLabel.setText(eve);
		
		JLabel typeEveLabel = new JLabel("");
		typeEveLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		typeEveLabel.setBounds(189, 218, 120, 14);
		contentPane.add(typeEveLabel);
		typeEveLabel.setText(eveT);
		
		JLabel stuLabel = new JLabel("");
		stuLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		stuLabel.setBounds(189, 242, 120, 14);
		contentPane.add(stuLabel);
		stuLabel.setText(stuR);
		
		JLabel dateLabel = new JLabel("");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dateLabel.setBounds(189, 268, 120, 14);
		contentPane.add(dateLabel);
		dateLabel.setText(date);
		
		JLabel timeLabel = new JLabel("");
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		timeLabel.setBounds(189, 293, 120, 14);
		contentPane.add(timeLabel);
		timeLabel.setText(time);
		
		JLabel locationLabel = new JLabel("");
		locationLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		locationLabel.setBounds(189, 318, 120, 14);
		contentPane.add(locationLabel);
		locationLabel.setText(loc);
		
		JLabel transLabel = new JLabel("");
		transLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		transLabel.setBounds(210, 370, 120, 14);
		contentPane.add(transLabel);
		transLabel.setText(Double.toString(transFee));
		
		
		JLabel locLabel = new JLabel("");
		locLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		locLabel.setBounds(210, 396, 120, 14);
		contentPane.add(locLabel);
		locLabel.setText(Double.toString(locFee));
		
		JLabel totalPayment = new JLabel("");
		totalPayment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalPayment.setBounds(210, 421, 120, 14);
		contentPane.add(totalPayment);
		totalPayment.setText(Double.toString(total));
		
		JLabel lblOrganizerNo = new JLabel("Organizer Number       :");
		lblOrganizerNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrganizerNo.setBounds(44, 167, 181, 14);
		contentPane.add(lblOrganizerNo);
		
		JLabel orgNum = new JLabel("");
		orgNum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		orgNum.setBounds(189, 167, 110, 14);
		contentPane.add(orgNum);
		orgNum.setText(no);
		
		JLabel lblTransportation = new JLabel("Transportation             :");
		lblTransportation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTransportation.setBounds(44, 342, 152, 14);
		contentPane.add(lblTransportation);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(189, 343, 141, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(trans);
		
		textField = new JTextField();
		textField.setBackground(Color.ORANGE);
		textField.setEditable(false);
		textField.setBounds(185, 415, 110, 24);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
