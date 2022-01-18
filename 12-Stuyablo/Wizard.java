public class Wizard extends Adventurer {
    private int  mana;
    private String warcry;
    private int manaMax;

    public Wizard(){
	     this("Albus");
    }

    public Wizard(String name){
	     this(name,"ALAKAZAM", 18);
    }

    public Warrior(String name, String spell, int mana){
      super(name,30+(int)(Math.random()*10));
      setWarcry(spell);
      setMana(mana);
      manaMax = mana;
    }

    //warrior methods

    public void attack(Damageable other){
    	  int damage = (int)(Math.random()*7)+1;
  	    other.applyDamage(damage);
  	    setMana(getMana() + 1);
  	    System.out.println(this +
            " hit " + other + " for " +
            damage + " damage!");
    }

    public void specialAttack(Damageable other){
	     if(getMana() >= 3){
  	        int damage = (int)(Math.random()*15)+1;
            other.applyDamage(damage);
            System.out.println(this + " unleashes his wizardly powers upon "
             + other + " for " + damage + " damage! "+warcry);
            setRage(getRage() - 10);
	    }else{
			    System.out.println("Not enough mana! ");
          attack(other);
	    }
    }


    // getters and setters

    public int getMana(){
	     return mana;
    }

    //set methods
    public void setMana(int mana){
	     this.mana = mana;
    }

    public void setWarcry(String spell){
	     this.warcry = spell;
    }


    public String getSpecialName() {
      return "mana";
    }

    public int getSpecialMax(){
      return manaMax;
    }

    public int getSpecial(){
      return mana;
    }



}
