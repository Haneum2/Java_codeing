package monster;
public class Monster {

    String name;
    int health;
    int attackPower;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        System.out.println(this.name + " Monster constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Monster target) {
        System.out.println(this.name + " is attacking " + target.getName());
        target.health = target.health - this.attackPower;
    }

    public void run() {
        System.out.println(this.name + " is running away");
    }


}

