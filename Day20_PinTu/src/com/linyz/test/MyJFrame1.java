package com.linyz.test;
/*鼠标点击按钮事件,接口ActionListener*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame1 extends JFrame {

    public MyJFrame1(){
        /*界面初始化*/
        this.setSize(683, 680);
        this.setTitle("鼠标点击事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);


//        设置按钮
        JButton jbt = new JButton("我是按钮");
        jbt.setBounds(0,0,100,50);


//        用匿名内部类给jbt这个按钮添加动作监听
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我啊");
            }
        });

        this.getContentPane().add(jbt);

        this.setVisible(true);

    }

}
