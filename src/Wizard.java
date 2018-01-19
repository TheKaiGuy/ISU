
public class Wizard extends Character{
    public int HP=3;
    public int damage=1;
    public Wizard(String nm, String g){
        super(nm,g);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
 