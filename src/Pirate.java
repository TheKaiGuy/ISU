
public class Pirate extends Character{
    
    public Pirate(String nm, String g){
        super(nm,g);
        damage=2;
        HP=5;
    } 
    public Pirate()
    {
        super();
        damage=2;
        HP=5;
    }

    @Override
    public String upgrade() {
       damage+=1;
       String str="Captain "+name+" has sharpened "+getPronoun2()+" sword and now deals +1 damage";
       return str;
    }

    @Override
    public boolean isRanged() {
        return false;
    }

    @Override
    public String victory() {
        String str="The beast himself has walked the plank all thanks to Captain "+name+". Good work, ye scurvy dog.";
        return str;
    }

    @Override
    public String death() {
        String str="Captain "+name+" was keelhauled... not a true pirate.";
        return str;
    }


}  
 