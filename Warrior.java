/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Warrior {
    int armor_strength;
    
    public Warrior(int armor_strength, String name, int health) {
        this.armor_strength = armor_strength;
    }
    
    public int getArmor_strength() {
        return armor_strength;
    }
    
    public void setArmor_strength(int armor_strength) {
        this.armor_strength = armor_strength;
    }
    
    public void attack(){ 
        if (getWeapon() != null) {
            System.out.println(getName() + "attack" + getWeapon.getType());           
        }else{
            System.out.println("Error: Warrior needs a Weapon to attack:  ");
        }
    }     

    public void defend(){    
        System.out.println(getName() + "defend" + armor_strength);         
    }   
    
    
    @Override
    public String toString() {
        return "Warrior{" + "armor_strength=" + armor_strength + '}';
    }
}



