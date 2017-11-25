/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc;

/**
 *
 * @author PC
 */
public class Bloc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista v1 = new Vista();
        Modelo m1 = new Modelo();
        
        Controlador c1 = new Controlador(v1, m1);
        
//
//        Double d = 0.0;
//        String carac = "+";
//        Double numero = 0.0;
//        Double resultado = 100.0;
//        
//        for(int i = 1;i<4;i++){
//
//            carac = ""+i;
//
//            if(i==2)
//                carac = "+";
//            
//            try{
//                d = Double.parseDouble(carac);
//                numero = numero*10+d;
//            }
//            catch(Exception e){
//
//                if(carac == "+")
//                    resultado = resultado + numero; 
//                    //System.out.println("suma");
//                    //modelo.suma();
//            }
//        }
//        
//        
//        
//        
//        System.out.println(resultado);
        
    }
    
}
