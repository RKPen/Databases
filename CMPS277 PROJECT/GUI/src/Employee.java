import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Employee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setTitle("Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JButton vehicle_button = new JButton("Vehichle");
		vehicle_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		vehicle_button.setBounds(78, 132, 165, 89);
		contentPane.add(vehicle_button);
		vehicle_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vehicle_Info frame = new Vehicle_Info();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		JButton customer_button = new JButton("Customers");
		customer_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		customer_button.setBounds(139, 288, 165, 89);
		contentPane.add(customer_button);		
		customer_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_info frame = new Customer_info();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		JButton rent_button = new JButton("Rent");
		rent_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rent_button.setBounds(443, 288, 165, 89);
		contentPane.add(rent_button);		
		rent_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rent frame = new Rent();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		JButton return_button = new JButton("Return");
		return_button.setBounds(321, 132, 165, 89);
		contentPane.add(return_button);
		return_button.setFont(new Font("Tahoma", Font.PLAIN, 17));		
		return_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return_page frame = new return_page();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		JButton all_vehicle_button = new JButton("Car Lots");
		all_vehicle_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		all_vehicle_button.setBounds(564, 132, 165, 89);
		contentPane.add(all_vehicle_button);		
		all_vehicle_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				all_vehichle_in_carlot frame = new all_vehichle_in_carlot();
				frame.setVisible(true);
				dispose();
			}
		});
		
		JButton all_customer_button = new JButton("Employee");
		all_customer_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		all_customer_button.setBounds(747, 288, 165, 89);
		contentPane.add(all_customer_button);		
		all_customer_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee_info frame = new Employee_info();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		JButton report_button = new JButton("Report");
		report_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		report_button.setBounds(807, 132, 165, 89);
		contentPane.add(report_button);		
		report_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report frame = new report();
				frame.setVisible(true);
				dispose();
			}
		});
		
	
		JButton back_button = new JButton("Back");
		back_button.setBounds(954, 502, 89, 23);
		contentPane.add(back_button);		
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_page frame = new Main_page();
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
