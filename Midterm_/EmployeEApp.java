import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = null;
        boolean running = true;

        while (running) {
            System.out.println("\nEmployee Record Management App v1");
            System.out.println("---------------------------------------------");
            System.out.println("1. Create Employee Record");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Enter Selection: ");
            int selection = sc.nextInt();
            sc.nextLine();

            switch (selection) {
                case 1 -> {
                    emp = new Employee();
                    emp.createEmployeeRecord(sc);

                    boolean manageRecord = true;
                    while (manageRecord) {
                        System.out.println("\nEmployee Record Selection Menu:");
                        System.out.println("---------------------------------------------");
                        System.out.println("1. Update Employee Profile Details");
                        System.out.println("2. Update Employee Department Details");
                        System.out.println("3. Update Employee Team Details");
                        System.out.println("4. Display Employee Record");
                        System.out.println("0. Exit");
                        System.out.println("---------------------------------------------");
                        System.out.print("Enter Selection: ");
                        int recSel = sc.nextInt();
                        sc.nextLine();

                        switch (recSel) {
                            case 1 -> emp.updateEmployeeProfile(sc);
                            case 2 -> emp.updateDepartment(sc);
                            case 3 -> emp.updateTeam(sc);
                            case 4 -> emp.displayEmployeeRecord(); 
                            case 0 -> manageRecord = false;
                            default -> System.out.println("Invalid selection.");
                        }
                    }
                }
                case 0 -> {
                    running = false;
                    System.out.println("Exiting Employee Record Management App v1...");
                }
                default -> System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }
}
