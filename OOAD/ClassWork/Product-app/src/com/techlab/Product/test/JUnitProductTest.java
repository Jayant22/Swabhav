package com.techlab.Product.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

import com.techlab.Product.Product;

class JUnitProductTest {

	@BeforeClass
	static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	void testProductContructor() {
		System.out.println("test case");
		// Arrange
		int expectedid = 1;
		double expectedunitPrice = 50;
		int expectedquantity = 3;
		String expectedname = "Parle";
		// ACT
		Product product = new Product(1, 50, 3, "Parle");
		// Assert
		assertEquals(expectedid, product.getId());
		assertEquals(expectedunitPrice, product.getUnitPrice());
		assertEquals(expectedquantity, product.getQuantity());
		assertEquals(expectedname, product.getName());
	}

	@After
	void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}
