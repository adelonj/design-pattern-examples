package org.example.abstract_factory.factory;

import org.example.abstract_factory.button.Button;
import org.example.abstract_factory.button.WindowsButtonImpl;
import org.example.abstract_factory.checkbox.Checkbox;
import org.example.abstract_factory.checkbox.WindowsCheckBoxImpl;
import org.example.abstract_factory.factory.GUIFactory;

public class WindowsFactoryImpl implements GUIFactory {
    public Button createButton() {
        return new WindowsButtonImpl();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckBoxImpl();
    }
}
