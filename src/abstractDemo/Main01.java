package abstractDemo;

public class Main01 {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager= new SqlServerManager();
        customerManager.getCustomer();

    }
}
