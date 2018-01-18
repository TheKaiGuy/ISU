
public class Fighter extends Character {
    public int HP=3;
    public int damage=2;
    public Fighter(String nm, String g){
        super(nm,g);
    }

    @Override
    public void upgrade() {
        HP+=1;
    }

    @Override
    public boolean isRanged() {
        return false;
    }
      
}
