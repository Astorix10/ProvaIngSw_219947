package it.unical.intermediaOCT;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.After;

import org.junit.Before;



/**
 *
 */
public class FunnyAlgorithmsTest
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
    private static FunnyAlgorithms funny;
    
    @Rule
	public ExpectedException expectedEx = ExpectedException.none();
    
  
    
    @BeforeClass
    public static void Prepare() {
    	System.out.println("before class");
    	funny=new FunnyAlgorithms();
    	
    	}
    
	@AfterClass
	public static void AfterAl() {
		System.out.println("after class");
	}
	
	@Before
	public  void before() {
		System.out.println("before");
	}
	
	@After
	public  void after() {
		System.out.println("after");
	}
	
	@Test
	public void stringToIntConverterWorks() {
		
		assertEquals(10, funny.stringToIntConverter("10"));
		assertEquals(980,funny.stringToIntConverter("980"));
		assertEquals(1890,funny.stringToIntConverter("1890"));
		assertEquals(666,funny.stringToIntConverter("666"));
		
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void stringToIntConverterExceptionFormed() {
		System.out.println("eccezione stringra non ben formata");
		funny.stringToIntConverter("ee_wk2");
		
		
		
		
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void stringToIntConverterExceptionNotInRange() {
		System.out.println("eccezione non in range di numeri");
		funny.stringToIntConverter("32768");
		
		
		}
	
	@Test 
	public void BinarySearchWorks() {
		int[] SortedArray= {1,2,3,4,89};
		assertEquals(3,funny.binarySearch(SortedArray, 4));
		assertEquals(1,funny.binarySearch(SortedArray, 2));
		
		
	}
	
	@Test
	public void BinarySearchNoTarget() {
		int[] SortedArray= {1,2,3,4,89};
		assertEquals(-1,funny.binarySearch(SortedArray, 666));
		assertEquals(-1,funny.binarySearch(SortedArray, 0));
		
		
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void SelectionSortNoOrder() {
		System.out.println("eccezione no order");
		int[] NotSortedArray= {1,76,23,10};
		funny.selectionSort(NotSortedArray, -1);
		
		
		
	}

	@Test 
	public void SelectionSortWorks() {
		int[] NotSortedArray= {1,76,23,10};
		int [] SortedUnArray={1,10,23,76};
		funny.binarySearch(NotSortedArray, 0);
		assertArrayEquals(SortedUnArray,NotSortedArray);
		
		
		
		
	}
	
	
	
	
	
	
	
}
  
    /**
     * @return the suite of tests being tested
     */
   
