  
import javax.swing.*;
import java.awt.*;

public class JFrameMostrar extends JFrame
{
   MostrarDatos pdB = new MostrarDatos();
   
   public JFrameMostrar()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     setSize(450,200);
     setTitle("Contactos Guardados");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(pdB);
     setResizable(false);
     setVisible(true);
     
   }
}