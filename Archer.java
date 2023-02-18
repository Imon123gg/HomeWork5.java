public class Archer extends Character{
    int numberOfArrows;
    Archer(String parametr) {
        super(parametr);
        hello = "Hello friend, are you ready to shooting?";
        System.out.println();
    }
    void shooting(){
    damage = numberOfArrows;
    }
}
