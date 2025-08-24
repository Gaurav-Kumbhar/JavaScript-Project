import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter a new task: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added.");
                    break;

                case 3:
                    System.out.print("Enter the number of the task to remove: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        String removedTask = tasks.remove(taskNumber - 1);
                        System.out.println("Removed: " + removedTask);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting To-Do List. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        }

        scanner.close();
    }
}
