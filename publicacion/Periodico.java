//Orozco Gaspar Jose Angel
package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
    private String seccion;
    private String editor;
    
    public String getSecciones(){
     return seccion;
    }
    
    public void setSecciones(String sec){
        seccion = sec;
    }
    
    public String getEditor(){
     return editor;
    }
    
    public void setEditor(String edit){
        editor = edit;
    }
    
    @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
        
  }