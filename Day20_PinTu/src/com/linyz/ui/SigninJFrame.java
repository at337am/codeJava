package com.linyz.ui;

import javax.swing.*;

public class SigninJFrame extends JFrame {
    public SigninJFrame(){
        this.setSize(488, 430);
        /*设置标题*/
        this.setTitle("登录beta1");
        /*设置界面置顶*/
        this.setAlwaysOnTop(true);
        /*设置界面居中*/
        this.setLocationRelativeTo(null);
        /*设置关闭模式  退出后关闭进程*/
        this.setDefaultCloseOperation(3);

        /*显示窗口*/
        this.setVisible(true);
    }
}
