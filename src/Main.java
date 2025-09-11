import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop();

    }
    public static void loop() {
        System.out.println("?");
        char prompt = sc.next().charAt(0);
        if (prompt == 'A') {

        } else if (prompt == 'B') {

        } else if (prompt == 'C') {

        }
        else{
            System.out.println("FAILED");
            loop();
        }
    }
    public static void view() {}

    public static void addtask() {
        System.out.println("What would you like to add?");
        list.add(sc.nextline());
    }

}