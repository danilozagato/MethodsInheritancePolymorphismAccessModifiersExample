package InheritanceExamples;

public abstract class Animal {

    private String somAnimal = "Som Desconhecido";

    public void imprimiSom() {
        System.out.println(somAnimal);
    }

    public String getSomAnimal() {
        return somAnimal;
    }

    public void setSomAnimal(String somAnimal) {
        this.somAnimal = somAnimal;
    }
}
