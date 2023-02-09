package org.example.abstract_factory;

import org.example.abstract_factory.factory.GUIFactory;
import org.example.abstract_factory.factory.MacOSFactoryImpl;
import org.example.abstract_factory.factory.WindowsFactoryImpl;

public class Main {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactoryImpl();
        } else {
            factory = new WindowsFactoryImpl();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
