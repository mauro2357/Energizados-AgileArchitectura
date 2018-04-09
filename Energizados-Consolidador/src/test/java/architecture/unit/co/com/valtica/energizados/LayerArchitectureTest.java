package architecture.unit.co.com.valtica.energizados;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import jdepend.framework.JDepend;
import jdepend.framework.JavaPackage;


public class LayerArchitectureTest  {
	@Test
	public void verificar_no_acoplamiento_circular() throws IOException {
		 
	    
        JDepend jdepend = new JDepend();		
        jdepend.addDirectory(new File("C:\\Users\\Mauricio Giraldo\\Dropbox\\Proyecto de vida\\Vida profesional\\Enterpreneur\\Ejec\\Energizados-AgileArchitectura\\Energizados-Consolidador\\bin\\main").getPath());      
        jdepend.analyze();
        JavaPackage modulo2 = jdepend.getPackage("co.com.valtica.energizados.modulo2");
		
		Assert.assertFalse(modulo2.containsCycle());
		
		
		
	}
	
	@Test
	public void verificar_correcto_acoplamiento_aferente() throws IOException {
		 
	    
        JDepend jdepend = new JDepend();		
        jdepend.addDirectory(new File("C:\\Users\\Mauricio Giraldo\\Dropbox\\Proyecto de vida\\Vida profesional\\Enterpreneur\\Ejec\\Energizados-AgileArchitectura\\Energizados-Consolidador\\bin\\main").getPath());      
        jdepend.analyze();
        JavaPackage modulo2 = jdepend.getPackage("co.com.valtica.energizados.modulo2");
        
		
		Assert.assertEquals(1, modulo2.afferentCoupling());
		
		
		
	}

}
