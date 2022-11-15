public class Main {
    public static void main(String[] args) {
        Pkmn trevenant = new Pkmn(250, 85, 50);
        Pkmn palossand = new Pkmn(300, 40, 120);
        trevenant.danni(palossand.getAttack());
        System.out.println("PS: "+trevenant.getPuntiSalute());
    }
}