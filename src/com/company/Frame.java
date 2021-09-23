package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonDot;
    private JButton buttonDivision;
    private JButton buttonMultiply;
    private JButton buttonMinus;
    private JButton buttonPlus;
    private JButton buttonEqual;
    private JButton buttonReset;
    private JLabel jLabelAnswer;
    private String num ="";
    static double answer = 0.0;
    static boolean fun = false;
    static String op = "";

    public Frame(){
        setSize(242,375);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonDot = new JButton(".");
        buttonDivision = new JButton("/");
        buttonMultiply = new JButton("X");
        buttonMinus = new JButton("-");
        buttonPlus = new JButton("+");
        buttonEqual = new JButton("=");
        buttonReset = new JButton("AC");
        jLabelAnswer = new JLabel("0",JLabel.RIGHT);
        jLabelAnswer.setFont(jLabelAnswer.getFont().deriveFont(15.0f));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "1";
                jLabelAnswer.setText(num);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "2";
                jLabelAnswer.setText(num);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "3";
                jLabelAnswer.setText(num);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "4";
                jLabelAnswer.setText(num);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "5";
                jLabelAnswer.setText(num);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "6";
                jLabelAnswer.setText(num);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "7";
                jLabelAnswer.setText(num);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "8";
                jLabelAnswer.setText(num);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num += "9";
                jLabelAnswer.setText(num);
            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!num.equals("0")){
                    num += "0";
                    jLabelAnswer.setText(num);
                }
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (!fun){
                        if (!num.equals("")){
                            answer = Double.parseDouble(num);
                            num = "";
                            op = "+";
                            fun = true;
                        }else{
                            op = "+";
                            fun = true;
                        }

                    }
                    else if(fun && op.equals("+")){
                        try{
                            answer += Double.parseDouble(num);
                            jLabelAnswer.setText(String.valueOf(answer));
                            num = "";
                            op = "+";
                        }catch (NumberFormatException a){
                            System.out.println(a);
                        }


                    }
                    else if (fun && !op.equals("+")){
                        switch(op){
                            case "-":
                                if (!num.equals("")){
                                    answer -= Double.parseDouble(num);
                                    jLabelAnswer.setText(String.valueOf(answer));
                                    System.out.println(op);
                                    num = "";
                                    op = "+";
                                    break;
                                }else{
                                    op ="+";
                                    break;
                                }
                            case "X":
                                if (!num.equals("")){
                                    answer *= Double.parseDouble(num);
                                    jLabelAnswer.setText(String.valueOf(answer));
                                    num = "";
                                    op = "+";
                                    break;
                                }else{
                                    op = "+";
                                    break;
                                }
                            case "/":
                                if (!num.equals("")){
                                    answer /= Double.parseDouble(num);
                                    jLabelAnswer.setText(String.valueOf(answer));
                                    num = "";
                                    op = "+";
                                    break;
                                }else{
                                    op = "+";
                                    break;
                                }

                        }
                    }
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (!fun){
                        if (!num.equals("")){
                            answer = Double.parseDouble(num);
                            num = "";
                            op = "-";
                            fun = true;
                        }
                        else{
                            op = "-";
                            fun = true;
                        }

                    }
                    else if (fun && op.equals("-")){
                        try{
                            answer -= Double.parseDouble(num);
                            jLabelAnswer.setText(String.valueOf(answer));
                            num = "";
                            op = "-";
                        }catch(NumberFormatException a){
                            System.out.println(a);
                        }

                    }
                    else if (fun && !op.equals("-")){
                        switch(op){
                            case "+":
                                if (!num.equals("")){
                                    answer += Double.parseDouble(num);
                                    jLabelAnswer.setText(String.valueOf(answer));
                                    num = "";
                                    op = "-";
                                    break;
                                }else{
                                    op = "-";
                                    break;
                                }
                            case "X":
                                if (!num.equals("")){
                                    answer *= Double.parseDouble(num);
                                    jLabelAnswer.setText(String.valueOf(answer));
                                    num = "";
                                    op = "-";
                                    break;
                                }else{
                                    op = "-";
                                    break;
                                }
                            case "/":
                                if (!num.equals("")){
                                    answer /= Double.parseDouble(num);
                                    jLabelAnswer.setText(String.valueOf(answer));
                                    num = "";
                                    op = "-";
                                    break;
                                }else{
                                    op = "-";
                                    break;
                                }
                        }
                    }
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!fun){
                    if (!num.equals("")){
                        answer = Double.parseDouble(num);
                        num = "";
                        op = "X";
                        fun = true;
                    }
                    else{
                        op = "X";
                        fun = true;
                    }

                }
                else if (fun && op.equals("X")){
                    try{
                        answer *= Double.parseDouble(num);
                        jLabelAnswer.setText(String.valueOf(answer));
                        num = "";
                        op = "X";
                    }catch(NumberFormatException a){
                        System.out.println(a);
                    }

                }
                else if (fun && !op.equals("X")){
                    switch(op){
                        case "+":
                            if (!num.equals("")){
                                answer += Double.parseDouble(num);
                                jLabelAnswer.setText(String.valueOf(answer));
                                num = "";
                                op = "X";
                                break;
                            }else{
                                op = "X";
                                break;
                            }
                        case "-":
                            if (!num.equals("")){
                                answer -= Double.parseDouble(num);
                                jLabelAnswer.setText(String.valueOf(answer));
                                System.out.println(op);
                                num = "";
                                op = "X";
                                break;
                            }else{
                                op ="X";
                                break;
                            }
                        case "/":
                            if (!num.equals("")){
                                answer /= Double.parseDouble(num);
                                jLabelAnswer.setText(String.valueOf(answer));
                                num = "";
                                op = "X";
                                break;
                            }else{
                                op = "X";
                                break;
                            }
                    }
                }
            }
        });

        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!fun){
                    if (!num.equals("")){
                        answer = Double.parseDouble(num);
                        num = "";
                        op = "/";
                        fun = true;
                    }
                    else{
                        op = "/";
                        fun = true;
                    }

                }
                else if (fun && op.equals("/")){
                    try{
                        answer /= Double.parseDouble(num);
                        jLabelAnswer.setText(String.valueOf(answer));
                        num = "";
                        op = "/";
                    }catch(NumberFormatException a){
                        System.out.println(a);
                    }

                }
                else if (fun && !op.equals("/")){
                    switch(op){
                        case "+":
                            if (!num.equals("")){
                                answer += Double.parseDouble(num);
                                jLabelAnswer.setText(String.valueOf(answer));
                                num = "";
                                op = "/";
                                break;
                            }else{
                                op = "/";
                                break;
                            }
                        case "-":
                            if (!num.equals("")){
                                answer -= Double.parseDouble(num);
                                jLabelAnswer.setText(String.valueOf(answer));
                                System.out.println(op);
                                num = "";
                                op = "/";
                                break;
                            }else{
                                op ="/";
                                break;
                            }
                        case "X":
                            if (!num.equals("")){
                                answer *= Double.parseDouble(num);
                                jLabelAnswer.setText(String.valueOf(answer));
                                num = "";
                                op = "/";
                                break;
                            }else{
                                op = "/";
                                break;
                            }
                    }
                }
            }
        });

        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!num.contains(".")){
                    num += ".";
                    jLabelAnswer.setText(num);
                }
            }
        });


        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch(op){
                    case "+":
                        try{
                            fun = false;
                            answer += Double.parseDouble(num);
                            jLabelAnswer.setText(String.valueOf(answer));
                            num = "";
                            break;
                        }catch (NumberFormatException a){
                            System.out.println(a);
                        }

                    case "-":
                        try{
                            fun = false;
                            answer -= Double.parseDouble(num);
                            jLabelAnswer.setText(String.valueOf(answer));
                            num = "";
                            break;
                        }catch (NumberFormatException a){
                            System.out.println(a);
                        }

                    case "X":
                        try{
                            fun = false;
                            answer *= Double.parseDouble(num);
                            jLabelAnswer.setText(String.valueOf(answer));
                            num = "";
                            break;
                        }catch (NumberFormatException a){
                            System.out.println(a);
                        }

                    case "/":
                        try{
                            fun = false;
                            answer /= Double.parseDouble(num);
                            jLabelAnswer.setText(String.valueOf(answer));
                            num = "";
                            break;
                        }catch (NumberFormatException a){
                            System.out.println(a);
                        }

                }

            }

        });

        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer = 0;
                num = "";
                jLabelAnswer.setText("0");
                fun = false;
                op = "";
            }
        });

        init();
        setResizable(false);
        setLayout(null);
        setVisible(true);

    }

    public void init(){
        button0.setSize(120,50);
        button0.setLocation(0,300);
        add(button0);

        button1.setSize(60,50);
        button1.setLocation(0,255);
        add(button1);

        button2.setSize(60,50);
        button2.setLocation(60,255);
        add(button2);

        button3.setSize(60,50);
        button3.setLocation(120,255);
        add(button3);

        button4.setSize(60,50);
        button4.setLocation(0,210);
        add(button4);

        button5.setSize(60,50);
        button5.setLocation(60,210);
        add(button5);

        button6.setSize(60,50);
        button6.setLocation(120,210);
        add(button6);

        button7.setSize(60,50);
        button7.setLocation(0,165);
        add(button7);

        button8.setSize(60,50);
        button8.setLocation(60,165);
        add(button8);

        button9.setSize(60,50);
        button9.setLocation(120,165);
        add(button9);

        buttonDot.setSize(60,50);
        buttonDot.setLocation(120,300);
        add(buttonDot);

        buttonEqual.setSize(60,50);
        buttonEqual.setLocation(180,300);
        add(buttonEqual);

        buttonPlus.setSize(60,50);
        buttonPlus.setLocation(180,255);
        add(buttonPlus);

        buttonMinus.setSize(60,50);
        buttonMinus.setLocation(180,210);
        add(buttonMinus);

        buttonMultiply.setSize(60,50);
        buttonMultiply.setLocation(180,165);
        add(buttonMultiply);

        buttonDivision.setSize(60,50);
        buttonDivision.setLocation(180,120);
        add(buttonDivision);

        buttonReset.setSize(60,50);
        buttonReset.setLocation(120,120);
        add(buttonReset);

        jLabelAnswer.setSize(120,50);
        jLabelAnswer.setLocation(0,120);
        add(jLabelAnswer);


    }


}
