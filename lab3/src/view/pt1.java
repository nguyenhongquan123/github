package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import source.source;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pt1 extends JFrame {

	private JPanel contentPane;
	private JTextField N_A;
	private JTextField N_B;
	private JTextField KETQUA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pt1 frame = new pt1();
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
	public pt1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PH\u01AF\u01A0NG TR\u00CCNH B\u1EACC 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("S\u1ED0 A");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		N_A = new JTextField();
		GridBagConstraints gbc_N_A = new GridBagConstraints();
		gbc_N_A.insets = new Insets(0, 0, 5, 0);
		gbc_N_A.fill = GridBagConstraints.HORIZONTAL;
		gbc_N_A.gridx = 4;
		gbc_N_A.gridy = 2;
		panel.add(N_A, gbc_N_A);
		N_A.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("S\u1ED0 B");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 4;
		panel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		N_B = new JTextField();
		N_B.setColumns(10);
		GridBagConstraints gbc_N_B = new GridBagConstraints();
		gbc_N_B.insets = new Insets(0, 0, 5, 0);
		gbc_N_B.fill = GridBagConstraints.HORIZONTAL;
		gbc_N_B.gridx = 4;
		gbc_N_B.gridy = 4;
		panel.add(N_B, gbc_N_B);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 5;
		panel.add(panel_1, gbc_panel_1);
		
		JButton XACNHAN = new JButton("X\u00C1C NH\u1EACN");
		XACNHAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a= Integer.parseInt(N_A.getText());
					int b= Integer.parseInt(N_B.getText());
					source x= new source();
					KETQUA.setText(x.GiaiPTBAC1(a, b));
					
				}
				catch(Exception e1 ) {
					KETQUA.setText("WRONG SOMETHING!");
				}
				
			}
		});
		XACNHAN.setBounds(103, 0, 115, 29);
		panel_1.add(XACNHAN);
		
		KETQUA = new JTextField();
		KETQUA.setEditable(false);
		GridBagConstraints gbc_KETQUA = new GridBagConstraints();
		gbc_KETQUA.insets = new Insets(0, 0, 5, 0);
		gbc_KETQUA.fill = GridBagConstraints.HORIZONTAL;
		gbc_KETQUA.gridx = 4;
		gbc_KETQUA.gridy = 6;
		panel.add(KETQUA, gbc_KETQUA);
		KETQUA.setColumns(10);
	}
}
