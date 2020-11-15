package objetosEnClase.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import objetosEnClase.controller.FiguraController;
import objetosEnClase.modelo.Circulo;
import objetosEnClase.modelo.Cuadrado;
import objetosEnClase.modelo.Figura;
import objetosEnClase.modelo.Rectangulo;
import objetosEnClase.modelo.TrianguloRectangulo;
import objetosEnClase.modelo.exception.FiguraException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class FiguraView {

	private JFrame frame;
	private JTextField textValor;
	private JTable tablFiguras;
	private List<Figura> figuras;
	private String arrayfiguras[][];
	private Figura figuraAmodificarEliminar;
	private JTextField textNombre;
	private JTextField textBase;
	private JTextField textField_2;
	private JTextField textAltura;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblSuperficieMaxima;
	private FiguraController figuraController = new FiguraController();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiguraView window = new FiguraView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FiguraView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, 10, 1024, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Figuras geometricas");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(345, 27, 262, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Una variable", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 136, 462, 106);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblValor = new JLabel("lado/radio");
		lblValor.setBounds(10, 30, 99, 20);
		panel.add(lblValor);
		lblValor.setFont(new Font("Calibri", Font.BOLD, 18));
		
		textValor = new JTextField();
		textValor.setBounds(135, 30, 112, 20);
		panel.add(textValor);
		textValor.setFont(new Font("Calibri", Font.BOLD, 18));
		textValor.setColumns(10);
		
		JButton btnCrearCuadrado = new JButton("Crear cuadrado");
		btnCrearCuadrado.setBounds(20, 57, 176, 29);
		panel.add(btnCrearCuadrado);
		btnCrearCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuadrado cua =new Cuadrado(textNombre.getText(), Float.parseFloat(textValor.getText()));
				try {
					figuraController.addHandler(cua);
					figuras.add(cua);
					
					llenarGrilla(figuras);
					limpiarCampos();
				} catch (FiguraException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				}
	
					}
		});
		btnCrearCuadrado.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		
		JButton btnCrearCirculo = new JButton("Crear circulo");
		btnCrearCirculo.setBounds(237, 61, 176, 29);
		panel.add(btnCrearCirculo);
		btnCrearCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Circulo cir = 	new Circulo(textNombre.getText(), Float.parseFloat(textValor.getText()));
				try {
					figuraController.addHandler(cir);
					figuras.add(cir);
				} catch (FiguraException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				}
				
		
				llenarGrilla(figuras);
				limpiarCampos();
			}
		});
		btnCrearCirculo.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		
		JButton btnModificar = new JButton("modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(figuraAmodificarEliminar instanceof Cuadrado){
					Cuadrado cuad = (Cuadrado) figuraAmodificarEliminar;
					cuad.setNombre(textNombre.getText());
					cuad.setLado(Float.parseFloat(textValor.getText()));
				}
				else if(figuraAmodificarEliminar instanceof Circulo){
					Circulo cir = (Circulo) figuraAmodificarEliminar;
					cir.setNombre(textNombre.getText());
					cir.setRadio(Float.parseFloat(textValor.getText()));
				}
				else if(figuraAmodificarEliminar instanceof Rectangulo){
					Rectangulo rec = (Rectangulo) figuraAmodificarEliminar;
					rec.setBase(Float.parseFloat(textBase.getText()));
					rec.setAltura(Float.parseFloat(textAltura.getText()));
				}
					
				
				llenarGrilla(figuras);
				figuraAmodificarEliminar = null;
				limpiarCampos();
			}
		});
		btnModificar.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnModificar.setBounds(221, 621, 176, 30);
		frame.getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				figuras.remove(figuraAmodificarEliminar);
				llenarGrilla(figuras);
				limpiarCampos();
				figuraAmodificarEliminar=null;
			}
		});
		btnEliminar.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnEliminar.setBounds(436, 621, 176, 31);
		frame.getContentPane().add(btnEliminar);
		
		JButton btnLimpiarCampos = new JButton("Limpiar campos");
		btnLimpiarCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		btnLimpiarCampos.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnLimpiarCampos.setBounds(637, 620, 176, 32);
		frame.getContentPane().add(btnLimpiarCampos);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNombre.setBounds(193, 78, 99, 20);
		frame.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Calibri", Font.BOLD, 18));
		textNombre.setColumns(10);
		textNombre.setBounds(318, 78, 112, 20);
		frame.getContentPane().add(textNombre);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Dos variables", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(521, 136, 462, 106);
		frame.getContentPane().add(panel_1);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Calibri", Font.BOLD, 18));
		lblBase.setBounds(10, 30, 60, 20);
		panel_1.add(lblBase);
		
		textBase = new JTextField();
		textBase.setFont(new Font("Calibri", Font.BOLD, 18));
		textBase.setColumns(10);
		textBase.setBounds(80, 30, 112, 20);
		panel_1.add(textBase);
		
		JButton btnCrearRectangulo = new JButton("Crear Rectangulo");
		btnCrearRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				figuras.add(new Rectangulo(	textNombre.getText(), 
											Float.parseFloat(textBase.getText()), 
											Float.parseFloat(textAltura.getText())));
				llenarGrilla(figuras);
				limpiarCampos();
				
			}
		});
		btnCrearRectangulo.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnCrearRectangulo.setBounds(20, 57, 176, 29);
		panel_1.add(btnCrearRectangulo);
		
		JButton btnCrearTriangulo = new JButton("Crear Triangulo");
		btnCrearTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				figuras.add(new TrianguloRectangulo(textNombre.getText(),
							Float.parseFloat(textBase.getText()), 
							Float.parseFloat(textAltura.getText())));
				llenarGrilla(figuras);
				limpiarCampos();

				
			}
		});
		btnCrearTriangulo.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnCrearTriangulo.setBounds(237, 61, 176, 29);
		panel_1.add(btnCrearTriangulo);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Calibri", Font.BOLD, 18));
		lblAltura.setBounds(237, 30, 60, 20);
		panel_1.add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.setFont(new Font("Calibri", Font.BOLD, 18));
		textAltura.setColumns(10);
		textAltura.setBounds(307, 30, 112, 20);
		panel_1.add(textAltura);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "Tres variables", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(270, 253, 573, 158);
		frame.getContentPane().add(panel_2);
		
		JLabel lblValor_2 = new JLabel("lado");
		lblValor_2.setFont(new Font("Calibri", Font.BOLD, 18));
		lblValor_2.setBounds(10, 30, 54, 20);
		panel_2.add(lblValor_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(74, 30, 112, 20);
		panel_2.add(textField_2);
		
		JButton btnCrearCuadrado_2 = new JButton("Crear poligono");
		btnCrearCuadrado_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnCrearCuadrado_2.setBounds(171, 106, 176, 29);
		panel_2.add(btnCrearCuadrado_2);
		
		JLabel lblValor_2_1 = new JLabel("Cantidad de lados");
		lblValor_2_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblValor_2_1.setBounds(227, 30, 176, 20);
		panel_2.add(lblValor_2_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(419, 30, 112, 20);
		panel_2.add(textField_4);
		
		JLabel lblValor_2_2 = new JLabel("Apotema");
		lblValor_2_2.setFont(new Font("Calibri", Font.BOLD, 18));
		lblValor_2_2.setBounds(112, 61, 74, 20);
		panel_2.add(lblValor_2_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(200, 61, 112, 20);
		panel_2.add(textField_5);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(270, 419, 573, 173);
				frame.getContentPane().add(scrollPane);
				
				tablFiguras = new JTable();
				tablFiguras.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						figuraAmodificarEliminar= figuras.get(tablFiguras.getSelectedRow());
						
						if(figuraAmodificarEliminar instanceof Cuadrado)
							asignarValores((Cuadrado)figuraAmodificarEliminar);
						else if(figuraAmodificarEliminar instanceof Circulo)
							asignarValores((Circulo)figuraAmodificarEliminar);
						else if(figuraAmodificarEliminar instanceof Rectangulo)
							asignarValores((Rectangulo)figuraAmodificarEliminar);
						else if(figuraAmodificarEliminar instanceof TrianguloRectangulo)	
							asignarValores((TrianguloRectangulo)figuraAmodificarEliminar);
					}
				});
				tablFiguras.setFont(new Font("Calibri", Font.BOLD, 18));
				
						scrollPane.setViewportView(tablFiguras);
						
						JLabel lblNewLabel_1 = new JLabel("Maxima superficie");
						lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 24));
						lblNewLabel_1.setBounds(475, 67, 242, 29);
						frame.getContentPane().add(lblNewLabel_1);
						
						lblSuperficieMaxima = new JLabel("");
						lblSuperficieMaxima.setBackground(Color.ORANGE);
						lblSuperficieMaxima.setOpaque(true);
						lblSuperficieMaxima.setFont(new Font("Calibri", Font.BOLD, 20));
						lblSuperficieMaxima.setBounds(761, 71, 141, 25);
						frame.getContentPane().add(lblSuperficieMaxima);
		asignarValoresIniciales();
	}
	private void asignarValores(Cuadrado pCua){
		textNombre.setText(pCua.getNombre());
		textValor.setText(Float.toString(pCua.getLado()));
		
	}
	private void asignarValores(Circulo pCir){
		textNombre.setText(pCir.getNombre());
		textValor.setText(Float.toString(pCir.getRadio()));
	}
	private void asignarValores(Rectangulo pRec){
		textNombre.setText(pRec.getNombre());
		textBase.setText(Float.toString(pRec.getBase()));
		textAltura.setText(Float.toString(pRec.getAltura()));
	}
	private void asignarValores(TrianguloRectangulo pTri){
		textNombre.setText(pTri.getNombre());
		textBase.setText(Float.toString(pTri.getBase()));
		textAltura.setText(Float.toString(pTri.getAltura()));
	}
	
	private void llenarGrilla(List<Figura> pFiguras){
		int fila =0 ;
		arrayfiguras = new String[pFiguras.size()][4];
		DecimalFormat df = new DecimalFormat("#.##");
		for (Figura figura : pFiguras) {
			for(int col=0;col<4;col++){
				switch (col) {
				case 0:
					arrayfiguras[fila][col] = figura.getNombre();					
					break;
				case 1:
					arrayfiguras[fila][col] = figura.getValores();					
					break;					
				case 2:
					arrayfiguras[fila][col] = df.format(figura.calcularPerimetro());					
					break;
				case 3:
					arrayfiguras[fila][col] = df.format(figura.calcularSuperficie());					
					break;

				default:
					break;
				}				
			}
			fila++;
		}
		lblSuperficieMaxima.setText(df.format(Figura.getMaximaSuperficie()));
		tablFiguras.setModel(new DefaultTableModel(
				arrayfiguras,
				new String[] {
					"Nombre","Valores", "Perímetro", "Superficie"
				}
			));
	
	}
	private void asignarValoresIniciales(){
		figuras= new ArrayList<Figura>();
		figuras.add(new Cuadrado("cuadrado 1", 15));
		figuras.add(new Circulo("circulo 1", 10));
		figuras.add(new Cuadrado("cuadrado 2", 20));
		figuras.add(new Circulo("circulo 2", 30));
		
		llenarGrilla(figuras);
				
	}
	private void limpiarCampos() {
		textNombre.setText("");
		textValor.setText("");
		textBase.setText("");
		textAltura.setText("");
		
	}
}
