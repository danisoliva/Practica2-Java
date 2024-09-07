package Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel Principal;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMultiplicacion;
    private JButton btnDivision;

    public Principal() {
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              double a = Double.parseDouble(txtNum1.getText());
              double b = Double.parseDouble(txtNum2.getText());

              double c = a / b;

            }
        });
        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double c = a * b;
            }
        });
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());

                double c = a-b;
            }
        });
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double c = a + b;
            }
        });
    }
}
