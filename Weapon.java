/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Weapon {
    int damage;
    int range;
    String type;

    public Weapon(int damage, int range, String type) {
        this.damage = damage;
        this.range = range;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public String getType() {
        return type;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Weapon{" + "damage=" + damage + ", range=" + range + ", type=" + type + '}';
    }
    
    
}
