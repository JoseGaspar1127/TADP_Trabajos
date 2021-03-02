import javax.swing.*;
import java.awt.*;

public class JFrameBuscar extends JFrame{
   Buscar buscar = new Buscar();
      public  JFrameBuscar() {
         initComponents();
      }
    private void initComponents(){
      setSize(350,150);
      setTitle(" Busqueda ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(buscar);
      setResizable(false);
      setVisible(true);

       }
  }