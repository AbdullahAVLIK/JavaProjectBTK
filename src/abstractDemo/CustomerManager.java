package abstractDemo;

public class CustomerManager  {

    BaseDataBaseManager databaseManager;

    public void getCustomer(){
        databaseManager.getData();


    }
}


//        OracleDataBaseManager oracleDataBaseManager = new OracleDataBaseManager();
//        oracleDataBaseManager.getData();
