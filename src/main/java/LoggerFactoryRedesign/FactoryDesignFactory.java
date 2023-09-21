package LoggerFactoryRedesign;

public class FactoryDesignFactory {


    public static void main(String[] args) {

        ILoggerFactory debugLoggerFactory = new DebugLoggerFactory();
        ILogger ilogger = debugLoggerFactory.createLogger();
        ilogger.log("msg");


        ILoggerFactory infoLoggerFactory = new InfoLoggerFactory();
        ilogger= infoLoggerFactory.createLogger();
        ilogger.log("msg");



    }
}
