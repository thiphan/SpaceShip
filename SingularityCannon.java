public class SingularityCannon extends Weapon{
    protected String name;
    public SingularityCannon(String name, int damage, int loadTime){
        super(damage, loadTime);
        this.name = name;
    }
    public void fire(){
        System.out.println(name + "cannon fire");
    }
    public void draw(){
        System.out.println(name + "cannon draw");
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