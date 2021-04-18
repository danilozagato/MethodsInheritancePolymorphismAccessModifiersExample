package InheritanceExamples;

import InterfaceExample.EmitirSom;

public class Pato extends Animal implements EmitirSom {

    public void alteraSom() {
        this.setSomAnimal("Quack Quack Quack");
    }

    @Override
    public void emitirSomCaracteristico() {
        System.out.println(getSomAnimal());
    }

    @Override
    public String qualSeuSomCaracteristico() {
        return getSomAnimal();
    }
}
