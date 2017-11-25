/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import javax.swing.JTextArea;

public class Modelo {
    
    public void guardar(String nombre, JTextArea data){
        Writer writer = null;

        try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(nombre+".txt"))) {
            data.write(fileOut);
        }
        catch(Exception e){

        }

    }
    
}
