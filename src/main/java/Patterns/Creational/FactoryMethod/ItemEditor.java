package Patterns.Creational.FactoryMethod;

import javax.swing.*;

public interface ItemEditor {

    public JComponent getGUI();
    public void commitChanges();

}
