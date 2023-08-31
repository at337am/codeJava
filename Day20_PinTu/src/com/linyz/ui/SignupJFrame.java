package com.linyz.ui;

import javax.swing.*;

public class SignupJFrame extends JFrame {
    public SignupJFrame(){
        this.setSize(488, 500);
        /*设置标题*/
        this.setTitle("注册beta1");
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
