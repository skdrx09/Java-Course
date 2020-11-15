import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_4 {

	private JFrame frame;
	private JTextField txt;
	private JLabel lblResultado;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_4 window = new Pantalla_4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla_4() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresarNumeroDel = new JLabel("Ingrese el n\u00FAmero del mes:");
		lblIngresarNumeroDel.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblIngresarNumeroDel.setBounds(31, 37, 208, 22);
		frame.getContentPane().add(lblIngresarNumeroDel);
		
		txt = new JTextField();
		txt.setFont(new Font("Calibri", Font.PLAIN, 11));
		txt.setBackground(new Color(153, 204, 255));
		txt.setBounds(257, 36, 116, 22);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(51, 102, 51));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int numero = Integer.parseInt(txt.getText());
				
				if (numero==1)
					lblResultado.setText("Enero contiene 31 dias");
				else if (numero ==2)
					lblResultado.setText("Febrero contiene 28 dias");
				else if (numero == 3)
					lblResultado.setText("Marzo contiene 31 dias");
				else if (numero == 4)
					lblResultado.setText("Abril contiene 30 dias");
				else if (numero ==5)
					lblResultado.setText("Mayo contiene 31 dias");
				else if (numero == 6)
					lblResultado.setText("Junio contiene 30 dias");
				else if (numero == 7)
					lblResultado.setText("Julio contiene 31 dias");
				else if (numero ==8)
					lblResultado.setText("Agosto contiene 31 dias");
				else if (numero == 9)
					lblResultado.setText("Septiembre contiene 30 dias");
				else if (numero == 10)
					lblResultado.setText("Octubre contiene 31 dias");
				else if (numero ==11)
					lblResultado.setText("Noviembre contiene 30 dias");
				else if (numero == 12)
					lblResultado.setText("Diciembre contiene 31 dias");
				
			}
		});
		btnCalcular.setForeground(new Color(153, 102, 255));
		btnCalcular.setFont(new Font("Calibri", Font.BOLD, 19));
		btnCalcular.setBounds(166, 99, 97, 25);
		frame.getContentPane().add(btnCalcular);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblResultado.setOpaque(true);
		lblResultado.setBackground(new Color(153, 204, 255));
		lblResultado.setBounds(107, 165, 224, 30);
		frame.getContentPane().add(lblResultado);
	}
}
