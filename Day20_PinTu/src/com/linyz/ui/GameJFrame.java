package com.linyz.ui;

/*相对路径是相当于当前项目*/

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;
import java.util.Random;
import java.util.StringTokenizer;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //    定义二维数组
    int[][] data = new int[4][4];

    //    定义空白图片的位置
    int x;
    int y;

    int[][] win = new int[][]{
            {0, 1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15}
    };

    //定义拼图块路径
    StringBuilder image_path = new StringBuilder("Day20_PinTu\\image\\animal\\animal5\\");

    //    定义步数变量
    int step = 0;


    /*
    *       因为在要给子项添加点击事件,
    *       所以要声明在成员位置,
    *       使得所有方法都可以访问
    *
    * */
//    功能选项中子项
    JMenuItem re_game_jmenuitem = new JMenuItem("重新开始");
    JMenuItem re_signin_jmenuitem = new JMenuItem("重新登录");
    JMenuItem exit_game_jmenuitem = new JMenuItem("退出游戏");

//    更换图片子项中的子项
    JMenuItem girl = new JMenuItem("女孩");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

//    关于我们选项中的子项
    JMenuItem followus_jmenuitem = new JMenuItem("关注我们");




    //构造方法
    public GameJFrame() {

//        界面初始化
        initJFrame();
//        菜单初始化
        initJMenuBar();

//        图片顺序初始化
        initData();
//        图片容器初始化
        initImage();

//        显示窗口 放在最后
        this.setVisible(true);


    }

    private void initData() {
//        打乱索引位置
        Random r = new Random();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        /*将arr中的数字添加到二维数组data中*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];
        }

    }


    private void initImage() {
        StringBuilder sb = new StringBuilder();

//        清空所有图片
        this.getContentPane().removeAll();

//        显示胜利
        if (victory()) {
            JLabel winjlabel = new JLabel(new ImageIcon("Day20_PinTu\\image\\win.png"));
            winjlabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winjlabel);
        }

//        显示步数
        JLabel stepCount = new JLabel("步数: " + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        /*先加载的图片在上方*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
//                获取图片索引
                int number = data[i][j];
//                拼接路径
                sb.append(image_path).append(number).append(".jpg");
//                将图片路径添加到ImageIcon对象中,并把对象添加到管理容器JLabel中
                JLabel jlabel = new JLabel(new ImageIcon(sb.toString()));
//                设置拼图块的位置  注意这里的位置关系!
                jlabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
//                设置拼图块边框
                jlabel.setBorder(new BevelBorder(0));
//                将拼图块管理容器添加到界面中
                this.getContentPane().add(jlabel);
//                清空sb里的内容
                sb.delete(0,sb.length());
            }
        }

//        添加背景图片到管理容器中
        JLabel background = new JLabel(new ImageIcon("Day20_PinTu\\image\\background.png"));
//        设置背景图片的位置
        background.setBounds(40, 40, 508, 560);
//        将背景图片添加到界面中
        this.getContentPane().add(background);

//        刷新界面
        this.getContentPane().repaint();


    }

    /*给菜单初始化的方法*/
    private void initJMenuBar() {

        /*初始化菜单*/
        /*创建整个菜单对象*/
        JMenuBar jmb = new JMenuBar();
        /*创建两个选项对象: 功能,关于我们 */
        JMenu function_jmenu = new JMenu("功能");
        JMenu about_jmenu = new JMenu("关于我们");
        JMenu switch_image = new JMenu("更换图片");



//        将子项添加到更换图片选项中
        switch_image.add(girl);
        switch_image.add(animal);
        switch_image.add(sport);

//        将三个子项添加到功能选项中
        function_jmenu.add(re_game_jmenuitem);
        function_jmenu.add(re_signin_jmenuitem);
        function_jmenu.add(exit_game_jmenuitem);
//        将更换图片选项添加到功能选项中
        function_jmenu.add(switch_image);

//        将关注我们子项添加到关于我们选项中
        about_jmenu.add(followus_jmenuitem);



        /*添加点击事件*/

//        给功能中的子项添加事件
        re_game_jmenuitem.addActionListener(this);
        re_signin_jmenuitem.addActionListener(this);
        exit_game_jmenuitem.addActionListener(this);

//        给更换图片中的子项添加事件
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

//        给关于我们中的子项添加事件
        followus_jmenuitem.addActionListener(this);


        /*将两个选项添加到菜单中*/
        jmb.add(function_jmenu);
        jmb.add(about_jmenu);

        /*将菜单添加到界面中*/
        this.setJMenuBar(jmb);
    }


    /*给界面初始化的方法*/
    private void initJFrame() {

        /*设置宽高*/
        this.setSize(603, 680);
        /*设置标题*/
        this.setTitle("拼图beta1");
        /*设置界面置顶*/
        this.setAlwaysOnTop(true);
        /*设置界面居中*/
        this.setLocationRelativeTo(null);
        /*设置关闭模式  退出后关闭进程*/
        this.setDefaultCloseOperation(3);

        /*设置界面中隐藏的布局管理器为null*/
        this.setLayout(null);


//        给界面添加键盘监听
        this.addKeyListener(this);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        StringBuilder sb = new StringBuilder();
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
//            加载完整图片
            JLabel all = new JLabel(new ImageIcon(sb.append(image_path).append("all.jpg").toString()));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
//            加载背景图片
            JLabel background = new JLabel(new ImageIcon("Day20_PinTu\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
//            刷新界面
            this.getContentPane().repaint();
//            清空sb里的内容
            sb.delete(0,sb.length());

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        如果胜利结束游戏
        if (victory()) {
            return;
        }


        int code = e.getKeyCode();

        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
//            一键胜利 w
            data = new int[][]{
                    {0, 1, 2, 3},
                    {4, 5, 6, 7},
                    {8, 9, 10, 11},
                    {12, 13, 14, 15}
            };
            initImage();
        }

    }

    //    判断data数组和win数组中数据相同
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
//        全都一样返回true
        return true;

    }


    //    子项鼠标点击事件
    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();
        if (obj == re_game_jmenuitem) {
            System.out.println("重新游戏");
//            再次打乱二维数组的图片,计步器清零,重新打乱数据,加载图片
            step = 0;
            initData();
            initImage();

        } else if (obj == re_signin_jmenuitem) {
            System.out.println("重新登录");
//            关闭当前游戏
            this.setVisible(false);
//            打开登陆界面
            new SigninJFrame();

        } else if (obj == exit_game_jmenuitem) {
            System.out.println("退出游戏");
//            直接关闭虚拟机即可
            System.exit(0);

        } else if (obj == followus_jmenuitem) {
            System.out.println("关注我们");
//            创建弹窗对象
            JDialog jDialog = new JDialog();
//            创建管理图片容器对象jlabel
            JLabel jLabel = new JLabel(new ImageIcon("Day20_PinTu\\image\\about.png"));
//            设置宽高
            jLabel.setBounds(0, 0, 258, 258);
//            将图片添加到弹窗中
            jDialog.getContentPane().add(jLabel);
//            设置弹窗大小
            jDialog.setSize(344, 344);
//            让弹窗置顶
            jDialog.setAlwaysOnTop(true);
//            让弹窗居中
            jDialog.setLocationRelativeTo(null);
//            让弹窗不关闭
            jDialog.setModal(true);
//            让弹窗显示出来
            jDialog.setVisible(true);

//            随机更换图片
        } else if (obj == animal) {
            System.out.println("更换图片---动物");
            Random r = new Random();
            image_path.delete(image_path.length() - 2,image_path.length()).append(r.nextInt(8) + 1).append("\\");
            System.out.println(image_path.toString());
            step = 0;
            initData();
            initImage();
        } else if (obj == girl) {
            System.out.println("更换图片---女孩");
            Random r = new Random();
            image_path.delete(0,image_path.length());
            image_path.append("Day20_PinTu\\image\\girl\\girl").append(r.nextInt(13) + 1).append("\\");
            System.out.println(image_path.toString());
            step = 0;
            initData();
            initImage();
        } else if (obj == sport) {
            System.out.println("更换图片---运动");
            Random r = new Random();
            image_path.delete(0,image_path.length());
            image_path.append("Day20_PinTu\\image\\sport\\sport").append(r.nextInt(10) + 1).append("\\");
            System.out.println(image_path.toString());
            step = 0;
            initData();
            initImage();
        }
    }


}




