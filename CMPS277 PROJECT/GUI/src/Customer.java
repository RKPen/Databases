import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Customer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	public Customer() {
		setTitle("Customer Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JButton btnNewButton = new JButton("Bus-Vans-Motor Homes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bus frame = new Bus();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(32, 24, 183, 183);
		contentPane.add(btnNewButton);
		
		JButton btnHyperSport = new JButton("Hyper - Sport");
		btnHyperSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sports frame = new Sports();
				frame.setVisible(true);
				dispose();
			}
		});
		btnHyperSport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHyperSport.setBounds(32, 218, 183, 183);
		contentPane.add(btnHyperSport);
		
		JButton btnSemisAndPickup = new JButton("Semis - Pickup Truck");
		btnSemisAndPickup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trucks frame = new Trucks();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSemisAndPickup.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSemisAndPickup.setBounds(247, 24, 183, 183);
		contentPane.add(btnSemisAndPickup);
		
		JButton btnHatchBacks = new JButton("Hatch Backs - Sedans");
		btnHatchBacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sedans frame = new Sedans();
				frame.setVisible(true);
				dispose();
			}
		});
		btnHatchBacks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHatchBacks.setBounds(462, 24, 183, 183);
		contentPane.add(btnHatchBacks);
		
		JButton btnMotorCycles = new JButton("Motorcycles");
		btnMotorCycles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Motorcycles frame = new Motorcycles();
				frame.setVisible(true);
				dispose();
			}
		});
		btnMotorCycles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMotorCycles.setBounds(677, 24, 183, 183);
		contentPane.add(btnMotorCycles);
		
		JButton btnSuv = new JButton("SUV");
		btnSuv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Suv frame = new Suv();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSuv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSuv.setBounds(247, 218, 183, 183);
		contentPane.add(btnSuv);
		
		JButton btnLuxury = new JButton("Luxury");
		btnLuxury.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Luxury frame = new Luxury();
				frame.setVisible(true);
				dispose();
			}
		});
		btnLuxury.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLuxury.setBounds(462, 218, 183, 183);
		contentPane.add(btnLuxury);
		
		JButton btnReview = new JButton("Review");
		btnReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reviews frame = new Reviews();
				frame.setVisible(true);
				dispose();
			}
		});
		btnReview.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReview.setBounds(677, 218, 183, 183);
		contentPane.add(btnReview);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(793, 433, 89, 23);
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
