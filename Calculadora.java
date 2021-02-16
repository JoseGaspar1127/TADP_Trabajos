import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame {

	JTextField pantalla;
	double resultado;
	String operacion;
	JPanel panelNumeros, panelOperaciones;
	boolean nuevaOperacion = true;
	
   public Calculadora() {
		//super();
		setSize(300, 350);
		setTitle("Calculadora ");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());

		pantalla = new JTextField("0", 20);
		
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setEditable(false);
		pantalla.setBackground(Color.WHITE);
		panel.add("North", pantalla);

		panelNumeros = new JPanel();
		panelNumeros.setLayout(new GridLayout(4, 5));
		for (int n = 9; n >= 0; n--) {
			nuevoBotonNumerico("" + n);
		}

		nuevoBotonNumerico(".");
		panel.add("Center", panelNumeros);
		panelOperaciones = new JPanel();
		panelOperaciones.setLayout(new GridLayout(7, 2));
		
		BtnOper("+");
		BtnOper("-");
		BtnOper("*");
		BtnOper("/");
		BtnOper("=");
		BtnOper("CE");

		panel.add("East", panelOperaciones);
      setVisible(true);
	}
   
   private void BtnOper(String operacion) {
		JButton btn = new JButton(operacion);
		btn.setForeground(Color.RED);
		btn.addMouseListener(new MouseAdapter() {

			
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				SigOpr(btn.getText());
			}
		});

		panelOperaciones.add(btn);
	}
   
	private void nuevoBotonNumerico(String digito) {
		JButton btn = new JButton();
		btn.setText(digito);
		btn.addMouseListener(new MouseAdapter() {

			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				Click(btn.getText());
			}
		});

		panelNumeros.add(btn);
	}

	private void Click(String digito) {
		if (pantalla.getText().equals("0") || nuevaOperacion) {
			pantalla.setText(digito);
		} else {
			pantalla.setText(pantalla.getText() + digito);
		}
		nuevaOperacion = false;
	}

	private void SigOpr(String tecla) {
		if (tecla.equals("=")) {
			Reslt();
		} else if (tecla.equals("CE")) {
			resultado = 0;
			pantalla.setText("");
			nuevaOperacion = true;
		} else {
			operacion = tecla;
			if ((resultado > 0) && !nuevaOperacion) {
				Reslt();
			} else {
				resultado = new Double(pantalla.getText());
			}
		}

		nuevaOperacion = true;
	}

	private void Reslt() {
		if (operacion.equals("+")) {
			resultado += new Double(pantalla.getText());
		} else 
      if (operacion.equals("-")) {
			resultado -= new Double(pantalla.getText());
		} else 
      if (operacion.equals("/")) {
			resultado /= new Double(pantalla.getText());
		} else 
      if (operacion.equals("*")) {
			resultado *= new Double(pantalla.getText());
		}
		pantalla.setText("" + resultado);
		operacion = "";
	}
}