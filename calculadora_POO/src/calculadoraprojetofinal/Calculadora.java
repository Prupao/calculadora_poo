/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraprojetofinal;

/**
 *
 * @author prupo
 */
public class Calculadora extends Calc {

    public Calculadora(double a, double b, float c, float d) {
        super(a, b,c,d);
    }

    @Override
    public double multiplicar(double a, double b) {
        setResult(a * b);
        return getResult();
    }
    
    @Override
    public double porcentagem(double a, double b) {
       setResult(a * (b/100));
        return getResult();
    }
   
}
