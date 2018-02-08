import java.util.ArrayList;
public class SpaceShipClient{
    public static void main(String[] args){
        Weapon[] weapons = new Weapon[10];
        Spaceship spaceShip = new Spaceship(weapons);
        
        weapons[0] = new SingularityCannon("Flash",30,3);
        weapons[1] = new SingularityCannon("TheDeath",50,6);
        weapons[2] = new Laser("AllSpeed",20,2);
        weapons[3]  = new Laser("DestroyAll",70,8);
        
        spaceShip.fireFastestWeapon(5);
        
        /** CREAT NEW WEAPONS & ADD TO THE SHIP**/
        
        Weapon n1 = new NewWeapon("GravitonBomb",90,10);
        Weapon n2 = new NewWeapon("PhaseDisruptor",80,9);
        Weapon[] newWeapons = new Weapon[weapons.length + NewWeapon.num];

        for(int i = 0; i<weapons.length; i++){
            newWeapons[i]=weapons[i];
        }
        newWeapons[weapons.length] = n1;
        newWeapons[weapons.length+1]=n2;
        
        



      
    }
    
      
}