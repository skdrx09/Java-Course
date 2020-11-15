import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_9 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JLabel lblNewLabel_3;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_9 window = new Pantalla_9();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Pantalla_9() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 17));
		frame.getContentPane().setBackground(new Color(153, 153, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel.setBounds(100, 51, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBackground(new Color(0, 204, 51));
		txt1.setBounds(246, 44, 50, 26);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Jugador 2");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(100, 121, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt2 = new JTextField();
		txt2.setBackground(new Color(0, 204, 51));
		txt2.setBounds(246, 112, 50, 26);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("vs");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(191, 86, 24, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBackground(new Color(102, 102, 153));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int jugador1 = Integer.parseInt(txt1.getText());
				int jugador2 = Integer.parseInt(txt2.getText());
				
				
				if (jugador1 == 0)
					if  (jugador2 == 2) 
				       lblNewLabel_3.setText("Jugador 1 gana");
				
				if (jugador1 == 1) 
					if (jugador2 == 0 ) 
				       lblNewLabel_3.setText("Jugador 1 gana");
				
				if (jugador1 == 2)
					if(jugador2 == 1) 
							lblNewLabel_3.setText("Jugador 1 gana");
				
				if (jugador1 == jugador2)
								lblNewLabel_3.setText("Empate");
				
				if (jugador2 == 0)
					if  (jugador1 == 2) 
					       lblNewLabel_3.setText("Jugador 2 gana");
					
					if (jugador2 == 1) 
						if (jugador1 == 0 ) 
					       lblNewLabel_3.setText("Jugador 2 gana");
					
					if (jugador2 == 2)
						if(jugador1 == 1) 
								lblNewLabel_3.setText("Jugador 2 gana");
					
			}
		});
		btnNewButton.setBounds(100, 164, 237, 49);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("Ganador");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBackground(new Color(153, 102, 102));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setFont(new Font("Calibri", Font.ITALIC, 19));
		lblNewLabel_3.setBounds(94, 224, 243, 26);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
