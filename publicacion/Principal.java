//Orozco Gaspar Jose Angel
package publicacion;

import java.util.*;
public class Principal {

    public static void main(String[] args) {
        int ctrlpub = 0;
        Scanner leer = new Scanner(System.in);
      
        Object publicaciones [] = new Object[10];
        int opc = 0;
        do{
            System.out.println();
            System.out.println(" PUBLICACIONES "); 
            System.out.println(" [1] Dar de Alta : ");
            System.out.println(" [2] Consultar : ");
            System.out.println(" [3] Salir : ");
            System.out.println(" Seleccione Opcion : ");
            opc = leer.nextInt();
            
            switch (opc){
            
              case 1:
                  int opc2 = 0;
                  System.out.println(" DAR DE ALTA "); 
                  System.out.println(" [1] Revista : ");
                  System.out.println(" [2] Libro : ");
                  System.out.println(" [3] Periodico : ");
                  System.out.println(" Seleccione Opcion : ");
                  opc2 = leer.nextInt();
                  
                  if(opc2== 1){
                  
                          
                       //Revista
                         Revista revista = new Revista();
                         leer.nextLine();
                         System.out.println("Ingresa el ISSN : ");
                         revista.setISSN(leer.nextLine());
                         System.out.println("Ingresa el Titulo : ");
                         revista.setTitulo(leer.nextLine());
                         System.out.println("Ingresa el Precio :  ");
                         revista.setPrecio(leer.nextDouble());
                         System.out.println("Ingresa el Número : ");
                         revista.setNumero(leer.nextInt());
                         System.out.println("Ingresa el anio :");
                         revista.setAnio(leer.nextInt());
                         System.out.println("Ingresa el Num. de Pag. : ");
                         revista.setNumpag(leer.nextInt());
                         publicaciones[ctrlpub] = revista;
                 ctrlpub++;
                }
                else if(opc2 == 2){
                               
                        //Libro
                        Libro libro = new Libro();
                        leer.nextLine();
                        System.out.println("Ingresa el ISBN : ");
                        libro.setISBN(leer.nextLine());
                        System.out.println("Ingresa el Titulo : ");
                        libro.setTitulo(leer.nextLine());
                        System.out.println("Ingresa el Nombre del Autor : ");
                        libro.setAutor(leer.nextLine());
                        System.out.println("Ingresa la Ediccion : ");
                        libro.setEdicion(leer.nextLine());
                        System.out.println("Ingresa el Precio : ");
                        libro.setPrecio(leer.nextDouble());
                        System.out.println("Ingresa el Num de Pag. : ");
                        libro.setNumpag(leer.nextInt());
                        publicaciones [ctrlpub] = libro; //guarda el objeto en el arreglo
                ctrlpub++;
               }
               else if(opc2 == 3){
                               
                        //Periodico
                        System.out.println();
                        Periodico periodico = new Periodico();
                        leer.nextLine();
                        System.out.println("Ingresa el Titulo : ");
                        periodico.setTitulo(leer.nextLine());
                        System.out.println("Ingresa las Secciones : ");
                        periodico.setSecciones(leer.nextLine());
                        System.out.println("Ingresa el Editor: ");
                        periodico.setEditor(leer.nextLine());
                        System.out.println("Ingresa el Precio : ");
                        periodico.setPrecio(leer.nextDouble());
                        System.out.println("Ingresa el Num de Pag. : ");
                        periodico.setNumpag(leer.nextInt());
                        publicaciones [ctrlpub] = periodico; //guarda el objeto en el arreglo
                ctrlpub++;
               }
              break;
               
              case 2:
         
                    for(int i = 0; i < ctrlpub; i ++ ){
                         //System.out.println("  " + publicaciones [i].getClass());
                          if(publicaciones[i] instanceof Revista){
                               Revista rev1 = new Revista();
                               rev1 = (Revista)publicaciones[i];
                                System.out.println();
                                System.out.println("----REVISTA----");
                                System.out.println("Titulo: " + rev1.getTitulo());
                                System.out.println("ISSN:  " + rev1.getISSN());
                            
                          }
                          else if (publicaciones [i] instanceof Libro )
                          {
                              Libro lib = new Libro();
                              lib = (Libro)publicaciones[i];
                              System.out.println();
                              System.out.println("---LIBRO---");
                              System.out.println("Titulo:  " + lib.getTitulo());
                              System.out.println("ISBN:  " + lib.getISBN());
                          }
                          else if (publicaciones [i] instanceof Periodico )
                          {
                              Periodico per = new Periodico();
                              per = (Periodico)publicaciones[i];
                              System.out.println();
                              System.out.println("---PERIODICO---");
                              System.out.println("Titulo:  " + per.getTitulo());
                              System.out.println("Secciones:  " + per.getSecciones());
                          }
                    }
               
              break;
              
         }
        }while(opc != 3);
     }
   }