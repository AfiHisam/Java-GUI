import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class displayStudent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayStudent frame = new displayStudent("","","","","","",0.00,"",0.00);
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
	public displayStudent(String name,String ic,String addr,String cont,String smode,String fincome,double fee,String disc,double tfee) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 0, 91, 83);
		Image img = new ImageIcon(this.getClass().getResource("/ico.png")).getImage();
		label.setIcon(new ImageIcon(img));
		contentPane.add(label);
		
		JLabel lblStudentRegistration = new JLabel("Student Registration ");
		lblStudentRegistration.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblStudentRegistration.setBounds(111, 0, 266, 46);
		contentPane.add(lblStudentRegistration);
		
		JLabel lblSuccessfully = new JLabel("Successfully !!!");
		lblSuccessfully.setFont(new Font("Sitka Small", Font.BOLD, 18));
		lblSuccessfully.setBounds(144, 31, 192, 34);
		contentPane.add(lblSuccessfully);
		
		JLabel lblName = new JLabel("Name                         :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(55, 112, 151, 16);
		contentPane.add(lblName);
		
		JLabel lblIc = new JLabel("IC                              :");
		lblIc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIc.setBounds(55, 139, 151, 16);
		contentPane.add(lblIc);
		
		JLabel lblAddress = new JLabel("Address                      :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddress.setBounds(55, 166, 151, 16);
		contentPane.add(lblAddress);
		
		JLabel lblContactNo = new JLabel("Contact No                  :");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContactNo.setBounds(55, 224, 151, 16);
		contentPane.add(lblContactNo);
		
		JLabel studyLabel = new JLabel("Study Mode                 :");
		studyLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		studyLabel.setBounds(55, 251, 177, 16);
		contentPane.add(studyLabel);
		
		JLabel lblFamilyIncomeRm = new JLabel("Family Income             : ");
		lblFamilyIncomeRm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFamilyIncomeRm.setBounds(55, 278, 177, 16);
		contentPane.add(lblFamilyIncomeRm);
		
		JLabel lblStudyFeeRm = new JLabel("Study Fee                    : RM ");
		lblStudyFeeRm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStudyFeeRm.setBounds(55, 305, 177, 16);
		contentPane.add(lblStudyFeeRm);
		
		JLabel lblDiscount = new JLabel("Discount 10%               :");
		lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDiscount.setBounds(55, 332, 177, 16);
		contentPane.add(lblDiscount);
		
		JLabel lblTotalFeeMust = new JLabel("Total Fee Must Be Paid  : RM ");
		lblTotalFeeMust.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotalFeeMust.setBounds(55, 389, 199, 16);
		contentPane.add(lblTotalFeeMust);
		
		JLabel lblForFamiliyIncome = new JLabel("*for familiy income");
		lblForFamiliyIncome.setBounds(55, 347, 192, 14);
		contentPane.add(lblForFamiliyIncome);
		
		JLabel lblRmAnd = new JLabel("RM 1000 and below");
		lblRmAnd.setBounds(62, 359, 192, 14);
		contentPane.add(lblRmAnd);
		
		JLabel nameLabel = new JLabel("");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nameLabel.setBounds(198, 114, 228, 14);
		contentPane.add(nameLabel);
		nameLabel.setText(name);
		
		JLabel icLabel = new JLabel("");
		icLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		icLabel.setBounds(198, 139, 228, 14);
		contentPane.add(icLabel);
		icLabel.setText(ic);
		
		JTextArea addArea = new JTextArea("");
		addArea.setEditable(false);
		addArea.setBounds(196, 166, 228, 54);
		contentPane.add(addArea);
		addArea.setText(addr);
		
		JLabel contactLabel = new JLabel("");
		contactLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contactLabel.setBounds(198, 226, 228, 14);
		contentPane.add(contactLabel);
		contactLabel.setText(cont);
		
		JLabel modeLabel = new JLabel("");
		modeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		modeLabel.setBounds(198, 253, 228, 14);
		contentPane.add(modeLabel);
		modeLabel.setText(smode);
		
		JLabel incomeLabel = new JLabel("");
		incomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		incomeLabel.setBounds(199, 279, 114, 14);
		contentPane.add(incomeLabel);
		incomeLabel.setText(fincome);
		
		JLabel feeLabel = new JLabel("");
		feeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		feeLabel.setBounds(222, 306, 114, 14);
		contentPane.add(feeLabel);
		feeLabel.setText(Double.toString(fee));
		
		JLabel discountLabel = new JLabel("");
		discountLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		discountLabel.setBounds(200, 334, 114, 14);
		contentPane.add(discountLabel);
		discountLabel.setText(disc);
		
		
		JLabel paidLabel = new JLabel("");
		paidLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		paidLabel.setBounds(224, 390, 114, 14);
		contentPane.add(paidLabel);
		paidLabel.setText(Double.toString(tfee));
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(180, 440, 89, 23);
		contentPane.add(btnClose);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.ORANGE);
		textArea.setEditable(false);
		textArea.setBounds(198, 386, 76, 23);
		contentPane.add(textArea);
	}
}
