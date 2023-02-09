package org.example.abstract_method.example_2;

public class DeleteButton implements Button {

    public void render() {
        System.out.println("<button>Delete Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Deleted'");
    }
}
