
import java.util.Random;
public class Enemy {
    String name;
    int HP;
    
    public Enemy(String nm,int ip){
       name=nm;
       HP=ip;
    }
    public int takeDamage(int dmg){
        HP-=dmg;
        return HP;
    }
    public String getName(){
        return name;
    }
    
}
