import javax.swing.*;
import java.awt.*;

public class JFrameIngreso extends JFrame{
   Ingreso ingreso = new Ingreso();
      public  JFrameIngreso() {
         initComponents();
      }
    private void initComponents(){
      
      setSize(250,150);
      setTitle("Usuario y Contrase�a");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(ingreso);
      setResizable(false);
      setVisible(true);
      
      

       }
  }