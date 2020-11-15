import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_5 {

	private JFrame frame;
	private JTextField txt;
	private JLabel lblCategoria;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_5 window = new Pantalla_5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla_5() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(255, 153, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese categor\u00EDa:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNewLabel.setBounds(35, 67, 144, 20);
		frame.getContentPane().add(lblNewLabel);
		
		txt = new JTextField();
		txt.setBackground(new Color(255, 255, 204));
		txt.setFont(new Font("Calibri", Font.PLAIN, 16));
		txt.setBounds(203, 65, 210, 26);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char hijo = 'a';
				char padres = 'b';
				String h = Character.toString(hijo);
				String p = Character.toString(padres);
				String categoria = txt.getText();
				
				if (categoria.equals(h)) {
					lblCategoria.setText("Hijo");}
				 
				else if (categoria.equals(p))
					lblCategoria.setText("Padres");
				
				else 
					lblCategoria.setText("Abuelos");
				 
				
			}
				
			});
	
		
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 19));
		btnNewButton.setBounds(158, 136, 119, 38);
		frame.getContentPane().add(btnNewButton);
		
		lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCategoria.setBackground(new Color(255, 255, 153));
		lblCategoria.setOpaque(true);
		lblCategoria.setBounds(108, 206, 222, 27);
		frame.getContentPane().add(lblCategoria);
	}
}
