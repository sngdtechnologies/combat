package com.streetfighter.combat;

public class Arena {
    private Robot robot1;
    private Robot robot2;
    
    public Arena(Robot robot1, Robot robot2) {
        this.robot1 = robot1;
        this.robot2 = robot2;
    }
    
    public void fight(){
        robot1.fire(robot2);
        String tireur = robot1.getNomRobot();
        
        while (robot2.IsDead() == false && robot1.IsDead() == false){
            if (tireur == robot1.getNomRobot()) {
                robot2.fire(robot1);
                tireur = robot2.getNomRobot();
            } else {
                robot1.fire(robot2);
                tireur = robot1.getNomRobot();
            }
        }
    }
}
