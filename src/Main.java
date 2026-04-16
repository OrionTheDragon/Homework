import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int passingAge = 18;
        HashMap<String, Integer> agePeople = new HashMap<>();

        agePeople.put("Вася", 18);
        agePeople.put("Катя", 17);
        agePeople.put("Матвей", 24);
        agePeople.put("Дмитрий", 15);

        for (Map.Entry<String, Integer> aP: agePeople.entrySet()) {
            if (aP.getValue() >= passingAge) {
                System.out.println("Возраст " + aP.getKey() + " равен " + aP.getValue() +
                        " Он/Она совершеннолетний");
            }
            else {
                System.out.println("Возраст " + aP.getKey() + " равен " + aP.getValue() +
                        " Он/Она не достиг совершеннолетия, нужно немного подождать");
            }
        }
    }
}