public class Character {
    public String name;
    int height;
    int age;
    int iq;
    String hello;
    int damage;
    int force;
    Character(String parametr){
        if(parametr.equals("DEFAULT")) {
            name = "Uvuvwevwevwe  Onyetenyevwe Ugwemuhwem Osas";
            height = 160;
            age = 20;
            iq = 100;
            hello = "Default hello";
            force = 100;
            }
        }
        void damaging() {
        damage = force;
    }
    void studying(){
        iq++;
    }
    void birthday(){
        age++;
    }
    void growing(){
        height++;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getName(){
        return name;
    }
}
