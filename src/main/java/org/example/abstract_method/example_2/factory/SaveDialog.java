package org.example.abstract_method.example_2.factory;

import org.example.abstract_method.example_2.Button;
import org.example.abstract_method.example_2.SaveButton;

public class SaveDialog extends Dialog{
    @Override
    public Button createButton() {
        return new SaveButton();
    }
}
