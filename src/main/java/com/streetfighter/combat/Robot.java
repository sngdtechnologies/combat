package com.streetfighter.combat;

public class Robot {
    String nomRobot;
    int nombrePointDeVie;

    public Robot(String nomRobot, int nombrePointDeVie) {
        this.nomRobot = nomRobot;
        this.nombrePointDeVie = nombrePointDeVie;
    }

    public String getNomRobot() {
        return nomRobot;
    }

    public void setNomRobot(String nomRobot) {
        this.nomRobot = nomRobot;
    }

    public int getNombrePointDeVie() {
        return nombrePointDeVie;
    }

    public void setNombrePointDeVie(int nombrePointDeVie) {
        this.nombrePointDeVie = nombrePointDeVie;
    }
   
    public void fire(Fighter fight){
        fight.setNombrePointDeVie(fight.getNombrePointDeVie() - 2);
        if (fight.getNombrePointDeVie() == 0) {
            System.out.println("Fin du combat : " + fight.getNomRobot() + " a ete tue par " + nomRobot);
        } else if (nombrePointDeVie == 0) {
            System.out.println("Fin du combat : " + nomRobot + " a ete tue par " + fight.getNomRobot());
        }
    }
    
    public boolean IsDead(){
        if(nombrePointDeVie == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Robot{" + "nomRobot=" + nomRobot + ", nombrePointDeVie=" + nombrePointDeVie + '}';
    }
}
