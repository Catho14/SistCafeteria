/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorradorPrograma;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CalculoSencillo {
   
    
    int i,n;float resultado = 0,resul = 0,cost, acum=0,pacl,cam; 
  
         String nom;
         void ProductosCalcular() {
         n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de productos a procesar:"));
          for(i=1;i<=n;i++)
           {
               nom = JOptionPane.showInputDialog("Nombre del producto "+i+": ");
        float tp = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el total de "+nom+"s que se vendio:"));
               cost=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el costo de un producto:"));
        float tpa = tp*cost;
               acum=acum+tpa;
                JOptionPane.showMessageDialog(null,"El total a pagar es: $"+tpa);
                
           }}
         void Pago(){
          JOptionPane.showMessageDialog(null,"El total a pagar es: $"+acum);
           pacl=Float.parseFloat(JOptionPane.showInputDialog("Escriba la cantidad que pago el cliente: "));
           cam=pacl-acum;
           JOptionPane.showMessageDialog(null,"El total a regresar al cliente es: $"+cam);
         }
}

