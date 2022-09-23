package polymorphısm;

public class Main {
    public static void main(String[] args) {
//       BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger(),new Consollogger()};
//       for (BaseLogger logger: loggers){
//           logger.Log("log mesajı");
//       }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
