package org.example.abstract_factory;

import org.example.abstract_factory.button.Button;
import org.example.abstract_factory.checkbox.Checkbox;
import org.example.abstract_factory.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.create();
        checkbox.create();
    }
}
