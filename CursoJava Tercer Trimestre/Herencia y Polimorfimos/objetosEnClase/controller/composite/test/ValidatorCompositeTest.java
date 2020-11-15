package objetosEnClase.controller.composite.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objetosEnClase.controller.composite.ValidatorComposite;
import objetosEnClase.modelo.Circulo;
import objetosEnClase.modelo.Cuadrado;
import objetosEnClase.modelo.Figura;

public class ValidatorCompositeTest {
	Circulo figTest;

	@Before
	public void setUp() throws Exception {
		figTest=new Circulo("cir  doble espacio",-10);
		
	}

	@After
	public void tearDown() throws Exception {
		figTest=null;
		
	}
	@Test
	public void testGetErroresCuadradoLadoNegativo(){
		Cuadrado cua = new Cuadrado("cua", -10);
		assertEquals("El lado debe ser mayor que cero\n", ValidatorComposite.getErrores(cua));
	}
	@Test
	public void testGetErroresNombreDobleEspacioyRadioNegativo() {
		assertEquals("El nombre no puede tener dos espacios\nEl radio debe ser mayor que 0 (cero)\n", ValidatorComposite.getErrores(figTest));
	}

	@Test
	public void testGetErroresNombreDobleEspacio() {
		figTest.setRadio(20);
		assertEquals("El nombre no puede tener dos espacios\n", ValidatorComposite.getErrores(figTest));
	}
	@Test
	public void testGetErroresRadioNegativo() {
		figTest.setNombre("circulo");
		assertEquals("El radio debe ser mayor que 0 (cero)\n", ValidatorComposite.getErrores(figTest));
	}
}
