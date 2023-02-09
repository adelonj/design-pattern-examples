package org.example.abstract_method.example_2;

import org.example.abstract_method.example_2.factory.DeleteDialog;
import org.example.abstract_method.example_2.factory.Dialog;
import org.example.abstract_method.example_2.factory.SaveDialog;

public class Main {
    public static void main(String[] args) {

        Dialog dialog = new DeleteDialog();
        dialog.renderWindow();

        dialog = new SaveDialog();
        dialog.renderWindow();
    }
}
