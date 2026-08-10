class Enemy{
    String EnemyType;
    int health;
    
    void takeDamage(int DamageAmount){
        health = health - DamageAmount;
        System.out.println(EnemyType+" took "+DamageAmount+" damage! Health is now : "+ health);
        
        if(health <=0){
            System.out.println(EnemyType+" has been defeated");
        }
    }
}

public class ClassProperties{
    public static void main(String[] args){
        Enemy zombie = new Enemy();
        zombie.EnemyType = "Zombie";
        zombie.health = 100;
        
        Enemy dragon = new Enemy();
        dragon.EnemyType = "Dragon";
        dragon.health = 500;
        
        zombie.takeDamage(110);
        dragon.takeDamage(150);
    }
}