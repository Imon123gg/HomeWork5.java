import java.util.Scanner;
public class Tester extends Character {
    String name;
    Tester(String parametr) {
        super(parametr);
        name = "Test";
    }
    public static class ErrorCreatingCharacter extends Throwable {
        public String testerName() throws Throwable {
            System.out.println("Enter your name: ");
            Scanner scanner = new Scanner(System.in);
            String testerName = scanner.nextLine();
            Exception ErrorCreatingCharacter = new Exception();
            if(!testerName.equals("Test")){
                throw ErrorCreatingCharacter;
            }
            return testerName;
        }
    }
}
