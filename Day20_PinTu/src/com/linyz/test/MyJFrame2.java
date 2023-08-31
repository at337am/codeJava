package com.linyz.test;
/*鼠标五种动作事件,接口MouseListener*/

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {

//将按钮对象放在成员位置
    JButton jbt1 = new JButton("我是按钮");

    public MyJFrame2(){

//        界面初始化
        this.setSize(683, 680);
        this.setTitle("鼠标五种动作事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);

//        设置按钮位置
        jbt1.setBounds(0, 0, 100, 50);

//        给jbt1按钮添加本类中鼠标动作事件
        jbt1.addMouseListener(this);


//        给界面添加按钮
        this.getContentPane().add(jbt1);
//        显示界面
        this.setVisible(true);



    }

    /*MouseListener接口中需要重写的方法*/
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标划出");
    }
}
