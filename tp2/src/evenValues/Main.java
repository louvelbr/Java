package evenValues;

public class Main {
	public static void main(String[] args) {
		int N = 1000000;
		int f[] = new int[N]; 

		for(int j = 0; j < f.length;j++) {
			f[j] = (int)(Math.random()*1000000);
		}



		int nThreads = Runtime.getRuntime().availableProcessors();
		//assume nThreads <= N
		int index[] = new int[nThreads+1];
		for(int j = 0; j <= nThreads; j++) {
			index[j] = (j*N)/nThreads;
		}

		//segment index ranges are index[j], index[j+1]
		//Create array to reference and create worker threads
		evenValues workers[] = new evenValues[nThreads];

		for(int j = 0; j < nThreads; j++){
			workers[j] = new evenValues(index[j], f, index[j+1]);
			workers[j].start();
		}
		int res = 0;
		try {
			for(int j = 0; j < nThreads; j++){
				workers[j].join();
				res += workers[j].getResult();
			}
		}catch (InterruptedException e) {}
		System.out.println(res);
	}

}
