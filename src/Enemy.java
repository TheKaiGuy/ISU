
import java.util.Random;
public class Enemy {
    String name;
    int HP;
    
    public Enemy(String nm,int ip){
       name=nm;
       HP=ip;
    }
    public void takeDamage(int dmg){
        HP-=dmg;
    }
    public String getName(){
        return name;
    }
    public int getHP(){
        return HP;
    }
    
}
