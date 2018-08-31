package com.java.pamak;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Gui extends JFrame {

    private JTextField nameField;
    private JButton addButton;
    private JList list;
    private JButton sortButton;
    private JPanel panel;
    private DefaultListModel model;
    private  JScrollPane scrollPane;




    public Gui()
    {
        //kataskeyazw ta antikeima
        nameField= new JTextField(10);
        addButton= new JButton("Add");
        list= new JList();
        sortButton = new JButton("Sort");
        panel = new JPanel();
        //kataskeyh toy monteloy
        model= new DefaultListModel();

        //syndeoume to grafiko me thn lista opou tah to trofodotei
        list.setModel(model);

        //kataskeyazw to scroll pane
        //metavivazw thn lista pou thelw na exei
        scrollPane = new JScrollPane(list);


        //vazw ta antikeimena se ena panel
        panel.add(nameField);
        panel.add(addButton);
        //scrollpane periexei thn lista
        panel.add(scrollPane);
        panel.add(sortButton);

        //vazw to panel sto parathyro
        this.setContentPane(panel);

        //sto pliktro prosthetoume enan akroath
        //kataskeyazw ena antikeimeno typou akroath kai dhlvnv kai thn klash toy
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //,e to athma tou koumpiou pernw to onoma
                String name= nameField.getText();
                //kai sthn synexeia kataxwrw to onoma sto montelo
                model.addElement(name);




            }
        });
        //twra tha kanoume thn idia douleia kai gia to sortbutton opou patwntas tha kanei taksinomhsh
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //e to model.elements bgazw ta stoixeia pou exei to odel s emorfh enumeration
                // omws egw tha ta kanw ayta s emorfh listas
                ArrayList<String> names = Collections.list(model.elements());
                //sthn synexeia ta kanw sort
                Collections.sort(names);

                //sthn synexeia katahrizoume to montelo
                model.clear();

                //edw diatrexw thn lista pou einai taksinomimeno kai na ta ksanabalw sthn lista
                for (String name:names) {
                    model.addElement(name);
                    
                }

            }
        });

        this.setVisible(true);
        this.setSize(500,500);


    }
}
