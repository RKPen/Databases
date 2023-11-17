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

public class Motorcycles extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Motorcycles frame = new Motorcycles();
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
	public Motorcycles() {
		setTitle("Motorcycles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(793, 433, 89, 23);
		contentPane.add(back_button);
		
		JLabel lblNewLabel = new JLabel("Sort by:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 77, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnPrice = new JButton("Price");
		btnPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPrice.setBounds(107, 11, 89, 23);
		contentPane.add(btnPrice);
		
		JButton btnCarLot = new JButton("Car Lot");
		btnCarLot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCarLot.setBounds(229, 11, 89, 23);
		contentPane.add(btnCarLot);
		
		JButton btnColor = new JButton("Color");
		btnColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnColor.setBounds(351, 11, 89, 23);
		contentPane.add(btnColor);
		
		JButton btnBrand = new JButton("Brand");
		btnBrand.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBrand.setBounds(473, 11, 89, 23);
		contentPane.add(btnBrand);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer frame = new Customer();
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
