package com.streetfighter.combat;

public class Arena {
    private Robot robot;
    private Fighter human;
    
    public Arena(Robot robot, Fighter human) {
        this.robot = robot;
        this.human = human;
    }
    
    public void fight(){
        String tireur;
        if (human.getNombre() == 1) {
            human.fire(robot);
            tireur = human.getNomRobot();
        } else {
            robot.fire(human);
            tireur = robot.getNomRobot();
        }
        
        while (human.IsDead() == false && robot.IsDead() == false){
            if (tireur == robot.getNomRobot()) {
                human.fire(robot);
                tireur = human.getNomRobot();
            } else {
                robot.fire(human);
                tireur = robot.getNomRobot();
            }
        }
    }   
}
