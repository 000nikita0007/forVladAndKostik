package Lab;

import Lab.Class.BossOfFactory;
import Lab.Class.Enum.Category;
import Lab.Class.Enum.Post;
import Lab.Class.Slesar;
import Lab.Class.Tokar;
import Lab.Class.service.Service;

public class Main {
    public static void main(String[] args) {
        BossOfFactory boss = new BossOfFactory("Nikita",4500.0,3);
        System.out.println(boss);
        Slesar slesar = new Slesar("Vlad", Post.SLESAR,20,1200.0, Category.SECOND);
        Tokar tokar = new Tokar("Kostik",Post.TOKAR,21,1200.0,Category.THIRD);
        Service service = new Service();
        service.addWorker(slesar);
        service.addWorker(tokar);
        service.showWorkerList();
        System.out.println(slesar.taxCalc());
        System.out.println(tokar.taxCalc());
        System.out.println(boss.taxCalc());
    }
}
