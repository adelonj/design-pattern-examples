package org.example.abstract_method.example_2.factory;

import org.example.abstract_method.example_2.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
