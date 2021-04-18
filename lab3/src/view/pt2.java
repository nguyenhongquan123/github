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

public class pt2 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField N_A;
	private JLabel lblNewLabel_1;
	private JTextField N_B;
	private JButton XACNHAN;
	private JLabel lblNewLabel_1_1;
	private JTextField N_C;
	private JTextField ketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pt2 frame = new pt2();
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
	public pt2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel pt2 = new JLabel("PH\u01AF\u01A0NG TR\u00CCNH B\u1EACC 2");
		pt2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(pt2, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNewLabel = new JLabel("S\u1ED0 A");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		N_A = new JTextField();
		N_A.setColumns(10);
		GridBagConstraints gbc_N_A = new GridBagConstraints();
		gbc_N_A.insets = new Insets(0, 0, 5, 0);
		gbc_N_A.fill = GridBagConstraints.HORIZONTAL;
		gbc_N_A.gridx = 6;
		gbc_N_A.gridy = 1;
		panel.add(N_A, gbc_N_A);
		
		lblNewLabel_1 = new JLabel("S\u1ED0 B");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		N_B = new JTextField();
		N_B.setColumns(10);
		GridBagConstraints gbc_N_B = new GridBagConstraints();
		gbc_N_B.insets = new Insets(0, 0, 5, 0);
		gbc_N_B.fill = GridBagConstraints.HORIZONTAL;
		gbc_N_B.gridx = 6;
		gbc_N_B.gridy = 3;
		panel.add(N_B, gbc_N_B);
		
		lblNewLabel_1_1 = new JLabel("S\u1ED0 C");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 4;
		gbc_lblNewLabel_1_1.gridy = 5;
		panel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		N_C = new JTextField();
		N_C.setColumns(10);
		GridBagConstraints gbc_N_C = new GridBagConstraints();
		gbc_N_C.insets = new Insets(0, 0, 5, 0);
		gbc_N_C.fill = GridBagConstraints.HORIZONTAL;
		gbc_N_C.gridx = 6;
		gbc_N_C.gridy = 5;
		panel.add(N_C, gbc_N_C);
		
		XACNHAN = new JButton("X\u00C1C NH\u1EACN");
		XACNHAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int a= Integer.parseInt(N_A.getText());
					int b= Integer.parseInt(N_B.getText());
					int c =Integer.parseInt(N_C.getText());
					source x= new source();
					ketqua.setText(x.GiaiPTBAC2(a, b,c));
				}
				catch(Exception e1 ) {
					ketqua.setText("WRONG SOMETHING!");
				}
			}
		});
		GridBagConstraints gbc_XACNHAN = new GridBagConstraints();
		gbc_XACNHAN.insets = new Insets(0, 0, 5, 0);
		gbc_XACNHAN.gridx = 6;
		gbc_XACNHAN.gridy = 7;
		panel.add(XACNHAN, gbc_XACNHAN);
		
		ketqua = new JTextField();
		ketqua.setEditable(false);
		GridBagConstraints gbc_ketqua = new GridBagConstraints();
		gbc_ketqua.fill = GridBagConstraints.HORIZONTAL;
		gbc_ketqua.gridx = 6;
		gbc_ketqua.gridy = 8;
		panel.add(ketqua, gbc_ketqua);
		ketqua.setColumns(10);
	}

}
