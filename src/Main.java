//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Собака: " + dog +
                "\nКот: " + cat +
                "\nБумага: " + paper);

        var plusDog = dog + 4;
        var plusCat = cat + 4;
        var plusPaper = paper + 4;

        System.out.println();

        System.out.println("Собака: " + plusDog +
                "\nКот: " + plusCat +
                "\nБумага: " + plusPaper);

        System.out.println();

        var minusDog = dog - 3.5;
        var minusCat = cat - 1.6;
        var minusPaper = paper - 7639;

        System.out.println("Собака: " + minusDog +
                "\nКот: " + minusCat +
                "\nБумага: " + minusPaper);

        System.out.println();

        System.out.println("------ Друг ------");
        var friend = 19;
        System.out.println("Друг: " + friend);
        friend += 2;
        System.out.println("Друг: " + friend);
        friend /= 7;
        System.out.println("Друг: " + friend);

        System.out.println();

        System.out.println("------ Лягушка ------");
        var frog = 3.5;
        System.out.println("Лягушка: " + frog);
        frog *= 10;
        System.out.println("Лягушка: " + frog);
        frog /= 3.5;
        System.out.println("Лягушка: " + frog);
        frog += 4;
        System.out.println("Лягушка: " + frog);

        System.out.println();

        System.out.println("------ Бокс ------");
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var generalWeight = boxer1 + boxer2;
        System.out.println("Общая масса: " + generalWeight);

        var difference = boxer2 - boxer1;
        System.out.println("Разница в весе: " + difference);

        var remainderWeight = boxer2 % boxer1;
        System.out.println("Остаток: " + remainderWeight);

        System.out.println();

        System.out.println("------ Работники ------");
        var workingHours = 640;
        var numberEmployees = workingHours / 8;
        System.out.println("Всего работников в компании - " + numberEmployees + " человек.");

        var newNumberEmployees = numberEmployees + 94;
        var newWorkingHours = newNumberEmployees * 8;
        System.out.println("Если в компании работает " + newNumberEmployees +
                " человек, то всего " + newWorkingHours +
                " часов работы может быть поделено между сотрудниками.");
    }
}