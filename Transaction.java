public class Transaction {
    

    String description;
    private double amount;
    
    public void setAmount(double amount){
        if (amount < 0){
            System.out.println("Amount cannot be negative");
            this.amount = 0;
        }else {
            this.amount = amount;
        }
        
    }

    public double getAmount(){
        return amount;
    }

    Transaction(String description, double amount) {
        this.description = description;
        setAmount(amount);
    }

    void printSummary(){
        System.out.printf("Transaction: %s - RM%.2f%n", description, getAmount());
    }

    public static void main(String[] args) {
        Transaction t = new Transaction("Lunch", -12.5);
        t.printSummary();

        Transaction t2 = new Transaction("Taxi", 8.0);
        t2.printSummary();
    }
}
