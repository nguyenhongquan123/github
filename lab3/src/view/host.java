package view;
import view.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import view.pt1;
import view.pt2;
import view.snt;
import view.sdx;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;

public class host extends JFrame {

	private JPanel contentPane;
	private JTextField txtMyTnhn;
	private JButton button_sdx;
	private JButton ktsnt;
	private JButton button_ptb1;
	private JButton button_ptb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
		    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch(Exception e){

		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					host frame = new host();
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
	public host() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		txtMyTnhn = new JTextField();
		txtMyTnhn.setEditable(false);
		txtMyTnhn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMyTnhn.setHorizontalAlignment(SwingConstants.CENTER);
		txtMyTnhn.setForeground(Color.BLUE);
		txtMyTnhn.setText("M\u00E1y t\u00EDnh \u0111\u01A1n gi\u1EA3n");
		contentPane.add(txtMyTnhn, BorderLayout.NORTH);
		txtMyTnhn.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2,2));
		
		button_ptb1 = new JButton("PH\u01AF\u01A0NG TR\u00CCNH B\u1EACC 1");
		button_ptb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pt1 x= new pt1();
				x.setVisible(true);
				
			}
		});
		button_ptb1.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(button_ptb1);
		
		button_ptb2 = new JButton("PH\u01AF\u01A0NG TR\u00CCNH B\u1EACC 2");
		button_ptb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pt2 x = new pt2();
				x.setVisible(true);
			}
		});
		button_ptb2.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(button_ptb2);
		
		ktsnt = new JButton("KI\u1EC2M TRA S\u1ED0 NGUY\u00CAN T\u1ED0");
		ktsnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				snt x = new snt();
				x.setVisible(true);
			}
		});
		ktsnt.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(ktsnt);
		
		button_sdx = new JButton("KI\u1EC2M TRA S\u1ED0 \u0110\u1ED0I X\u1EE8NG");
		button_sdx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sdx x= new sdx();
				x.setVisible(true);
			}
		});
		button_sdx.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(button_sdx);
	}

}
