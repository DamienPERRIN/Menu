import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.displayAvailableMenus();
        Scanner sc = new Scanner(System.in);
        order.displaySelectedMenu(sc.nextInt());
    }
}
