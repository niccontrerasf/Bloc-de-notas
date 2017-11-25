/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author PC
 */
public class Controlador implements ActionListener{

    Vista v1;
    Modelo m1;
    
    public Controlador(Vista v, Modelo m){
        v1 = v;
        m1 = m;
        v1.jButton1.addActionListener(this);
        v1.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==v1.jButton1)
            m1.guardar(v1.jTextField2.getText(),v1.jTextArea2);
    }
    
}
