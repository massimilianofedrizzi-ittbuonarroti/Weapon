public class Main {
    public static void main(String[] args) {
        Weapon a1 = new Weapon(100);
        Pkmn trevenant = new Pkmn(250, 85, 50, a1);
        Pkmn palossand = new Pkmn(300, 40, 120, a1);
        trevenant.subisciDanni(palossand.arrecaDanni());
        System.out.println("PS: "+trevenant.getPuntiSalute());
        trevenant.cambiaArma();
    }
}