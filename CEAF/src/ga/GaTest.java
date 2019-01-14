package ga;

/**
 *
 * @author andre
 */
public class GaTest {

    public static void main(String args[]) {
        World w = World.getInstance();
        
        w.load("students");
        for (Object student : w.students) {
            System.out.println(student.toString());
        }
    }
}
