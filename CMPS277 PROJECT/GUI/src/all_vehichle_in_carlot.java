import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class all_vehichle_in_carlot extends JFrame {

	private JPanel contentPane;
	private JTextField txtCarLotNumber;
	private JTextField txtEmployeeNumber;
	private JTextField txtLocation;
	private JTextField txtCapacity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					all_vehichle_in_carlot frame = new all_vehichle_in_carlot();
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
	public all_vehichle_in_carlot() {
		setTitle("Car Lot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	
		JButton back_button = new JButton("Back");
		back_button.setBounds(954, 502, 89, 23);
		contentPane.add(back_button);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
				dispose();
			}
		});
		JComboBox<String> comboLot = new JComboBox<String>();
		comboLot.addItem("Bliss");
		comboLot.addItem("Ras Beirut");
		comboLot.addItem("Mar Mhayil");
		comboLot.addItem("Badaro");
		comboLot.addItem("Sassine");
		comboLot.setBounds(141, 11, 160, 33);
		contentPane.add(comboLot);
		
		JLabel lblNewLabel = new JLabel("Choose Car Lot");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 10, 110, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblCarLotNumber = new JLabel("Car Lot Number");
		lblCarLotNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCarLotNumber.setBounds(34, 67, 110, 33);
		contentPane.add(lblCarLotNumber);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(312, 16, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmployeeNumber.setBounds(34, 111, 110, 33);
		contentPane.add(lblEmployeeNumber);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLocation.setBounds(712, 67, 80, 33);
		contentPane.add(lblLocation);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCapacity.setBounds(391, 67, 80, 33);
		contentPane.add(lblCapacity);
		
		JLabel lblFull = new JLabel("Full ");
		lblFull.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFull.setBounds(391, 111, 58, 33);
		contentPane.add(lblFull);
		
		txtCarLotNumber = new JTextField();
		txtCarLotNumber.setBounds(178, 68, 160, 33);
		contentPane.add(txtCarLotNumber);
		txtCarLotNumber.setColumns(10);
		
		txtEmployeeNumber = new JTextField();
		txtEmployeeNumber.setColumns(10);
		txtEmployeeNumber.setBounds(178, 112, 160, 33);
		contentPane.add(txtEmployeeNumber);
		
		txtLocation = new JTextField();
		txtLocation.setColumns(10);
		txtLocation.setBounds(785, 68, 160, 33);
		contentPane.add(txtLocation);
		
		txtCapacity = new JTextField();
		txtCapacity.setColumns(10);
		txtCapacity.setBounds(492, 67, 160, 33);
		contentPane.add(txtCapacity);
		
		JButton button = new JButton("New button");
		button.setBounds(701, 117, -254, -91);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(411, 16, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(785, 111, 150, 33);
		contentPane.add(btnNewButton_2);
		
		JCheckBox chckbxfull = new JCheckBox("");
		chckbxfull.setBounds(492, 117, 160, 33);
		contentPane.add(chckbxfull);

	}
}






