package test;

import org.junit.Assert;
import org.junit.Test;
import main.FisicaComputer;
import main.Solido;

public class TestFisica {

	@Test
	public void testComputerFisica(){
		
		Solido cubo = new Solido();
		cubo.setMasa(60/9.807f);
		
		FisicaComputer computer = new FisicaComputer();
		float peso1 = computer.computePesoEnLuna(cubo);
		
		Assert.assertEquals( 9.9f, peso1,0.2);
		
	}
}
