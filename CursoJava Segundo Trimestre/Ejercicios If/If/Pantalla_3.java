

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_3 {

	private JFrame frame;
	private JTextField txt;
	private JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_3 window = new Pantalla_3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla_3() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 11));
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNumero.setForeground(new Color(0, 0, 0));
		lblNumero.setBounds(67, 38, 70, 25);
		frame.getContentPane().add(lblNumero);
		
		txt = new JTextField();
		txt.setFont(new Font("Calibri", Font.PLAIN, 11));
		txt.setBounds(165, 38, 140, 22);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int numero = Integer.parseInt(txt.getText());
				
				if (numero%2==0)
					lblResultado.setText("Es par");
				else lblResultado.setText("Es impar");
				
			}
		});
		btnCalcular.setFont(new Font("Calibri", Font.BOLD, 20));
		btnCalcular.setBounds(174, 121, 120, 31);
		frame.getContentPane().add(btnCalcular);
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setOpaque(true);
		lblResultado.setBackground(new Color(204, 255, 204));
		lblResultado.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblResultado.setForeground(new Color(0, 0, 0));
		lblResultado.setBounds(174, 197, 120, 31);
		frame.getContentPane().add(lblResultado);
	}

}
