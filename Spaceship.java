public class Spaceship implements Drawable{
    public void draw(){
        System.out.println("Drawable");
    }
	
	private Weapon[] weapons;;
	public Spaceship(Weapon[] w){
		weapons = w;
	}
	public void setWeapon(Weapon[] w){
		weapons = w;
	}
	
	public void fireFastestWeapon(int n){
		weaponSort(weapons);
		if(n<=weapons.length){
			for(int i =0; i<=n-1;i++){
				weapons[i].fire();
			}
		}
    	else{		
            for(int i =0; i<weapons.length;i++){
               	weapons[i].fire();
            }
        }
            		
   	}
       
	public static void weaponSort(Weapon[] w){
		Weapon fastest;
		int fastestIndex;
		for(int i = 0; i<=w.length-2;i++){
			fastest = w[i];
			fastestIndex = i;
			for(int j = 1;j<=i-1;j++){
				if(fastest.compareTo(w[j])<0){
    				fastest = w[j];
    				fastestIndex = j;
				}
			}
        	if (fastestIndex!= i){
        		w[fastestIndex]=w[i];
        		w[i]=fastest;
        	}	
	  	}
		
	}
	
}