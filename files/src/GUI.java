import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GUI extends JFrame {

    private JButton button;
    private JPanel panel;
    private JFileChooser fileChooser;

    public  GUI()
    {
        //kataskeyazw ta antikeima
        button = new JButton("Select file");
        panel = new JPanel();
        fileChooser = new JFileChooser();

        //topothetw to plhktro sto panel
        panel.add(button);

        //vazw to panel sto parathyro
        this.setContentPane(panel);

        //kanw xeirismo symbantwn sthn periptwsh pou pathsw to koumpi
        //sthn parametrometbibazw ena neo antikeimeno
        //kai dhlwnw kai thn klash
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //me to skowopendialogue anoigei enaw explorer twn arxeiwn
                //egw tha mathw mesw ths metavlhths an o xrhsths pathse open h cancel
                int returnval = fileChooser.showOpenDialog(panel);

                //an patithike to open
                if (returnval==JFileChooser.OPEN_DIALOG)
                {
                    //h methodos ayth epistrefei to arxeio poy epelkse o xrhsths
                    File file = fileChooser.getSelectedFile();

                    try
                    {

                        FileReader freader = new FileReader(file);
                        BufferedReader reader= new BufferedReader(freader);
                        //tha mou epistrefei thn prwth grammh
                        String line = reader.readLine();
                        while( line !=null)
                        {
                            //tha typwnei thn grmmh
                            System.out.println(line);
                            //kaimeta tha pernw thn epomenh grammh
                            line= reader.readLine();

                        }
                        //kanw close to arxeio
                        reader.close();
                        freader.close();
                    }
                    catch (FileNotFoundException exc)
                    {
                        exc.printStackTrace();
                    }
                    catch (IOException exc)
                    {
                        exc.printStackTrace();
                    }


                }

            }
        });

        //kanei orath thn forma
        this.setVisible(true);
        //vazw to megethos ths formas
        this.setSize(200,200);


    }
}
