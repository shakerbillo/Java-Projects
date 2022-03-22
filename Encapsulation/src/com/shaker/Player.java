package com.shaker;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // Player's number of lives reduces
        }
    }
        public int healthRemaining(){
            return this.health;
        }
    }

