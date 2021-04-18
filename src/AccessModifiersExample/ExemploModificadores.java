package AccessModifiersExample;

public class ExemploModificadores {

    //pode ser acessada por todos
    public void classePublica() {
    }

    //pode ser acessada via herança e classes dentro do mesmo pacote
    protected void classeProtected() {
    }

    //não pode ser acessada por ninguem externo
    private void classePrivada() {
    }

    public Integer inteiroPublic;
    protected Integer inteiroProtected;
    private Integer inteiroPrivated;
}
