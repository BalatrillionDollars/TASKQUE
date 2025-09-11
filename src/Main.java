import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String>  list = new ArrayList();
    public static void main(String[] args) {

        loop();

    }
    public static void loop() {

        System.out.println("A: SEE TASKS B: ADD TASKS C: REMOVE TASK");
        char prompt = sc.next().charAt(0);
        if (prompt == 'A') {
            view();
        } else if (prompt == 'B') {

        } else if (prompt == 'C') {
            remove()
        }
        else{
            System.out.println("FAILED");
            loop();
        }
    }
    public static void view() {
        int i = 0;
        for (String x : list){
            System.out.println(i + " " + x);
            i++;
        }
    }
    public static void remove() {
        char prompt = sc.nextInt();
        list.remove(prompt);
    }
}