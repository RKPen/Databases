import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Customer_info extends JFrame {

	private JPanel contentPane;
	private JTextField txtCustomerNumber;
	private JTextField txtFullName;
	private JTextField txtAge;
	private JTextField txtNationality;
	private JTextField txtDln;
	private JTextField txtDle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_info frame = new Customer_info();
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
	public Customer_info() {
		setTitle("Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(954, 502, 89, 23);
		contentPane.add(back_button);
		
		JLabel lblNewLabel = new JLabel("Customer Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(21, 17, 118, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFullName.setBounds(21, 60, 118, 26);
		contentPane.add(lblFullName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGender.setBounds(21, 103, 118, 26);
		contentPane.add(lblGender);
		
		JLabel lblAge = new JLabel("Age ");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAge.setBounds(21, 146, 118, 26);
		contentPane.add(lblAge);
		
		JLabel lblNationality = new JLabel("Nationality ");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNationality.setBounds(21, 189, 118, 26);
		contentPane.add(lblNationality);
		
		JLabel lblDriverLicenseNumber = new JLabel("Driver license Number");
		lblDriverLicenseNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDriverLicenseNumber.setBounds(21, 232, 134, 26);
		contentPane.add(lblDriverLicenseNumber);
		
		JLabel lblDriverLiscenceExpiry = new JLabel("Driver Liscence Expiry");
		lblDriverLiscenceExpiry.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDriverLiscenceExpiry.setBounds(21, 275, 134, 26);
		contentPane.add(lblDriverLiscenceExpiry);
		
		txtCustomerNumber = new JTextField();
		txtCustomerNumber.setBounds(165, 17, 109, 26);
		contentPane.add(txtCustomerNumber);
		txtCustomerNumber.setColumns(10);
		
		txtFullName = new JTextField();
		txtFullName.setColumns(10);
		txtFullName.setBounds(165, 60, 109, 26);
		contentPane.add(txtFullName);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(165, 146, 109, 26);
		contentPane.add(txtAge);
		
		txtNationality = new JTextField();
		txtNationality.setColumns(10);
		txtNationality.setBounds(165, 189, 109, 26);
		contentPane.add(txtNationality);
		
		txtDln = new JTextField();
		txtDln.setColumns(10);
		txtDln.setBounds(165, 232, 109, 26);
		contentPane.add(txtDln);
		
		txtDle = new JTextField();
		txtDle.setColumns(10);
		txtDle.setBounds(165, 275, 109, 26);
		contentPane.add(txtDle);
		
		
		
		JComboBox<String> comboGender = new JComboBox<String>();
		comboGender.addItem("Male");
		comboGender.addItem("Female");
		comboGender.addItem("Other");
		comboGender.setBounds(165, 103, 109, 26);
		contentPane.add(comboGender);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(21, 331, 115, 48);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(21, 430, 115, 48);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(159, 331, 115, 48);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCustomerNumber.setText(null);
				txtFullName.setText(null);
				txtAge.setText(null);
				txtNationality.setText(null);
				txtDln.setText(null);
				txtDle.setText(null);
			}
		});
		btnCancel.setBounds(159, 430, 115, 48);
		contentPane.add(btnCancel);
		
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
