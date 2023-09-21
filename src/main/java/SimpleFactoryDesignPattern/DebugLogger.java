package SimpleFactoryDesignPattern;

public class DebugLogger implements ILogger {


    @Override
    public void log(String logMsg) {
        System.out.println("DEBUG log : "+ logMsg);
    }
}
