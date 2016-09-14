package mergeSort;

import java.util.Arrays;

public class MergeSort {


	public static int[] mergeSort(int[] arreglo) {
		
		if (arreglo.length > 1) {
		
			int centro = arreglo.length / 2;
			
			int a[] = Arrays.copyOfRange(arreglo, 0, centro);
			int b[] = Arrays.copyOfRange(arreglo, centro, arreglo.length);
			
			a = mergeSort(a);
			b = mergeSort(b);
			
			return merge(a,b);
		
		} else {
			return arreglo;
		}
	}
	
	public static int[] merge(int[] a, int[] b) {
		
		int tam 	= a.length + b.length;
		int res[] 	= new int[tam]; 
		
		int k = 0, i = 0, j = 0;
		
		while(i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				k++;
				i++;
			} else {
				res[k] = b[j];
				k++;
				j++;
			}
		}
		
		while(i< a.length) {
			res[k] = a[i];
			k++;
			i++;
		}
		
		while(j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		
		return res;
	}
	
}
