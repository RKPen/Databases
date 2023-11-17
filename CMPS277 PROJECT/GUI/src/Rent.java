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
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Rent extends JFrame {

	private JPanel contentPane;
	private JTextField txtContractNumber;
	private JTextField txtCustomerNumber;
	private JTextField txtIssueDate;
	private JTextField txtDateOfReturn;
	private JTextField txtComission;
	private JTextField txtEmployeeNumber;
	private JTextField txtPlateNumber;
	private JTextField txtPayment;
	private JTextField txtInsuranceNumber;
	private JTextField txtType;
	private JTextField txtCompany;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rent frame = new Rent();
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
	public Rent() {
		setTitle("Rent");
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
		lblNewLabel.setBounds(10, 22, 108, 33);
		contentPane.add(lblNewLabel);
		
		txtContractNumber = new JTextField();
		txtContractNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtContractNumber.setColumns(10);
		txtContractNumber.setBounds(129, 23, 130, 26);
		contentPane.add(txtContractNumber);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(264, 22, 114, 33);
		contentPane.add(lblNewLabel_1);
		
		txtCustomerNumber = new JTextField();
		txtCustomerNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCustomerNumber.setColumns(10);
		txtCustomerNumber.setBounds(389, 23, 130, 26);
		contentPane.add(txtCustomerNumber);
		
		JLabel lblNewLabel_2 = new JLabel("Issue Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(550, 22, 72, 33);
		contentPane.add(lblNewLabel_2);
		
		txtIssueDate = new JTextField();
		txtIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtIssueDate.setColumns(10);
		txtIssueDate.setBounds(649, 23, 130, 26);
		contentPane.add(txtIssueDate);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Return");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(790, 22, 108, 33);
		contentPane.add(lblNewLabel_3);
		
		txtDateOfReturn = new JTextField();
		txtDateOfReturn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDateOfReturn.setColumns(10);
		txtDateOfReturn.setBounds(888, 22, 130, 26);
		contentPane.add(txtDateOfReturn);
		
		txtComission = new JTextField();
		txtComission.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtComission.setColumns(10);
		txtComission.setBounds(389, 86, 130, 26);
		contentPane.add(txtComission);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmployeeNumber.setBounds(10, 85, 114, 33);
		contentPane.add(lblEmployeeNumber);
		
		txtEmployeeNumber = new JTextField();
		txtEmployeeNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmployeeNumber.setColumns(10);
		txtEmployeeNumber.setBounds(129, 86, 130, 26);
		contentPane.add(txtEmployeeNumber);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comission");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(301, 83, 77, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Plate Number");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(550, 85, 89, 33);
		contentPane.add(lblNewLabel_2_1);
		
		txtPlateNumber = new JTextField();
		txtPlateNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPlateNumber.setColumns(10);
		txtPlateNumber.setBounds(649, 86, 130, 26);
		contentPane.add(txtPlateNumber);
		
		JLabel lblNewLabel_3_1 = new JLabel("Payment");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(790, 85, 108, 33);
		contentPane.add(lblNewLabel_3_1);
		
		txtPayment = new JTextField();
		txtPayment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPayment.setColumns(10);
		txtPayment.setBounds(888, 85, 130, 26);
		contentPane.add(txtPayment);
		
		JLabel lblNewLabel_4 = new JLabel("Does the Customer Want Insurance");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 129, 264, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblInsuranceNumber = new JLabel("Insurance Number");
		lblInsuranceNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInsuranceNumber.setBounds(10, 172, 114, 33);
		contentPane.add(lblInsuranceNumber);
		
		txtInsuranceNumber = new JTextField();
		txtInsuranceNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtInsuranceNumber.setColumns(10);
		txtInsuranceNumber.setBounds(129, 173, 130, 26);
		contentPane.add(txtInsuranceNumber);
		
		JLabel lblNewLabel_1_2 = new JLabel("Type");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(332, 172, 46, 33);
		contentPane.add(lblNewLabel_1_2);
		
		txtType = new JTextField();
		txtType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtType.setColumns(10);
		txtType.setBounds(389, 173, 130, 26);
		contentPane.add(txtType);
		
		JLabel lblNewLabel_2_2 = new JLabel("Company");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(550, 172, 72, 33);
		contentPane.add(lblNewLabel_2_2);
		
		txtCompany = new JTextField();
		txtCompany.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCompany.setColumns(10);
		txtCompany.setBounds(649, 173, 130, 26);
		contentPane.add(txtCompany);
		
		JLabel lblNewLabel_3_2 = new JLabel("Price");
		lblNewLabel_3_2.setToolTipText("");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_2.setBounds(814, 172, 51, 33);
		contentPane.add(lblNewLabel_3_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(888, 173, 130, 26);
		contentPane.add(textField_3);
		
		JCheckBox chckbxInsurance = new JCheckBox("");
		chckbxInsurance.setBounds(279, 131, 99, 23);
		contentPane.add(chckbxInsurance);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
				dispose();
			}
		});
		
	}

}
