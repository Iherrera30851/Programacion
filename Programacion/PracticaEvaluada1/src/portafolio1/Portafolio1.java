/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Portafolio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Portafolio Isaac Herrera
     
        
        String Años = JOptionPane.showInputDialog("Ingrese sus años trabajados en la empresa:");
        int años = Integer.parseInt(Años);

        String HorasSemana = JOptionPane.showInputDialog("Ingrese las horas trabajadas por semana:");
        int horasSemana = Integer.parseInt(HorasSemana);

        String PagoHora = JOptionPane.showInputDialog("Ingrese el pago por hora trabajada:");
        int pagoHora = Integer.parseInt(PagoHora);

       
        int salarioMensual = (horasSemana * 4) * pagoHora;
        int salarioConBono = salarioMensual;

        
        if (años > 80) {
            double bono = salarioMensual * 5.5 / 100;
            JOptionPane.showMessageDialog(null, "Su bono es de " + bono);
            salarioConBono += (int) bono;
            JOptionPane.showMessageDialog(null, "Su salario con el bono aplicado es de " + salarioConBono);
        }

        
        double deduccion = 0;
        if (salarioConBono > 2500 && salarioConBono < 3500) {
            deduccion = salarioConBono * 2.7 / 100;
            JOptionPane.showMessageDialog(null, "Su deduccion del 2.7% es de " + deduccion);
        } else if (salarioConBono > 3500) {
            deduccion = salarioConBono * 3.8 / 100;
            JOptionPane.showMessageDialog(null, "Su deduccion del 3.8% es de " + deduccion);
        }

        int salarioNeto = (int) (salarioConBono - deduccion);
        JOptionPane.showMessageDialog(null, "Su salario neto final es de " + salarioNeto);

       
        double montoSEM = salarioNeto * 0.0925;
        double montoIVM = salarioNeto * 0.0508;
        double montoAsociacion = salarioNeto * 0.025;

       
        double variableMuestra = montoSEM + montoIVM + montoAsociacion;

        
        
        JOptionPane.showMessageDialog(null,
    "La empresa debera abonar a la CCSS el monto de " + (montoSEM + montoIVM) +
    " por concepto de SEM y IVM." +
    "Para la asociacion de la empresa se le asigna un valor de " + montoAsociacion +
    "Total aportado por la empresa (variableMuestra): " + variableMuestra);

    }
}

                
    
    

