package com.streetfighter.combat;

public class Robot {
    private String nomRobot;
    private int nombrePointDeVie;

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
    
    
    
    public void fire(Robot robot){
        robot.setNombrePointDeVie(robot.getNombrePointDeVie() - 2);
        if (robot.getNombrePointDeVie() == 0) {
            System.out.println("Fin du combat : " + robot.getNomRobot() + " a ete tue par " + nomRobot);
        } else if (nombrePointDeVie == 0) {
            System.out.println("Fin du combat : " + nomRobot + " a ete tue par " + robot.getNomRobot());
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
