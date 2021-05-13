//Jose Angel Orozco Gaspar
public class Principal {

    public static void main(String[] args) {
    
        double vector[] = new double[5];
	     for(int x = 0; x<vector.length; x++) {
		      vector[x] = (int)(Math.random()*10+1) ;
	     } 

          new NuevoHilos("Uno",vector); 
          new NuevoHilos("Dos",vector);
          new NuevoHilos("Tres",vector);
          try {
           
            Thread.sleep(10000);
          } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo principal");
          }
          System.out.println("Sale del hilo principal.");
    }
}