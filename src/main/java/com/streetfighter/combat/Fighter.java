package com.streetfighter.combat;

import java.util.Random;

public class Fighter extends Robot {
    private int nombre;
    
    public Fighter(String nomRobot, int nombrePointDeVie, int nombre) {
        super(nomRobot, nombrePointDeVie);
        this.nombre = nombre;
    }
    
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    public void fire(Robot robot){
        boolean p;
        Random r = new Random();
        p = true;
        if (p == true) {
            robot.setNombrePointDeVie(robot.getNombrePointDeVie() - 2);
        }
        if (robot.getNombrePointDeVie() == 0) {
            System.out.println("Fin du combat : " + robot.getNomRobot() + " a ete tue par " + nomRobot);
        } else if (nombrePointDeVie == 0) {
            System.out.println("Fin du combat : " + nomRobot + " a ete tue par " + robot.getNomRobot());
        }
    }
}
