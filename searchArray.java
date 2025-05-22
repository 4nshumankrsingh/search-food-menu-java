import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"Biryani", "Korma", "Nahari", "Kebab"};

        System.out.print("Which food item are you looking for?: ");
        String target = scanner.nextLine();
        boolean isFound = false;
        for(int i = 0; i < menu.length; i++) {
            if(target.equalsIgnoreCase(menu[i])) {
                System.out.printf("%s is available", menu[i]);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("This item is not available");
        }
        scanner.close();
    }
}