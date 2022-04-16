
import java.io.IOException;

import static colors.ConsoleColors.*;
import static utils.Utils.clearScreen;
import static utils.Utils.temporizer;

public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
        clearScreen();
        System.out.println(COLOR_BLUE);
        temporizer(1);
        clearScreen();
        System.out.println(COLOR_GREEN);
        temporizer(1);
        clearScreen();
        System.out.println(COLOR_RED);
        temporizer(1);
        clearScreen();
        System.out.println(COLOR_YELLOW);
        temporizer(1);
        clearScreen();
    }


}
