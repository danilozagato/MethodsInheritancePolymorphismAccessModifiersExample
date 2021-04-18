package InheritanceExamples;

import InterfaceExample.EmitirSom;

public class Cachorro extends Animal implements EmitirSom {

    public void alteraSom() {
        this.setSomAnimal("Au Au Au");
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
