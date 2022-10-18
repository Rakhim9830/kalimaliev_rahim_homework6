import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        System.out.println(boss.info());
        Skeleton skeleton = new Skeleton();
        System.out.println(skeleton.information(20,200,WeappnType.MAGICAL,"Bow",40));
        System.out.println(skeleton.information(30,250,WeappnType.GUNSHOT, "CrossBow",30));
        }

}


