/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Mage {
    int mana;
    public Mage(int mana, String name, int health) {
        this.mana = mana;
    }   
    public int getMana() {
        return mana;
    }     
    public void setMana(int mana) {
        this.mana = mana;
    }      
    @Override
    public String toString() {
        return "Mage{" + "mana=" + mana + '}';
    } 
    
    public static void main(String[] args){
        System.out.println("");
    }
    
}
