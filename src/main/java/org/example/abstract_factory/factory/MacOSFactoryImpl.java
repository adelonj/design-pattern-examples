package org.example.abstract_factory.factory;

import org.example.abstract_factory.button.Button;
import org.example.abstract_factory.button.MacOSButtonImpl;
import org.example.abstract_factory.checkbox.Checkbox;
import org.example.abstract_factory.checkbox.MacOSCheckBoxImpl;
import org.example.abstract_factory.factory.GUIFactory;

public class MacOSFactoryImpl implements GUIFactory {
    public Button createButton() {
        return new MacOSButtonImpl();
    }
    public Checkbox createCheckbox() {
        return new MacOSCheckBoxImpl();
    }
}
