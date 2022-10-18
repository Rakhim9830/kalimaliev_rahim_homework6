public class Skeleton extends  Boss {

    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String information(int damage, int hp, WeappnType weappnType, String name,int arrows){

        return "Skeleton Damage: " + damage + " Skeleton Health: " + hp + " Skeleton Weapon Type: " + weappnType +  " Skeleton weapon name: " + name + " Skeleton Arrows: " + arrows;
    }
}
