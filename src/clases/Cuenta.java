/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javafx.scene.control.ButtonBar;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCYLEONOR
 */

public class Cuenta {

    private int numerodecuenta;
    private int identificacion;
    private long saldoactual ;
    private double interesanual;
    
    
    

    public Cuenta(int numerodecuenta, int identificacion, long saldoactual, double interesanual) {
        this.numerodecuenta = numerodecuenta;
        this.identificacion = identificacion;
        this.saldoactual = saldoactual;
        this.interesanual = interesanual;

    }

   
    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public long getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(long saldoactual) {
        this.saldoactual = saldoactual;
    }

    public double getInteresanual() {
        return interesanual;
    }

    public void setInteresanual(double interesanual) {
        this.interesanual = interesanual;
    }

    

    public Cuenta ingresar() {
        int n2, n3, n5,n1;
        double n4;
        int h;
        int sw = 1;
        Cuenta c;
        
        do{
        String n = JOptionPane.showInputDialog(null, "Ingrese La Cantidad De Dinero");
        n1 = (int) (this.saldoactual + Integer.parseInt(n));
        this.saldoactual =  n1;
        h = Helper.mensaje(null, "¿Desea Volver A Ingresar Dinero?","Ingresar",3);
            if (h == 0) {
                sw = 0;
            }
            else{
                sw = 1;
            }
        } while (sw == 0);
        
        n2 = this.identificacion;
        n3 = this.numerodecuenta;
        n4 = this.interesanual;
        
        
        
        c = new Cuenta(n3, n2, saldoactual, n4);
        return c;
        
    }

    public Cuenta retirar() {
        int n2, n3, n5,n1;
        double n4;
        Cuenta c;
        int h;
        int sw = 1;
        
        
        do{
        String n = JOptionPane.showInputDialog(null, "Ingrese La Cantidad Que Desea Extraer");
        n1 = (int) (this.saldoactual - Integer.parseInt(n));
        h = Helper.mensaje(null, "¿Desea Volver A Extraer Dinero?","Ingresar",3);
            if (h == 0) {
                sw = 0;
            }
            else{
                sw = 1;
            }
        } while (sw == 0); 
        
        n2 = this.identificacion;
        n3 = this.numerodecuenta;
        n4 = this.interesanual;
        this.saldoactual = n1;

        c = new Cuenta(n3, n2,saldoactual, n4);
        return c;

    }

     public Cuenta actualizarsaldo() {
        int n2, n3, n5,n1;
        double n4;
        Cuenta c;

        
        saldoactual = (int) (this.saldoactual + (this.saldoactual * (this.interesanual / 365))) ;    
        
        n2 = this.identificacion;
        n3 = this.numerodecuenta;
        n4 = this.interesanual;

        c = new Cuenta(n3, n2,saldoactual, n4);
        return c;

    }
    
}
