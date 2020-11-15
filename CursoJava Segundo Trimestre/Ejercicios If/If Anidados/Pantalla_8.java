import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_8 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_8 window = new Pantalla_8();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla_8() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 51));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese tres n\u00FAmeros:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNewLabel.setBounds(19, 49, 174, 20);
		frame.getContentPane().add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Calibri", Font.PLAIN, 11));
		txt1.setBounds(211, 47, 38, 26);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Calibri", Font.PLAIN, 11));
		txt2.setBounds(261, 47, 38, 26);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Calibri", Font.PLAIN, 11));
		txt3.setBounds(311, 47, 38, 26);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBackground(new Color(204, 0, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());
				int c = Integer.parseInt(txt3.getText());
				
				if (a > b)
					if (a > c)
						lblNewLabel_1.setText("El numero " + a + " " + "es el mayor.");
				
				 if (b > a )
					if (b > c)
					lblNewLabel_1.setText("El numero " + b + " " + "es el mayor.");
				
				else
					lblNewLabel_1.setText("El numero " + c + " " + "es el mayor.");
					
			}
		});
		btnNewButton.setBounds(10, 110, 414, 48);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBackground(new Color(0, 204, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(99, 185, 250, 26);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
