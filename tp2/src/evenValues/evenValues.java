package evenValues;

public class evenValues extends Thread{
	int tab[]; int fin; int debut; int freq;
	public evenValues(int indexj, int f[], int indexj1) {
		tab = f;
		fin = indexj1;
		debut = indexj;
		freq= 0;
	}

	public void run() {

		for(int j = debut; j < fin; j++) {
			if(tab[j] % 2 == 0) { 
				freq++;
			}
		}

	}
	
	public int getResult() {
		return(freq);
	}
}

