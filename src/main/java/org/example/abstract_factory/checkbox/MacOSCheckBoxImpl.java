package org.example.abstract_factory.checkbox;

import org.example.abstract_factory.checkbox.Checkbox;

public class MacOSCheckBoxImpl implements Checkbox {
    public boolean create() {
        System.out.println("created CheckboxMacOS");
        return true;
    }
}
