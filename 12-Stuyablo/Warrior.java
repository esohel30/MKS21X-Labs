public class Warrior extends Adventurer {
    private int  rage;
    private String warcry;
    private int maxRage;

    public Warrior(){
	     this("Magnus");
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18);
    }

    public Warrior(String name, String warcry, int rage) {
      super(name,30+(int)(Math.random()*10));
      setWarcry(warcry);
      setRage(rage);
      this.maxRage = rage;
    }

    //warrior methods

    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setRage(getRage() + 1);
  	    return (this +
            " attacked " + other + " for " +
            damage + " damage!");
    }

    public String specialAttack(Damageable other){
	     if(getRage() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            return (this + " unleashes his fury upon "
             + other + " for " + damage + " damage! "+warcry);
	    }else{
          return attack(other);
	    }
    }

    //get methods

    public int getRage(){
	     return rage;
    }

    //set methods
    public void setRage(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }

    public int getSpecialMax() {
      return maxRage;
    }

    public int getSpecial() {
      return rage;
    }

    public String getSpecialName(){
      return "Rage";
    }



}
