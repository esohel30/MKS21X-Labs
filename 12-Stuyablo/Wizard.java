public class Wizard extends Adventurer {
    private int  mana;
    private String warcry;

    public Wizard(){
	     this("Albus");
    }

    public Wizard(String name){
	     this(name,"ALAKAZAM", 18);
    }

    public Warrior(String name, String warcry, int mana){
      super(name,30+(int)(Math.random()*10));
      setWarcry(warcry);
      setMana(mana);
    }

    //warrior methods

    public void attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setMana(getMana() + 1);
  	    System.out.println(this +
            " attacked " + other + " for " +
            damage + " damage!");
    }

    public void specialAttack(Damageable other){
	     if(getMana() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            System.out.println(this + " unleashes his wizard powers upon "
             + other + " for " + damage + " damage! "+warcry);
            setRage(getRage() - 10);
	    }else{
			    System.out.println("Not enough mana! ");
          attack(other);
	    }
    }

    //get methods

    public int getMana(){
	     return rage;
    }

    //set methods
    public void setMana(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }


}
