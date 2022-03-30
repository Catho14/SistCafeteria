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
public class CalculoProducto {
    public static void main(String[]args){
    
    int i,n;float cost, acum=0,pacl,cam; 
  
         String nom;
         n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de productos a procesar:"));
         
          float  tp[]=new float[n];
          float tpa[]=new float[n];
          for(i=1;i<=n;i++)
           {
               nom = JOptionPane.showInputDialog("Nombre del producto "+i+": ");
               tp[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el total de "+nom+"s que se vendio:"));
               cost=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el costo de un producto:"));
               tpa[i]=tp[i]*cost;
               acum=acum+tpa[i];
                JOptionPane.showMessageDialog(null,"El total a pagar es: $"+tpa[i]);
                
           }
         for(i=1;i<=n;i++)
           {
                JOptionPane.showMessageDialog(null,"Producto: "+i+"\nTotal vendido: "+tp[i]+"\n"
                        + "Pago del consumo del producto: $"+tpa[i]);
           }
          JOptionPane.showMessageDialog(null,"El total a pagar es: $"+acum);
           pacl=Float.parseFloat(JOptionPane.showInputDialog("Escriba la cantidad que pago el cliente: "));
           cam=pacl-acum;
           JOptionPane.showMessageDialog(null,"El total a regresar al cliente es: $"+cam);
           
}}
