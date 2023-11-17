import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;

public class return_page extends JFrame {

	private JPanel contentPane;
	private JTextField txtContractNumber;
	private JTextField txtDateReturned;
	private JTextField txtRequestNumber;
	private JTextField txtPlateNumber;
	private JTextField txtLastFixed;
	private JTextField txtDefectedParts;
	private JTextField txtInsuranceNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					return_page frame = new return_page();
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
	public return_page() {
		setTitle("Return");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(954, 502, 89, 23);
		contentPane.add(back_button);
		
		JLabel lblNewLabel = new JLabel("Contract Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(14, 27, 109, 23);
		contentPane.add(lblNewLabel);
		
		txtContractNumber = new JTextField();
		txtContractNumber.setBounds(123, 25, 138, 28);
		contentPane.add(txtContractNumber);
		txtContractNumber.setColumns(10);
		
		txtDateReturned = new JTextField();
		txtDateReturned.setColumns(10);
		txtDateReturned.setBounds(384, 25, 138, 28);
		contentPane.add(txtDateReturned);
		
		JLabel lblNewLabel_1 = new JLabel("Date Returned ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(286, 28, 99, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(552, 25, 138, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Does the veichle need maintence?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(14, 79, 260, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblRequestNumber = new JLabel("Request Number");
		lblRequestNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRequestNumber.setBounds(18, 134, 109, 23);
		contentPane.add(lblRequestNumber);
		
		txtRequestNumber = new JTextField();
		txtRequestNumber.setColumns(10);
		txtRequestNumber.setBounds(127, 129, 138, 28);
		contentPane.add(txtRequestNumber);
		
		txtPlateNumber = new JTextField();
		txtPlateNumber.setColumns(10);
		txtPlateNumber.setBounds(388, 126, 138, 28);
		contentPane.add(txtPlateNumber);
		
		JLabel lblDefectedParts = new JLabel("Plate Number");
		lblDefectedParts.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDefectedParts.setBounds(279, 131, 99, 23);
		contentPane.add(lblDefectedParts);
		
		txtLastFixed = new JTextField();
		txtLastFixed.setColumns(10);
		txtLastFixed.setBounds(623, 126, 138, 28);
		contentPane.add(txtLastFixed);
		
		JLabel lblDefectedParts_1 = new JLabel("Last_fixed ");
		lblDefectedParts_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDefectedParts_1.setBounds(548, 129, 65, 23);
		contentPane.add(lblDefectedParts_1);
		
		JLabel lblRequestNumber_2_1 = new JLabel("Defected Parts ");
		lblRequestNumber_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRequestNumber_2_1.setBounds(775, 131, 99, 23);
		contentPane.add(lblRequestNumber_2_1);
		
		txtDefectedParts = new JTextField();
		txtDefectedParts.setColumns(10);
		txtDefectedParts.setBounds(884, 126, 138, 28);
		contentPane.add(txtDefectedParts);
		
		JLabel lblNewLabel_3 = new JLabel("Is it covered by insurance?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(14, 182, 260, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblInsuranceNumber = new JLabel("Insurance Number ");
		lblInsuranceNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInsuranceNumber.setBounds(250, 190, 128, 23);
		contentPane.add(lblInsuranceNumber);
		
		txtInsuranceNumber = new JTextField();
		txtInsuranceNumber.setColumns(10);
		txtInsuranceNumber.setBounds(388, 185, 138, 28);
		contentPane.add(txtInsuranceNumber);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSubmit.setBounds(597, 187, 138, 28);
		contentPane.add(btnSubmit);
		
		JCheckBox chckbxMaintence = new JCheckBox("");
		chckbxMaintence.setBounds(279, 88, 99, 23);
		contentPane.add(chckbxMaintence);
		
		JCheckBox chckbxInsured = new JCheckBox("");
		chckbxInsured.setBounds(190, 191, 34, 23);
		contentPane.add(chckbxInsured);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();;
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
