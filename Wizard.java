public class Wizard extends Character {
    int mana;
    Wizard(String parametr) {
        super(parametr);
        mana = 100;
        hello = "Hello, do you want some magic?";
        System.out.println();
    }
    @Override
    void damaging() {
        super.damaging();
        damage = mana;
    }
}
