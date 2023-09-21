package LoggerFactoryRedesign;

public class InfoLogger implements ILogger {


    @Override
    public void log(String logMsg) {
        System.out.println("INFO log : "+ logMsg);
    }
}
