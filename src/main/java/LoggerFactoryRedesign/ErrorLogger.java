package LoggerFactoryRedesign;

public class ErrorLogger implements ILogger {


    @Override
    public void log(String logMsg) {
        System.out.println("ERROR log : "+ logMsg);
    }
}
