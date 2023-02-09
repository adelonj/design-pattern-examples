package org.example.abstract_factory.checkbox;

import org.example.abstract_factory.checkbox.Checkbox;

public class WindowsCheckBoxImpl implements Checkbox {
    public boolean create() {
        System.out.println("created CheckboxWindows");
        return true;
    }
}
