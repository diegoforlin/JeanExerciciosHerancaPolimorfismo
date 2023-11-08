public class Main {
    public static void main(String[] args) {
        Ingresso ingressoVIP = new IngressoVip("Lollapalooza", 600.0);
        Ingresso ingressoComum = new IngressoComum("Lollapalooza", 150.0);

        ingressoVIP.imprimir();
        ingressoComum.imprimir();
    }       
}