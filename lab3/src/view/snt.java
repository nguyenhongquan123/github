package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import source.source;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class snt extends JFrame {

	private JPanel contentPane;
	private JTextField NUMBER_TEXT;
	private JTextField KETQUA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					snt frame = new snt();
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
	public snt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("KI\u1EC2M TRA S\u1ED0 NGUY\u00CAN T\u1ED0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel NUMBER = new JLabel("NUMBER");
		GridBagConstraints gbc_NUMBER = new GridBagConstraints();
		gbc_NUMBER.insets = new Insets(0, 0, 5, 5);
		gbc_NUMBER.gridx = 2;
		gbc_NUMBER.gridy = 2;
		panel.add(NUMBER, gbc_NUMBER);
		
		NUMBER_TEXT = new JTextField();
		GridBagConstraints gbc_NUMBER_TEXT = new GridBagConstraints();
		gbc_NUMBER_TEXT.insets = new Insets(0, 0, 5, 0);
		gbc_NUMBER_TEXT.fill = GridBagConstraints.HORIZONTAL;
		gbc_NUMBER_TEXT.gridx = 5;
		gbc_NUMBER_TEXT.gridy = 2;
		panel.add(NUMBER_TEXT, gbc_NUMBER_TEXT);
		NUMBER_TEXT.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 4;
		panel.add(panel_1, gbc_panel_1);
		
		JButton KIEMTRA = new JButton("KI\u1EC2M TRA");
		KIEMTRA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a= Integer.parseInt(NUMBER_TEXT.getText());
					source x= new source();
					KETQUA.setText(x.checkNguyenTo(a));
				}
				catch(Exception e1 ) {
					KETQUA.setText("WRONG SOMETHING!");
				}
			}
		});
		KIEMTRA.setBounds(0, 0, 105, 29);
		panel_1.add(KIEMTRA);
		
		KETQUA = new JTextField();
		KETQUA.setEditable(false);
		GridBagConstraints gbc_KETQUA = new GridBagConstraints();
		gbc_KETQUA.insets = new Insets(0, 0, 5, 0);
		gbc_KETQUA.fill = GridBagConstraints.HORIZONTAL;
		gbc_KETQUA.gridx = 5;
		gbc_KETQUA.gridy = 6;
		panel.add(KETQUA, gbc_KETQUA);
		KETQUA.setColumns(10);
	}

}
