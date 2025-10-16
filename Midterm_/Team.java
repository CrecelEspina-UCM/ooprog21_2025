import java.util.Scanner;

public class Team {
    private String name;
    private int code;

    public Team() {
        this.code = 1;
        this.name = "Boards Team";
    }

    public void updateTeam(Scanner sc) {
        System.out.println("\nEmployee Team Details Update Selection Menu:");
        System.out.println("---------------------------------------------");
        System.out.println("1. Boards Team");
        System.out.println("2. HR-Policy Team");
        System.out.println("3. Administration Team");
        System.out.println("4. Android Mobile Team");
        System.out.println("---------------------------------------------");
        System.out.print("Enter Selection: ");
        int selection = sc.nextInt();
        sc.nextLine();

        switch (selection) {
            case 1 -> { code = 1; name = "Boards Team"; }
            case 2 -> { code = 2; name = "HR-Policy Team"; }
            case 3 -> { code = 3; name = "Administration Team"; }
            case 4 -> { code = 4; name = "Android Mobile Team"; }
            default -> System.out.println("Invalid selection.");
        }
    }

    public String getName() { return name; }
    public int getCode() { return code; }
}
Write to Jexie Ashley Capuno

