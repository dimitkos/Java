package com.java.pamak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessFrame extends JFrame {

    private BoardPanel panel;


    public ChessFrame()
    {
        panel= new BoardPanel();
        this.setContentPane(panel);


        MouseclickListener listener= new MouseclickListener();

        panel.addMouseListener(listener);

        //me aythn thn methodokanoume orato to parathyro sthn othonh otan kalestei o kataskeyasths ths
        this.setVisible(true);
        //dinoume diastaseis sto parathyro
        this.setSize(400,400);
        //vazoume onoma sto parathyro
        this.setTitle("Chessboard");

        //edw kanoume ti tha ginei ama pathsei to x o xrhsths sto parathyro
        //sto orismo mpoorume na valoume enan akeraio opou o kathenas exie eidikh shmasia
        //sthn periptwsh mas to kaname etsi se priotwsh ou den thymmaste tis statheres
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class BoardPanel extends JPanel{
        private static  final int ROWS=8;
        private static  final int COLUMNS=8;
        private int xCoord=50;
        private int yCoord=50;

        //efodiazei tis klaseis me methodous pou mou epitrepoun na allaksw tis syntetagmenes
        //ayto tha to criastw sto click event opoy thelw na metakinisw to pioni
        public void setxCoord(int xCoord) {
            this.xCoord = xCoord;
        }

        public void setyCoord(int yCoord) {
            this.yCoord = yCoord;
        }

        //epi tou antikeimenou g mporw na kalesw methodous px na sxediaozun grammes
        public  void paintComponent(Graphics g)
        {
            //estw to kathe koutaki emhn exei stathero megethos alla na metavaletai analoga me to ypsos tou parathirou
            int sqSize=this.getHeight()/ROWS;
            //twra tha ftiaksw mia skakiera opou me dyo for sarwnw grammes kais thles
            for(int i=0;i<ROWS;i++)
            {
                for (int j=0;j<COLUMNS;j++){
                    int x =j*sqSize;
                    int y= i*sqSize;

                    g.drawRect(x,y,sqSize,sqSize);
                    if((i+j)%2!=0)
                    {
                        g.setColor(Color.BLUE);
                        g.fillRect(x,y,sqSize,sqSize);
                    }
                    else
                    {
                        g.setColor(Color.YELLOW);
                        g.fillRect(x,y,sqSize,sqSize);
                    }
                }

                //ftiaxnoume mia eleipsh opou tha einai me kokkino xrwma kai tha paizei ton rolo pioniou
                g.setColor(Color.RED);
                g.fillOval(xCoord,yCoord,40,40);
            }

        }


    }
    class MouseclickListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            int x=e.getX();
            int y=e.getY();

            panel.setxCoord(x-20);
            panel.setyCoord(y-20);

            //ksanasxeiazoume thn skakiera kai to pioni kathe fora pou ginei mouseclick
            panel.repaint();



        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
