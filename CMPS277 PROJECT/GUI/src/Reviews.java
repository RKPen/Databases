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
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Reviews extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reviews frame = new Reviews();
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
	public Reviews() {
		setTitle("Review");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(326, 433, 89, 23);
		contentPane.add(back_button);
		
		JLabel lblNewLabel = new JLabel("Customer Full Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 22, 131, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblRank = new JLabel("Rating");
		lblRank.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRank.setBounds(10, 58, 131, 23);
		contentPane.add(lblRank);
		
		JLabel lblRanking = new JLabel("Recomendations");
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRanking.setBounds(10, 99, 131, 23);
		contentPane.add(lblRanking);
		
		JLabel lblFeedback = new JLabel("Feedback");
		lblFeedback.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFeedback.setBounds(10, 192, 131, 23);
		contentPane.add(lblFeedback);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 133, 405, 54);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 226, 405, 54);
		contentPane.add(textPane_1);
		
		textField = new JTextField();
		textField.setBounds(149, 23, 96, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 60, 96, 23);
		contentPane.add(textField_1);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer frame = new Customer();
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
