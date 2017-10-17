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
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;

public class subStudent extends JFrame {

	private JPanel contentPane;
	private JTextField nameInput;
	private JTextField icInput;
	private JTextField contInput;
	private String msg2;
	private String msg3;
	private double fee = 0.0;
	private String disc;
	private double tfee = 0.0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subStudent frame = new subStudent();
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
	public subStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentApplication = new JLabel("Student Application");
		lblStudentApplication.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblStudentApplication.setBounds(101, 25, 209, 30);
		contentPane.add(lblStudentApplication);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				main mn = new main();
				mn.setVisible(true);
			}
		});
		btnBack.setBounds(101, 364, 73, 23);
		contentPane.add(btnBack);
		
		JLabel lblName = new JLabel("Name            :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(10, 116, 90, 14);
		contentPane.add(lblName);
		
		nameInput = new JTextField();
		nameInput.setBounds(117, 114, 247, 20);
		contentPane.add(nameInput);
		nameInput.setColumns(10);
		
		icInput = new JTextField();
		icInput.setBounds(119, 139, 102, 20);
		contentPane.add(icInput);
		icInput.setColumns(10);
		
		JLabel lblIc = new JLabel("IC                 :");
		lblIc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIc.setBounds(10, 141, 90, 14);
		contentPane.add(lblIc);
		
		JLabel lblRegisterNewStudent = new JLabel("As Solihin Student Registration");
		lblRegisterNewStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRegisterNewStudent.setBounds(101, 66, 195, 14);
		contentPane.add(lblRegisterNewStudent);
		
		JLabel lblAddress = new JLabel("Address         :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddress.setBounds(10, 166, 90, 14);
		contentPane.add(lblAddress);
		
		JComboBox comboBox = new JComboBox();
		Component cmbMessageList = null;
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if (e.getSource() == comboBox){
					
					JComboBox cb = (JComboBox)e.getSource();
                    
					String msg = (String)cb.getSelectedItem();
					
					
					if (msg == "Part Time"){
						
						fee = 200.00;
						msg2 = "Part Time";
					}
					
					else if (msg == "Full Time"){
						
						fee = 300.00;
						msg2 = "Full Time";
					}
					else if(msg=="Select Study Mode"){
						
						JOptionPane.showMessageDialog(null,"please Select Study Mode");
					}			
				}
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Study Mode", "Part Time", "Full Time"}));
		comboBox.setBounds(119, 287, 177, 20);
		contentPane.add(comboBox);
	
		
		JLabel lblStudyMode = new JLabel("Study Mode     :");
		lblStudyMode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStudyMode.setBounds(10, 289, 111, 14);
		contentPane.add(lblStudyMode);
	
		JLabel lblContactNo = new JLabel("Contact No      :");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContactNo.setBounds(10, 258, 111, 14);
		contentPane.add(lblContactNo);
		
		contInput = new JTextField();
		contInput.setBounds(119, 256, 102, 20);
		contentPane.add(contInput);
		contInput.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if (e.getSource() == comboBox_1){
					
					JComboBox cb = (JComboBox)e.getSource();
                    
					String msg = (String)cb.getSelectedItem();
					
					
					if (msg == "< RM 1000 "){
						
						msg3 = "< RM 1000";
						tfee = fee*0.9;
						disc = "Yes";
						
					}
					
					else if (msg == "RM 1001 - RM 2000"){
						
						msg3 = "RM 1001 - RM 2000";
						tfee = fee;
						disc = "No";
						
					}
					
					
					else if (msg == "RM 2001 - RM 3000"){
						
						msg3 = "RM 2001 - RM 3000";
						tfee = fee;
						disc = "No";
						
					}
					
					else if (msg == "RM 3001 - RM 4000"){
						
						msg3 = "RM 3001 - RM 4000";
						tfee = fee;
						disc = "No";
					}
					
					else if (msg == "RM 4001 - RM 5000"){
						
						msg3 = "RM 4001 - RM 5000";
						tfee = fee;
						disc = "No";
					}
					
					else if (msg == "RM 5001 - RM 6000"){
						
						msg3 = "RM 5001 - RM 6000";
						tfee = fee;
						disc = "No";
					}
					
					else if (msg == ">RM 6000"){
						
						msg3 = ">RM 6000";
						tfee = fee;
						disc = "No";
						
					}
					else if(msg=="Select Family Income"){
						
						JOptionPane.showMessageDialog(null,"Please Select Family Income");
					}
		

                    }
				
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Family Income", "< RM 1000 ", "RM 1001 - RM 2000", "RM 2001 - RM 3000", "RM 3001 - RM 4000", "RM 4001 - RM 5000", "RM 5001 - RM 6000", ">RM 6000 "}));
		comboBox_1.setBounds(119, 318, 177, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Family Income :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 321, 99, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea addInput = new JTextArea();
		addInput.setBounds(119, 170, 247, 77);
		contentPane.add(addInput);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if((nameInput.getText().trim().length()==0)||
						(icInput.getText().trim().length()==0)||
						(addInput.getText().trim().length()==0)||
						(contInput.getText().trim().length()==0)){
					
					JOptionPane.showMessageDialog(null, "Please fill all form !!!");
				}
				
				else{
				dispose();
				String na = nameInput.getText();
				String ic = icInput.getText();
				String addr = addInput.getText();
				String cont = contInput.getText();

				displayStudent st = new displayStudent(na,ic,addr,cont,msg2,msg3,fee,disc,tfee);
				st.setVisible(true);
				}
				
				
				
				
			}
		});
		btnSubmit.setBounds(202, 364, 80, 23);
		contentPane.add(btnSubmit);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ico.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 11, 90, 77);
		contentPane.add(label);
	}
}
