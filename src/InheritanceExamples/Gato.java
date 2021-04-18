package InheritanceExamples;

import InterfaceExample.EmitirSom;

public class Gato extends Animal implements EmitirSom {

    public void alteraSom() {
        this.setSomAnimal("Miau Miau Miau");
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
