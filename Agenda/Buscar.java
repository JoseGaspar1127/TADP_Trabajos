import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buscar extends Panel implements ActionListener{

   private JButton btnBuscar,btnRegresar,btnCancelar;
   JTextField txtNombre;
   ManejoPersona datos = new ManejoPersona();
   MostrarDatos jfm = new MostrarDatos();
   
   
   public Buscar(){
      setLayout(new GridLayout(6,2));
      JLabel lblNombre = new JLabel("Nombre: ",JLabel.RIGHT);
      txtNombre = new JTextField(20);
      add(lblNombre);
      add(txtNombre);
      
      btnBuscar = new JButton("Buscar");
      btnBuscar.addActionListener(this);
      btnRegresar = new JButton("Regresar");
      btnRegresar.addActionListener(this);
      btnCancelar = new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      
      add(btnBuscar);
      add(btnRegresar);
      add(btnCancelar);
      
   }
   
      public void actionPerformed(ActionEvent e){
         if(e.getSource()==btnBuscar){
            if(txtNombre.getText() == null || txtNombre.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Debe de ir al menos el nombre de la persona",
                  "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  txtNombre.requestFocus();
          }
          else{
            String buscar = txtNombre.getText();
            String buscPer [][] = new String[10][3];
            buscPer = jfm.obtenerDatos();
            boolean ban = false;
            for(int x=0; x<10;x++){
               if(buscar.equals(buscPer[x][0])){
                 JOptionPane.showMessageDialog(null, "Datos encontrados "+ buscPer[x][0]+" "+ buscPer[x][1],
                  "Aviso", JOptionPane.INFORMATION_MESSAGE); 
                  ban = true;
                  break;
               }
            }
            if(ban == false){
             JOptionPane.showMessageDialog(null, "Datos NO Existentes",
                  "Aviso", JOptionPane.INFORMATION_MESSAGE);  
            }
          }
         }
         if(e.getSource()==btnRegresar){
           JFrameAccion accion = new JFrameAccion();
          }
          
         if(e.getSource()==btnCancelar){
            System.exit(0);
         }
         
      }//actionPerformed  
      
     
}  //class
