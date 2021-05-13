//Orozco Gaspar Jose Angel
public class NuevoHilos implements Runnable {
     
     String name; 
     Thread t;
     double arreglo[] = new double [5];
     double suma = 0, cudd = 0, sum = 0;
     double media = 0;
  
     NuevoHilos(String threadname, double vec[]){
       name = threadname;
       arreglo = vec;
       t = new Thread(this, name);
       System.out.println("Nuevo hilo: " + t);
       t.start(); 
     }
     
     public void run() {
       try {
            if(name == "Uno") {
       		   for(int x = 0; x<arreglo.length; x++) {
       			   suma+=arreglo[x];
       		   }
       	   }
       	
       	if(name == "Dos") {
       		for(int x = 0; x<arreglo.length; x++) {
       			cdd+=arreglo[x]*arreglo[x];
       		}
       	}
       	
       	if(name == "Tres"){
       		for(int x = 0; x<arreglo.length; x++){
       			sum+=arreglo[x];
       		}
       		 media = sum/arreglo.length;
       	}
       	if(name == "Uno")
           System.out.println("La suma del vector es:" + suma);
       	
         if(name == "Dos")
               System.out.println("La suma de los cuadrados del vector es:" + cudd);
       	
         if(name == "Tres")
               System.out.println("La media del vector es:" + media);
           
          Thread.sleep(1000);  
       }
       
       catch (InterruptedException e) {
         System.out.println(name + "Interrupcion del hilo hijo" + name);
       }
       System.out.println("Sale del hilo hijo" + name);
  }
}