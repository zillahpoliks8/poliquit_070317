
package Abstractpackage;
class FlyingSuperHero extends SuperHero{
 /**
 *This method will display power
 * @param
 * This method does not have a parameter.
 * @return
 * This method does not return any value
 */
    @Override
        void displayPower(){
            System.out.println("Fly...");
        }
    void setSP(String superPowers[]){
        super.setSuperPower(superPowers);
    }
   }
