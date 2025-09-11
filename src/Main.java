import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String>  list = new ArrayList();
    public static void main(String[] args) {

        loop();

    }
    public static void loop() {

        System.out.println("A: SEE TASKS B: ADD TASKS C: REMOVE TASK, ANYTHING ELSE: CLOSE PROGRAM");
        char charac = sc.nextLine().charAt(0);
        if (charac == 'A') {
            int i = 0;
            for (String x : list){
                System.out.println(i + " " + x);
                i++;
            } loop();
        } else if (charac == 'B') {
            System.out.println("ENTER TASK?");
            String task = sc.nextLine();
            list.add(task);

            loop();
        } else if (charac == 'C') {
        int prompt = sc.nextInt();
            list.remove(charac); loop();
        }
        else{
            System.out.println("FAILED");
        }
    }





}