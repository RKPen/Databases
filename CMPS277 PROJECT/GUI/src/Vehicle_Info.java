import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Vehicle_Info extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlate_num;
	private JTextField txtType;
	private JTextField txtBrand;
	private JTextField txtModel;
	private JTextField txtYear;
	private JTextField txtMilage;
	private JTextField txtColor;
	private JTextField txtEngine;
	private JTextField txtGasType;
	private JTextField txtLotNumber;
	private JTextField txtAvailable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehicle_Info frame = new Vehicle_Info();
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
	public Vehicle_Info() {
		setTitle("Vehicles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		txtPlate_num = new JTextField();
		txtPlate_num.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPlate_num.setBounds(140, 11, 130, 26);
		contentPane.add(txtPlate_num);
		txtPlate_num.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Plate Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 10, 108, 33);
		contentPane.add(lblNewLabel);
		
		txtType = new JTextField();
		txtType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtType.setColumns(10);
		txtType.setBounds(140, 53, 130, 26);
		contentPane.add(txtType);
		
		JLabel lblNewLabel_1 = new JLabel("Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 53, 84, 33);
		contentPane.add(lblNewLabel_1);
		
		txtBrand = new JTextField();
		txtBrand.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBrand.setColumns(10);
		txtBrand.setBounds(140, 96, 130, 26);
		contentPane.add(txtBrand);
		
		JLabel lblNewLabel_2 = new JLabel("Brand");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 96, 84, 33);
		contentPane.add(lblNewLabel_2);
		
		txtModel = new JTextField();
		txtModel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtModel.setColumns(10);
		txtModel.setBounds(140, 139, 130, 26);
		contentPane.add(txtModel);
		
		JLabel lblNewLabel_3 = new JLabel("Model");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 139, 84, 33);
		contentPane.add(lblNewLabel_3);
		
		txtYear = new JTextField();
		txtYear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtYear.setColumns(10);
		txtYear.setBounds(140, 182, 130, 26);
		contentPane.add(txtYear);
		
		JLabel lblNewLabel_4 = new JLabel("Year");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 182, 84, 33);
		contentPane.add(lblNewLabel_4);
		
		txtMilage = new JTextField();
		txtMilage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMilage.setColumns(10);
		txtMilage.setBounds(140, 225, 130, 26);
		contentPane.add(txtMilage);
		
		JLabel lblNewLabel_5 = new JLabel("Milage");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 225, 84, 33);
		contentPane.add(lblNewLabel_5);
		
		txtColor = new JTextField();
		txtColor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtColor.setColumns(10);
		txtColor.setBounds(140, 268, 130, 26);
		contentPane.add(txtColor);
		
		JLabel lblNewLabel_6 = new JLabel("Color");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 268, 84, 33);
		contentPane.add(lblNewLabel_6);
		
		txtEngine = new JTextField();
		txtEngine.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEngine.setColumns(10);
		txtEngine.setBounds(140, 311, 130, 26);
		contentPane.add(txtEngine);
		
		JLabel lblNewLabel_7 = new JLabel("Engine");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(10, 311, 84, 33);
		contentPane.add(lblNewLabel_7);
		
		txtGasType = new JTextField();
		txtGasType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGasType.setColumns(10);
		txtGasType.setBounds(140, 354, 130, 26);
		contentPane.add(txtGasType);
		
		JLabel lblNewLabel_8 = new JLabel("Gas Type");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 354, 84, 33);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Car lot");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(10, 397, 84, 33);
		contentPane.add(lblNewLabel_9);
		
		txtLotNumber = new JTextField();
		txtLotNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLotNumber.setColumns(10);
		txtLotNumber.setBounds(140, 440, 130, 26);
		contentPane.add(txtLotNumber);
		
		JLabel lblNewLabel_10 = new JLabel("Lot Number");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(10, 440, 84, 33);
		contentPane.add(lblNewLabel_10);
		
		txtAvailable = new JTextField();
		txtAvailable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAvailable.setColumns(10);
		txtAvailable.setBounds(140, 483, 130, 26);
		contentPane.add(txtAvailable);
		
		JLabel lblNewLabel_11 = new JLabel("Available");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(10, 483, 84, 23);
		contentPane.add(lblNewLabel_11);
		
		JComboBox<String> comboLot = new JComboBox<String>();
		comboLot.addItem("Bliss");
		comboLot.addItem("Ras Beirut");
		comboLot.addItem("Mar Mhayil");
		comboLot.addItem("Badaro");
		comboLot.addItem("Sassine");
		comboLot.setBounds(140, 398, 130, 26);
		contentPane.add(comboLot);

		
		JButton back_button = new JButton("Back");
		back_button.setBounds(954, 502, 89, 23);
		contentPane.add(back_button);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(291, 70, 115, 48);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setBounds(291, 186, 115, 48);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(291, 302, 115, 48);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPlate_num.setText(null);
				txtType.setText(null);
				txtBrand.setText(null);
				txtModel.setText(null);
				txtYear.setText(null);
				txtMilage.setText(null);
				txtColor.setText(null);
				txtEngine.setText(null);
				txtGasType.setText(null);
				txtLotNumber.setText(null);
				txtAvailable.setText(null);
			}
		});
		btnCancel.setBounds(291, 418, 115, 48);
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
