import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_page frame = new Main_page();
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
	public Main_page() {
		setTitle("Rent a veichle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton employee_button = new JButton("Employee");
		employee_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		employee_button.setBounds(95, 110, 182, 110);
		contentPane.add(employee_button);
		employee_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		JButton Customer_button = new JButton("Customer");
		Customer_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Customer_button.setBounds(95, 310, 182, 110);
		contentPane.add(Customer_button);
		Customer_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer frame = new Customer();
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
