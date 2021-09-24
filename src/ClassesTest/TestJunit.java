package ClassesTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestJunit {

	@Rule
	public ExpectedException exception = ExpectedException.none();
	public Testclasses va;

	@Before
	public void beforeCoding() {
		this.va = new Testclasses();

	}

	@Test
	public void validId() {
		assertFalse(va.validId(0));
	}

	@Test
	public void validId1() {
		assertTrue(va.validId(10));
	}

	@Test
	public void validId2() {
		assertFalse(va.validId(-3));
	}

	@Test
	public void validTitre() {
		assertTrue(va.validTitre("Automatisation"));
	}

	@Test
	public void validPrix() {
		assertFalse(va.validPrix(0));

	}

	@Test
	public void validPrix1() {
		assertFalse(va.validPrix(100));

	}

	@Test
	public void validPrix2() {
		assertTrue(va.validPrix(250));

	}

	@Test
	public void validNb_heures() {
		assertFalse(va.validNb_heures(10));

	}

	@Test
	public void validmode() {
		assertTrue(va.validMode("présentiel"));
	}

	@Test
	public void validgrade() {
		assertTrue(va.validgrade("senior"));
	}

	@Test
	public void testNotEmptyDepartement() {
		assertFalse(va.verifChaine(""));
	}

}