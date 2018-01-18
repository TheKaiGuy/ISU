
public class Wizard extends Character{
    public int HP=3;
    public int damage=1;
    public Wizard(String nm, String g){
        super(nm,g);
    } 

    @Override
    public void upgrade() {
        damage+=1;
    }

    @Override
    public boolean isRanged() {
        return true;
    }
} 
