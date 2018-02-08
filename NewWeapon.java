public class NewWeapon extends Weapon{
    protected String name;
    protected static int num = 0;
    public NewWeapon(String name, int damage, int loadTime){
        super(damage, loadTime);
        this.name = name;
        num++;
    }
    public void fire(){
        System.out.println(name + " fire");
    }
    public void draw(){
        System.out.println(name + " draw");
    }
     public int compareTo(Object c){
        if(!(c instanceof Weapon)){
            System.out.println("Error: Object does not belong to Weapon");
        }
        if(loadTime < (((Weapon)c).loadTime)){
            return -1;
        }
        if(loadTime>(((Weapon)c).loadTime)){
            return 1;
        }
        return 0;
    }
    
}