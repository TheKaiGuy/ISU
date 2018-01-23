
public class Wizard extends Character{
    
    public Wizard(String nm, String g){
        super(nm,g);
        HP=5;
        damage=1;
    } 
    public Wizard()
    {
        super();
        HP=5;
        damage=1;
    }

    @Override
    public String upgrade() {
        damage+=1;
        String str="Great Mage"+name+"'s magic has been empowered, and now deals +1 damage";
        return str;
    }

    @Override
    public boolean isRanged() {
        return true;
    }

    @Override
    public String victory() {
        String str="And just like magic, Satan has disappeared.. excellent work, "+name+"!";
        return str;
    }

    @Override
    public String death() {
        String str="Ding dong, the witch is dead, which old witch? "+name+".";
        return str;
    }
} 
 