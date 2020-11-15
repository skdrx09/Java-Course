import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_7 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_7 window = new Pantalla_7();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla_7() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 14));
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el curso al que pertenece:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 44, 245, 19);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(102, 205, 170));
		textField.setBounds(284, 39, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int curso = Integer.parseInt(textField.getText());
				
				if (curso == 0)
					lblNewLabel_1.setText("Pertenece al jardin de infantes");
				if (curso >= 1)
					if (curso <= 6)
						lblNewLabel_1.setText("Pertenece al nivel primario");
					else if (curso >= 7)
						if (curso <= 12)
							lblNewLabel_1.setText("Pertenece al nivel secundario");
						else 
							lblNewLabel_1.setText("Error");
				
				
			}
		});
		btnNewButton.setBounds(98, 104, 239, 47);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Nivel al que pertenece");
		lblNewLabel_1.setBackground(new Color(255, 0, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Calibri", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(98, 175, 239, 26);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
