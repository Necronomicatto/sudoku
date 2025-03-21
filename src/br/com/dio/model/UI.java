package br.com.dio.model;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener{

    public UI(){
        this.setTitle("Sudoku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setSize(700, 500);
        //setIconImage(icon.getImage());
        //getContentPane().setBackground(dfltClr);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.white);

        JPanel pnl1 = new JPanel();
        pnl1.setBackground(Color.red);
        pnl1.setBounds(20,30,400,400);
        pnl1.setLayout(new GridLayout(9,9));
        add(pnl1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
