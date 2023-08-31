package com.linyz.test;

/*键盘监听事件*/

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {

    public MyJFrame3(){
//        界面初始化
        this.setSize(683, 680);
        this.setTitle("键盘动作事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);

//        给界面添加键盘监听
        this.addKeyListener(this);

//        显示界面
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");

        int code = e.getKeyCode();
        if (code == 65){
            System.out.println("A");
        }else if (code == 66){
            System.out.println("B");
        }
        /*...*/
    }
}
