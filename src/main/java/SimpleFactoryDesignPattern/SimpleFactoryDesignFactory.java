package SimpleFactoryDesignPattern;

import jdk.jfr.internal.LogLevel;

public class SimpleFactoryDesignFactory {


    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);

        debugLogger.log("msg");
        infoLogger.log("msg");
        errorLogger.log("msg");
    }
}
