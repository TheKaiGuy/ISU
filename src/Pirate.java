
public class Pirate extends Character{
    public int damage=2;
    public int HP=3;
    public Pirate(String nm, String g){
        super(nm,g);
    } 

    @Override
    public void upgrade() {
       damage+=1;
    }

    @Override
    public boolean isRanged() {
        return false;
    }


}  
