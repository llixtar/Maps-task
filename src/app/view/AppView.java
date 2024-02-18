package app.view;

import java.util.Scanner;

public class AppView {
    private final Scanner scanner = new Scanner(System.in);


    public void showText(String txt) {
        System.out.println(txt);
    }

    public int preview(){
      int res;
        showText("""
                Enter:
                1 - Show all iPhones.
                2 - Search by ID.
                0 - Exit.""");
        try {
            res = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            res = 0;
            scanner.close();
        }

      if(res == 0)
          scanner.close();

      return res;
    }

    public int chooseId(){
        int input;

        showText("Enter ID:");
        try {
            input = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            input = 0;
        }

        scanner.close();
        return input;
    }
}
