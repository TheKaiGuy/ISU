
public class Fighter extends Character {
   
   
    public Fighter(String nm, String g){
        super(nm,g);
        HP=5;
        damage=2;
    }
    public Fighter()
    {
        super();
        HP=5;
        damage=2;
    }
    
    @Override
    public String upgrade() {
        HP+=1;
        String str="Champion "+name+" has trained and has gained +1 HP";
        return str;
    }

    @Override
    public boolean isRanged() {
        return false;
    }

    @Override
    public String victory() {
        String str="Satan, the undefeated champion for over 900 years, was finally dethroned today by your newest Champ, "+name+"!";
        return str;
    }

    @Override
    public String death() {
        String str=name+" is down for the count!";
        return str;
    }
      
}
 