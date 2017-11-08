
public class Spear extends Weapon
{
    private char symbol;
    private String type;
    private String name;
    private int damage;
    private int durability;
    
    public Spear() {
       type = "Weapon";
       name = "Spear";
       damage = 5;
       durability = 5;
       symbol = '$';
    }
    
    public String getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public int attack() {
        durability -= 1;
        return damage;
    }
    
        public int getDamage() {
        return damage;
    }
    
    public int getDurability() {
        return durability;
    }
    
    public char getSymbol() {
        return symbol;
    }
}
