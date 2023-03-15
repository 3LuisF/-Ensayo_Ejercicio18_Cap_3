/*18. Se tiene la siguiente información de un empleado: 
 · código del empleado, 
 · nombres, 
 · número de horas trabajadas al mes, 
 · valor hora trabajada, 
 · porcentaje de retención en la fuente. 
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.*/

package ejercicio_18_cap3;

import javax.swing.JOptionPane;

public class Empleado {
    
    //Atributos:
   int CodigoEmpleado,NumHoras;
   double ValorHora,PorcRete;
   String Nombre;
   
   //Metodos:
    public void Nomina (){
        CodigoEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo Empleado"));
        Nombre = JOptionPane.showInputDialog("Ingrese Nombre del Empleado");
        NumHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas"));
        ValorHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Valor de la  Hora"));
        PorcRete = Float.parseFloat(JOptionPane.showInputDialog("Ingrese porcentaje retencion en la fuente, sin %"));
        PorcRete /= 100;
    
    }
    public void Salidas (){
        System.out.println("El codigo del empleado es: "+CodigoEmpleado+"\n"+Nombre+" Devengo un salario bruto de "+(NumHoras*ValorHora)+" y su salario neto es: "+((NumHoras*ValorHora)*(1-PorcRete)));
        JOptionPane.showMessageDialog(null, "El codigo del empleado es: "+CodigoEmpleado+"\n"+Nombre+" Devengo un salario bruto de "+(NumHoras*ValorHora)+" y su salario neto es: "+((NumHoras*ValorHora)*(1-PorcRete)));
        
            }   
        
        
    
}
