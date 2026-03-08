import java.util.Scanner;

public class BudgetSplitter {
    

    public static double readValidDouble(Scanner scanner, String prompt, double min, double max){
        double value;

        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextDouble();
                scanner.nextLine();

                if (value >= min && value <= max) {
                    return value;
                }else {
                    System.out.printf("Invalid input. Total must be greater than %.2f%n", min);
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric input.");
                scanner.nextLine();
            }
        }

    }
    // public static double readPositiveDouble(Scanner scanner, String prompt){
    //     double totalAmount;

    //     while (true) {
    //         System.out.print(prompt);
    //         try {
    //             totalAmount = scanner.nextDouble();
    //             scanner.nextLine();

    //             if (totalAmount > 0) {
    //                 return totalAmount;
    //             }else {
    //                 System.out.println("Invalid input. Total amount must be greater than 0.");
    //             }
    //         } catch (Exception e) {
    //             System.out.println("Invalid input. Please enter a numeric input.");
    //             scanner.nextLine();
    //         }
    //     }
    // }

    // public static int readMinInt(Scanner scanner, String prompt){
    //     int numberOfPeople;

    //     while (true){
    //         System.out.print(prompt);
    //         try {
    //             numberOfPeople = scanner.nextInt();
    //             scanner.nextLine();

    //             if (numberOfPeople > 0){
    //                 return numberOfPeople;
    //             }else {
    //                 System.out.println("Invalid input. Number of people must be at least 1.");
    //             }
    //         } catch (Exception e) {
    //             System.out.println("Invalid input. Please enter a numeric input.");
    //             scanner.nextLine();
    //         }
            
            
    //     }
    // }

    public static double calculateSplit(double total, int people){
        double split = total / people;
        return split;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = readValidDouble(scanner, "Enter the total amount: ", 0.01, Double.MAX_VALUE);
        int people = (int) readValidDouble(scanner, "Enter the number of people: ", 1, Integer.MAX_VALUE);
        double split = calculateSplit(total, people);
        
        Transaction bill = new Transaction("Group Bill", total);
        bill.printSummary();

        System.out.printf("Each pays: RM%.2f%n", split);
        

        



    }
}
