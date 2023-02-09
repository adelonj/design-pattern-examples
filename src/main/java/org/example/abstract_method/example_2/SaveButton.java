package org.example.abstract_method.example_2;

public class SaveButton implements Button {

    public void render() {
        System.out.println("<button>Save Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Saved'");
    }
}
