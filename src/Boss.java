public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public String info() {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.weapon.setNameOfWeapon("Mjolinir");
        boss.weapon.setWeapon(WeappnType.TWO_HANDED);


return "Boss Damage: " + boss.getDamage() + " Boss Health : " + boss.getHealth() + " Boss Weapon Name : " + boss.weapon.getNameOfWeapon() +
        " Boss weapon Type : " + boss.weapon.getWeapon();

    }
}










