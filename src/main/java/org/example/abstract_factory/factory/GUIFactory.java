package org.example.abstract_factory.factory;

import org.example.abstract_factory.button.Button;
import org.example.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
