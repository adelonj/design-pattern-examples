package org.example.abstract_method.example_2.factory;

import org.example.abstract_method.example_2.Button;
import org.example.abstract_method.example_2.DeleteButton;

public class DeleteDialog extends Dialog{
    @Override
    public Button createButton() {
        return new DeleteButton();
    }
}
