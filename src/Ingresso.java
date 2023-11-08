public abstract class Ingresso {
    String nomeEvento;
    double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void imprimir();
}

class IngressoVip extends Ingresso {

    public IngressoVip(String nomeEvento, double valor) {
        super(nomeEvento, valor);
    }

    @Override
    public void imprimir() {
        System.out.println("O ingresso para o evento " + nomeEvento + " custa " + valor + " (VIP)");
    }
}

class IngressoComum extends Ingresso {

    public IngressoComum(String nomeEvento, double valor) {
        super(nomeEvento, valor);
    }

    @Override
    public void imprimir() {
        System.out.println("O ingresso para o evento " + nomeEvento + " custa " + valor + " (Comum)");
    }
}
