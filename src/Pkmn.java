public class Pkmn {
    private int puntiSalute;
    private int attack;
    private int defense;
    private Weapon arma;
    private boolean armed;

    public Pkmn(int puntiSalute, int attack, int defense, Weapon arma){
        this.puntiSalute = puntiSalute;
        this.attack = attack;
        this.defense = defense;
        this.arma = arma;
        this.armed = true;
    }

    public void subisciDanni(int attackPoints){
        int healthPoints;
        healthPoints = (attackPoints*100/defense)/5+2;
        puntiSalute = puntiSalute-healthPoints;
    }
    public int arrecaDanni(){
        int danno;
        if(armed){
            danno=attack+arma.getAtkStat();
        }
        else{
            danno=attack;
        }
        return danno;
    }
    public void cambiaArma(){
        armed = !armed;
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

    public Weapon getArma(){
        return arma;
    }
}
