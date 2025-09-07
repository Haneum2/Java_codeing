package monster;

public class Main2 {
    public static class hunter extends Monster {
        public hunter(String name, int health, int attackPower) {
            super(name, health, attackPower);
            System.out.println(this.name + " Hunter constructor");
        }

        public void attack(Monster target) {
            System.out.println(this.name + " is attacking " + target.getName());
            target.health = target.health - this.attackPower;
        }
    }

    
    public static void main(String[] args){
        Monster mon1 = new Monster("고블린", 100, 10);
        Monster mon2 = new Monster("오크", 200, 20);
        hunter hun1 = new hunter("사냥꾼", 150, 15);


        hun1.attack(mon1);
        System.out.println("hunter HP LEVEL UP!");
        hun1.health = hun1.health + 10;
        System.out.println("hunter HP: " + hun1.health);
        mon1.attack(mon2);
        mon1.run();
        mon1.getName();
        System.out.println(mon2.health);
    }
}
