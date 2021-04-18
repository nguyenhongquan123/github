package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import source.source;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sdx extends JFrame {

	private JPanel contentPane;
	private JTextField NUMBER;
	private JTextField KETQUA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sdx frame = new sdx();
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
	public sdx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUMBER");
		lblNewLabel.setBounds(80, 83, 113, 35);
		contentPane.add(lblNewLabel);
		
		NUMBER = new JTextField();
		NUMBER.setBounds(165, 87, 245, 31);
		contentPane.add(NUMBER);
		NUMBER.setColumns(10);
		
		JButton XACNHAN = new JButton("KI\u1EC2M TRA");
		XACNHAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a= Integer.parseInt(NUMBER.getText());
					source x= new source();
					KETQUA.setText(x.checkSDX(a));
				}
				catch(Exception e1 ) {
					KETQUA.setText("WRONG SOMETHING!");
				}
			}
		});
		XACNHAN.setBounds(224, 170, 115, 29);
		contentPane.add(XACNHAN);
		
		KETQUA = new JTextField();
		KETQUA.setEditable(false);
		KETQUA.setColumns(10);
		KETQUA.setBounds(165, 235, 245, 31);
		contentPane.add(KETQUA);
	}
}
