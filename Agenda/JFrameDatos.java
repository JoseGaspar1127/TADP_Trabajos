import javax.swing.*;
import java.awt.*;

public class JFrameDatos extends JFrame{
   PanelDatos pdb = new PanelDatos();
      public  JFrameDatos() {
         
         initComponents();
      }
    private void initComponents(){
      
      setSize(500,200);
      setTitle("Datos Personales");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pdb);
      setResizable(false);
      setVisible(true);
      

       }
  }