import static iu.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor DDefault = new Doctor();
        Doctor William = new Doctor("William Moreno", "Cardiólogo");
        Patient carlos = new Patient("Carlos Martinez", "c@c.com");

        carlos.weight = 70.5;
        carlos.height = 1.80;

    }

}
