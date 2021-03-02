import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatos extends JPanel implements ActionListener{
   JButton btnGuardar, btnSalir,btnRegresar,btnCancelar;
   JTextField txtNombre,txtApellidos,txtTelefono,txtCorreo,txtFechaN;
   JRadioButton amigo,conocido;
   ManejoPersona datos = new ManejoPersona();
   JFrameMostrar jfm ;
   
   public PanelDatos(){
      setLayout(new GridLayout(4,2));
      JLabel lblNombre = new JLabel("Nombre: ",JLabel.RIGHT);
      txtNombre = new JTextField(20);
      add(lblNombre);
      add(txtNombre);
      
      JLabel lblApellidos = new JLabel("Apellidos: ",JLabel.RIGHT);
      txtApellidos = new JTextField(30);
      add(lblApellidos);
      add(txtApellidos);
      
      JLabel lblTelefono = new JLabel("Telefono: ",JLabel.RIGHT);
      txtTelefono = new JTextField(15);
      add(lblTelefono);
      add(txtTelefono);
      
      JLabel lblCorreo = new JLabel("Correo: ",JLabel.RIGHT);
      txtCorreo = new JTextField(30);
      add(lblCorreo);
      add(txtCorreo);
      
      JLabel lblFechaN = new JLabel("Fecha de N.: ",JLabel.RIGHT);
      txtFechaN = new JTextField(30);
      add(lblFechaN);
      add(txtFechaN);
      
      ButtonGroup gpoRBotones = new ButtonGroup();
      amigo = new JRadioButton("Amigo",true);
      conocido = new JRadioButton("Conocido");
      gpoRBotones.add(amigo);
      gpoRBotones.add(conocido);
      
      add(amigo);
      add(conocido);
      
      
      btnGuardar = new JButton("Guardar");
      btnGuardar.addActionListener(this);
      btnSalir = new JButton("Mostrar");
      btnSalir.addActionListener(this);
      btnRegresar = new JButton("Regresar");
      btnRegresar.addActionListener(this);
      btnCancelar = new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      
      
      add(btnGuardar);
      add(btnSalir);
      add(btnRegresar);
      add(btnCancelar);
   
   }
      public void actionPerformed(ActionEvent e){
          String tipo="Conocido";
          
          if (e.getSource() == btnGuardar) 
            {
               if(amigo.isSelected())
                      tipo="Amigo";
               if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
               {
                JOptionPane.showMessageDialog(null, "Debe de ir al menos el nombre de la persona",
                  "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  txtNombre.requestFocus();
               }
              else
               if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty())
               {
                JOptionPane.showMessageDialog(null, "Se debe de colocar el teléfono de la persona",
                  "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  txtTelefono.requestFocus();
               }
              else
                {
                 datos.agregar(txtNombre.getText(), txtApellidos.getText(),
                 txtTelefono.getText(),txtCorreo.getText(),txtFechaN.getText(),tipo);
                 JOptionPane.showMessageDialog(null, "Se guardarán los datos",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);	
                  txtNombre.setText("");
                  txtApellidos.setText("");
                  txtTelefono.setText("");
                  txtCorreo.setText("");
                  txtFechaN.setText("");
                  txtNombre.requestFocus();
                     // datos.mostrar();
                 }
               }
               
      		if (e.getSource() == btnSalir) {
               jfm = new JFrameMostrar();
      			//System.exit(0);
        }
        if(e.getSource()==btnRegresar){
           JFrameAccion accion = new JFrameAccion();
          }
          
         if(e.getSource()==btnCancelar){
            System.exit(0);
         }

  }
}//class

