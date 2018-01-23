public abstract class Character {
    protected String name;
    protected String gender;
    protected int HP,damage;
    
    public Character(String nm, String g){
        name=nm;
        gender=g;
        HP=3;
    }
    public Character(){
        name="Bob";
        gender="M";
        HP=3;
    }
    public abstract String upgrade();
    public abstract boolean isRanged();
    public abstract String victory();
    public abstract String death();
 
    final public String getPronoun1(){
        if(gender.equals("M"))
            return "he";
        
        else
            return "she";
    }
    final public String getPronoun2(){
        if(gender.equals("M"))
            return "his";
        else
            return "her";
    }
    final public int takeDamage(int dmg){
        HP-=dmg;
        return HP;
    }
    final public int getDamage(){
        return damage;
    }
    final public int getHP(){
        return HP;
    }
    final public String getName(){
        return name;
    }
}
 