/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractpackage;

/**
 *
 * @author 3rd Year Account
 */
public class AbstractDemo {
    public static void main(String[] args){
        FlyingSuperHero fsh = new FlyingSuperHero();
        //fsh.displayPower();
        Spiderman sm = new Spiderman();
        //sm.displayPower();
        fsh.setSuperPower("new power", 2);
        fsh.printSuperPowers();
    }
}
