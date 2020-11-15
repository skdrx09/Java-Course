import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_6 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_6 window = new Pantalla_6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla_6() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(102, 204, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el puesto:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNewLabel.setBounds(34, 72, 147, 19);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 16));
		textField.setBounds(205, 67, 184, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBackground(new Color(51, 0, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int puesto = Integer.parseInt(textField.getText());
				
				if (puesto == 1)
					lblNewLabel_1.setText("Te ganaste el medallón de oro!!!");
				else if (puesto == 2)
					lblNewLabel_1.setText("Te ganaste el medallón de plata!!!");
				else if (puesto == 3)
					lblNewLabel_1.setText("Te ganaste el medallón de bronce!!!");
				else 
					lblNewLabel_1.setText("Seguí participando :c");
				
			}
		});
		btnNewButton.setBounds(116, 114, 217, 60);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Premio");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNewLabel_1.setBackground(new Color(0, 204, 153));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(79, 193, 289, 26);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
