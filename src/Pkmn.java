public class Pkmn {
    private int puntiSalute;
    private int attack;
    private int defense;

    public Pkmn(int puntiSalute, int attack, int defense){
        this.puntiSalute = puntiSalute;
        this.attack = attack;
        this.defense = defense;
    }

    public void danni(int attackPoints){
        int healthPoints;
        healthPoints = (attackPoints*100/defense)/5+2;
        puntiSalute = puntiSalute-healthPoints;
    }

    public void setPuntiSalute(int puntiSalute) {
        this.puntiSalute = puntiSalute;
    }

    public int getPuntiSalute() {
        return puntiSalute;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
