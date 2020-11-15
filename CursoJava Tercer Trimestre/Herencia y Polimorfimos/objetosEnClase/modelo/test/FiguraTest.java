package objetosEnClase.modelo.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import objetosEnClase.modelo.Circulo;
import objetosEnClase.modelo.Cuadrado;
import objetosEnClase.modelo.Figura;
import objetosEnClase.modelo.Rectangulo;


public class FiguraTest {
	List<Figura> lstFiguras = new ArrayList<Figura>();
	Set<Figura>  setFiguras = new HashSet<Figura>();

	Cuadrado 	cuadrado 	;
	Circulo 	circulo		;
	Rectangulo  rectangulo	;
	
	@Before
	public void setUp() throws Exception {
		cuadrado = new Cuadrado("cuadradoTest", 10);
		circulo = new Circulo("CirculoTest", 10);
		rectangulo = new Rectangulo("rectanguloTest", 10, 15);
		lstFiguras.add(cuadrado);
		lstFiguras.add(circulo);
		lstFiguras.add(new Cuadrado("cuadrado2", 20));
		lstFiguras.add(new Circulo("circulo2", 20));
		setFiguras.add(cuadrado);
		setFiguras.add(circulo);
		setFiguras.add(new Cuadrado("cuadrado2", 20));
		setFiguras.add(new Circulo("circulo2", 20));
	}

	@After
	public void tearDown() throws Exception {
		cuadrado = null;
		circulo = null;
		rectangulo = null;
		
		lstFiguras = null;
		setFiguras = null;
	}
	@Test
	public void testMaximaSuperficie(){
		Assert.assertEquals(1256.64, Figura.getMaximaSuperficie(),0.01);
		
	}
	@Test 
	public void testContructorNobreRectangulo(){
		Assert.assertEquals("rectanguloTest", rectangulo.getNombre());
	}
	
	@Test 
	public void testContructorBaseRectangulo(){
		Assert.assertEquals(10.0f, rectangulo.getBase(),0.01);
	}
	
	@Test 
	public void testContructorAlturaRectangulo(){
		Assert.assertEquals(15.0f, rectangulo.getAltura(),0.01);
	}
	@Test
	public void testCalcularPerimetroRectangulo(){
		Assert.assertEquals(50.0f, rectangulo.calcularPerimetro(),0.01);
	}

	@Test
	public void testCalcularSuperficieRectangulo(){
		Assert.assertEquals(150.0f, rectangulo.calcularSuperficie(),0.01);
	}

	@Test
	public void testGetNombreDelCuadradoDelConstructor() {
		Assert.assertEquals("cuadradoTest", cuadrado.getNombre());
		
	}
	@Test
	public void testGelLadoDelCuadrado(){
		Assert.assertEquals(10.0f, cuadrado.getLado(), 0.1);
	}

	@Test
	public void testCalcularPerimetroDelCuadrado() {
		Assert.assertEquals(40.0f, cuadrado.calcularPerimetro(),0.1);
	}

	@Test
	public void testCalcularSuperficieDelCuadrado() {
		Assert.assertEquals(100.0f, cuadrado.calcularSuperficie(), 0.1);
	}
	
	@Test
	public void testCalcularPerimetroDelCirculo(){
		Assert.assertEquals(62.832, circulo.calcularPerimetro(), 0.001);
	}
	@Test
	public void testContieneLaListaUnCuadrado(){
		Assert.assertTrue(lstFiguras.contains(cuadrado));
	}

	@Test
	public void testNOContieneLaListaUnCuadrado(){
		
		Assert.assertFalse(lstFiguras.contains(new Cuadrado("otro cuad",10)));
	}

	@Test
	public void testContieneLaListaUncirculo(){
		Assert.assertTrue(lstFiguras.contains(circulo));
	}
	@Test
	public void testEliminaCuadrado(){
		lstFiguras.remove(cuadrado);
		Assert.assertEquals(3,lstFiguras.size() );
	}
	@Test
	public void testNOContieneLaListaUncirculo(){
		Assert.assertFalse(lstFiguras.contains(new Circulo("otro Circulo",10)));
	}
	
	@Test
	public void testAgregarALista(){
		lstFiguras.add(new Cuadrado("cuadradoTest", 10));
		Assert.assertEquals(5, lstFiguras.size());
		
	}
	@Test
	public void testAgregaraSet(){
		setFiguras.add(new Cuadrado("cuadradoTest", 10));
		Assert.assertEquals(4, setFiguras.size());
		
	}
	
	@Test
	public void testGetValoresCuadrado(){
		Assert.assertEquals("l=10.0", cuadrado.getValores());
	}
	@Test
	public void testGetValoresCiculo(){
		Assert.assertEquals("r=10.0", circulo.getValores());
	}


}
