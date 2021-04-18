package MethodsExamples;

public class MethodsExample {

    //Metodo sem retorno, com dois parametros na assinatura
    public void somaDoisNumeros(Integer a, Integer b) {
        System.out.println(a + b);
    }

    //Metodo com retorno que soma dois numeros
    public Integer somaDoisNumerosERetornaSoma(Integer a, Integer b) {
        return a + b;
    }

    //Metodo que não tem retorno e não recebe parametros na assinatura
    public void somaDoisNumerosSemParametros() {
        Integer a = 3;
        Integer b = 5;
        System.out.println(a + b);
    }

    public Integer somaDoisNumerosERetornaSoma() {
        Integer a = 3;
        Integer b = 5;
        return a + b;
    }
}
