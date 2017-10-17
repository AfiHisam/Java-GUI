import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ico.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 11, 76, 70);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Pusat Tahfiz Al Quran As Solihin,KM23.5 Jln Batu Gajah");
		lblNewLabel.setBounds(96, 11, 328, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Merlimau 77300 Melaka.");
		lblNewLabel_1.setBounds(96, 23, 159, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTelfax = new JLabel("Tel/Fax : 06- 2682276, H/P: 016-6001007, 014-6255677.");
		lblTelfax.setBounds(96, 48, 328, 14);
		contentPane.add(lblTelfax);
		
		JLabel lblAsSolihin = new JLabel("As Solihin Application");
		lblAsSolihin.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblAsSolihin.setBounds(106, 69, 265, 43);
		contentPane.add(lblAsSolihin);
		
		JButton btnNewButton = new JButton("Student Application");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				subStudent ss = new subStudent();
				ss.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(22, 123, 174, 70);
		contentPane.add(btnNewButton);
		
		JButton btnBookingApplication = new JButton("Booking Application");
		btnBookingApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				subBooking sb = new subBooking();
				sb.setVisible(true);
				
			}
		});
		btnBookingApplication.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBookingApplication.setBounds(239, 123, 174, 70);
		contentPane.add(btnBookingApplication);
		
		JLabel lblCopyright = new JLabel("Copyright @ 2016 As Solihin \u2122");
		lblCopyright.setBounds(142, 236, 174, 14);
		contentPane.add(lblCopyright);
		
		JLabel lblAllRightReserved = new JLabel("All Right Reserved");
		lblAllRightReserved.setBounds(171, 247, 134, 14);
		contentPane.add(lblAllRightReserved);
	}

}
