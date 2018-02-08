public abstract class Weapon implements Comparable, Drawable{
    protected int damage;
    protected int loadTime;
    protected int numWeapon = 0;
    public Weapon(int d, int l){
        this.damage = d;
        this.loadTime = l;
    }
    public int getDamage(){
        return damage;
    }
    public int getLoadTime(){
        return loadTime;
    }
    public void setDamage(int d){
        damage = d;
    }
    public void setLoadTime(int l){
        loadTime = l;
    }
    public abstract void fire();
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
	public abstract void draw();  
}