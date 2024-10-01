package heranca;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Gabriel", 5000);
        Gerente mestre = new Gerente("João", 10000);
        System.out.println("Bonus do Gabriel: " + mestre.calcularBonus());
        System.out.println("Bonus do João: " + dev.calcularBonus());
        dev.trabalhar();
        mestre.trabalhar();
    }
}
