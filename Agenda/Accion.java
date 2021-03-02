import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Accion extends Panel implements ActionListener{

   private JButton btnAgregar, btnBorrar,btnBuscar,btnModificar,btnCancelar;
   
   
   
   public Accion(){
      setLayout(new GridLayout(3,2));
      
      
      btnAgregar = new JButton("Agregar");
      btnAgregar.addActionListener(this);
      btnBuscar = new JButton("Buscar");
      btnBuscar.addActionListener(this);
      btnBorrar = new JButton("Eliminar");
      btnBorrar.addActionListener(this);
      btnModificar = new JButton("Modificar");
      btnModificar.addActionListener(this);
      btnCancelar = new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      
      add(btnAgregar);
      add(btnBuscar);
      add(btnBorrar);
      add(btnModificar);
      add(btnCancelar);
      
   }
   
      public void actionPerformed(ActionEvent e){
         
         
         if(e.getSource()==btnAgregar){
           JFrameDatos datos = new JFrameDatos();
           
          }
          if(e.getSource()==btnBuscar){
           JFrameBuscar buscar = new JFrameBuscar();
          }
          if(e.getSource()==btnBorrar){
           
          }
          if(e.getSource()==btnModificar){
           
          }
         if(e.getSource()==btnCancelar){
            System.exit(0);
         }
         
      }//actionPerformed  
}  //class
