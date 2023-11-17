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

public class Employee_info extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmployeeNumber;
	private JTextField txtFullName;
	private JTextField txtGender;
	private JTextField txtNationanlity;
	private JTextField txtPosition;
	private JTextField txtCommision;
	private JTextField txtWage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_info frame = new Employee_info();
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
	public Employee_info() {
		setTitle("Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Empoyee Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(22, 18, 109, 26);
		contentPane.add(lblNewLabel);
		
		txtEmployeeNumber = new JTextField();
		txtEmployeeNumber.setBounds(168, 18, 109, 26);
		contentPane.add(txtEmployeeNumber);
		txtEmployeeNumber.setColumns(10);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFullName.setBounds(22, 60, 81, 26);
		contentPane.add(lblFullName);
		
		txtFullName = new JTextField();
		txtFullName.setColumns(10);
		txtFullName.setBounds(168, 61, 109, 26);
		contentPane.add(txtFullName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGender.setBounds(22, 103, 81, 26);
		contentPane.add(lblGender);
		
		txtGender = new JTextField();
		txtGender.setColumns(10);
		txtGender.setBounds(168, 104, 109, 26);
		contentPane.add(txtGender);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNationality.setBounds(22, 145, 81, 26);
		contentPane.add(lblNationality);
		
		txtNationanlity = new JTextField();
		txtNationanlity.setColumns(10);
		txtNationanlity.setBounds(168, 147, 109, 26);
		contentPane.add(txtNationanlity);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPosition.setBounds(22, 189, 81, 26);
		contentPane.add(lblPosition);
		
		txtPosition = new JTextField();
		txtPosition.setColumns(10);
		txtPosition.setBounds(168, 190, 109, 26);
		contentPane.add(txtPosition);
		
		JLabel lblCommision = new JLabel("Commision");
		lblCommision.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCommision.setBounds(22, 232, 81, 26);
		contentPane.add(lblCommision);
		
		txtCommision = new JTextField();
		txtCommision.setColumns(10);
		txtCommision.setBounds(168, 233, 109, 26);
		contentPane.add(txtCommision);
		
		JLabel lblWage = new JLabel("Wage");
		lblWage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWage.setBounds(22, 275, 65, 26);
		contentPane.add(lblWage);
		
		txtWage = new JTextField();
		txtWage.setColumns(10);
		txtWage.setBounds(168, 276, 109, 26);
		contentPane.add(txtWage);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(954, 502, 89, 23);
		contentPane.add(back_button);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(16, 343, 115, 48);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setBounds(16, 434, 115, 48);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(162, 343, 115, 48);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(162, 434, 115, 48);
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
