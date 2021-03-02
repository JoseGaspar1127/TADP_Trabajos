import javax.swing.*;
import java.awt.*;

public class JFrameAccion extends JFrame{
   Accion accion = new Accion();
      public  JFrameAccion() {
         initComponents();
      }
    private void initComponents(){
      setSize(250,150);
      setTitle(" Menú ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(accion);
      setResizable(false);
      setVisible(true);
      

       }
  }