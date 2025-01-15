package uk.ac.kcl.inf.mdd2.tests.mmt;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.jupiter.api.Test;

import uk.ac.kcl.inf.mdd2.turtles.TurtlesPackage;

class MetaModelTest {

	public void assertExistClass(String cname) {
		assertNotNull(TurtlesPackage.eINSTANCE.getEClassifier(cname), "Missing class " + cname + ".");
	}

	@Test
	public void testXlassesExists() {
		for (String cName : new String[] {"IntExpression", "IntLiteral", "IntVarExpression", "Multiplication", "Addition"})
		assertExistClass(cName);
	}


	@Test
	public void testIntExprSubClassing() {
		EClassifier parent = TurtlesPackage.eINSTANCE.getEClassifier("IntExpression");
		assertNotNull(parent, "Superclass IntExpression could not be found.");
		
		for (String cName : new String[] {"IntLiteral", "IntVarExpression", "Multiplication", "Addition"}) {
			assertSubClassOf(cName, (EClass)parent);
		}
	}

	private void assertSubClassOf(String cName, EClass parent) {
		EClassifier sub = TurtlesPackage.eINSTANCE.getEClassifier(cName);
		assertNotNull(sub, "Class " + cName + " could not be found.");
		if (sub instanceof EClass) {
			assertTrue(parent.isSuperTypeOf((EClass) sub), cName + " is not a sub class of " + parent.getName());
		}
	}

	
	
}
