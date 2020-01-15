package Patterns.Creational.FactoryMethod;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

/**
 * Класс Contact реализ интерфейс Editable и предоставляет собственный редактор
 * Этот редакт мож работ лишь с объект класса Contact, т.к. он предназнач для
 * изменения определен атрибутов этого класса. В этой связи он реализован в виде
 * вложен класса. Такое решение позвол ему получ доступ к атрибутам внешн класса
 * В случ реализац редактора в виде отдельного (не вложенного) класса пришлось бы
 * обеспечит класс Contact дополнит методами, с помощ котор редактор мог бы получ
 * доступ к атрибутам и изменять их значения. Такое решение некорректно с точки
 * зрения огранич доступа к внутренним данным класса Contact.
 */
/*
public class Contact implements Editable, Serializable {

    private String name;
    private String relationship;

    public ItemEditor getEditor() {
        return new ContactEditor();
    }

    private class ContactEditor implements ItemEditor, Serializable {
        private transient JPanel;
        private transient JTextField nameField;
        private transient JTextField relationField;

        public JComponent getGUI() {
            if (panel == null) {
                panel = new JPanel();
                nameField = new JTextField(name);
                relationField = new JTextField(relationship);
                panel.setLayout(new GridLayout(2, 2));
                panel.add(new JLabel("Name:"));
                panel.add(nameField);
                panel.add(new JLabel("Relationalship:"));
                panel.add(relationship);
            }else{
                nameField.setText(name);
                relationField.setText(relationship);
            }
            return panel;
        }

        public void commitChanges() {
            if (panel != null) {
                name = nameField.getText();
                relationship = relationField.getText();
            }
        }

        public String toString() {
            return "\nContact:\n" +
                    "   Name: " + name + "\n" +
                    "   Relationship: " + relationship;
        }
    }
}
*/
