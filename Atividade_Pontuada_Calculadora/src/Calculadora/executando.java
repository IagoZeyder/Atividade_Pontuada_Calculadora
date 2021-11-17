
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
        return a + ((b/100)*a);
    }

    @Override
    public double subtrairPorcentagem(double a, double b) {
        return a - ((b/100)*a);
    }

    @Override
    public double dividirPorcentagem(double a, double b) {
        return a / ((b/100)*a);
    }

    @Override
    public double multiplicarPorcentagem(double a, double b) {
        return a * ((b/100)*a);
    }

    @Override
    public double porcentemUmNumero(double a) {
        return a / 100;
    }

    @Override
    public double porcentemDoisNumero(double a, double b) {
        return (a/100) * b;
    }    

    
    
}
