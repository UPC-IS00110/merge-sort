package mergeSort;

import org.junit.Test;
import static org.junit.Assert.*;

public class PruebaMergeSort {

	@Test
	public void probarMerge() {
		
		int a[] = {1, 3};
		int b[] = {3, 4};
		
		int res[] = MergeSort.merge(a, b);
		
		assertEquals("El tamaño final no es el apropiado", 4, res.length );
		assertArrayEquals("No ordeno bien",  new int[]{1,3,3,4}, res);
				
	}
	
	@Test
	public void probarMergeConArreglosDeUno() {
		
		int a[] = {3};
		int b[] = {1};
		
		int res[] = MergeSort.merge(a, b);
		
		assertEquals("El tamaño final no es el apropiado", 2, res.length );
		assertArrayEquals("No ordeno bien",  new int[]{1,3}, res);
				
	}
	
	@Test
	public void probarMergeSort() {
		
		int[] arreglo = {8, 7, 9, 24, 12, 3};
		arreglo = MergeSort.mergeSort(arreglo);
				
		assertEquals(6, arreglo.length);
		assertArrayEquals(new int[]{3,7,8,9,12,24}, arreglo);
	}
}
