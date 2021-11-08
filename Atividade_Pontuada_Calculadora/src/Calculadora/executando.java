
package Calculadora;


public class executando extends pegarNum implements calculos, Porcentagem {
    
 public double calculoSomar(double a, double b){
    return a+b;
}

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }
    @Override
    public double dividir(double a, double b) {
        return a/b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }

    @Override
    public double soma(double a, double b) {
        return a*b;
    }

    @Override
    public double porcentagem(double a, double b) {
        return a/100 * b;
    }

    @Override
    public double somarPorcentagem(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double subtrairPorcentagem(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double dividirPorcentagem(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double multiplicarPorcentagem(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
