package com.linyz.a01;

//静态代码块,初始化,随着类的加载而加载

import java.util.*;

public class UserTest{

    static{
        System.out.println("这是静态代码快");
    }

    private static final String SIGNUP = "1";
    private static final String SIGNIN = "2";
    private static final String PASSWD_MODIFY = "3";
    private static final String QUITE = "q";



    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();

        while(true){
            System.out.println("----hello,这里是GitHub----\n注册---键1\n登录--键2\n忘记密码--键3");
            String num = getString();
            switch(num){
                case SIGNUP -> {
                    System.out.print("进入注册\n");
                    SignUp(list);
                }

                case SIGNIN -> {
                    System.out.print("----进入登录----\n");
                    for (int y = 0; y < 3; y++) {
                        if(SignIn(list)){
                            System.out.println("√√√√登录成功√√√√");
                            break;
                        }else{
                            System.out.println("××××密码错误××××");
                            System.out.println("您还剩"+(2-y)+"机会");
                        }
                    }
                }

                case PASSWD_MODIFY -> {
                    System.out.print("忘记密码\n");
                    judge_passwd_modify(list);
                }

                case QUITE -> {
                    System.out.print("退出成功\n");
                    System.exit(0);
                }

                default -> {
                    System.out.print("输入错误,请按要求输入,按q退出\n");
                }

            }
        }




    }

    // 键盘录入
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }

    // 注册功能:
    public static void SignUp(ArrayList<User> list){
        System.out.println("----Sign up----");
        User user = new User();
        // 用户名:
        System.out.println("请输入你的用户名");
        String name = getString();
        if(judge_name(list,name) == -2){
            user.setName(name);
            System.out.println("用户名录入成功");
        }else{
            System.out.println("用户名有误,检查重试");
        }

        // 密码:
        System.out.println("请输入你的密码");
        String passwd = getString();
        System.out.println("请再次输入你的密码");
        if(getString().equals(passwd)){
            user.setPasswd(passwd);
            System.out.println("密码录入成功");
        }else{
            System.out.println("两次密码输入不同,请检查重试");
            return;
        }

        // 身份证:
        System.out.println("请输入你的身份证");
        String sfz = getString();
        if(judge_sfz(sfz)){
            user.setSfz(sfz);
            System.out.println("身份证录入成功");
        }else{
            System.out.println("身份证输入有误,检查重试");
        }

        // 手机号:
        System.out.println("请输入你的手机号");
        String phoneNum = getString();
        if(judge_phoneNum(phoneNum)){
            user.setphoneNum(phoneNum);
            System.out.println("手机号录入成功");
        }else{
            System.out.println("手机号输入有误,请检查重试");
        }


        // 将user对象添加到ArrayList中：
        list.add(user);


    }


    // 判断用户名的方法:
    public static int judge_name(ArrayList<User> list,String name){
        // 判断用户名是否重复
        for (int y = 0; y < list.size(); y++) {
            if(list.get(y).getName().equals(name)){
                return y;
            }
        }
        // 判断用户名长度
        if(name.length() < 3 || name.length() > 15){
            return -1;
        }

        // 用户名不能为纯数字
        int count = 0;
        for (int y = 0; y < name.length(); y++) {
            char c = name.charAt(y);
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        if(count == name.length()){
            return -1;
        }


        // 用户名只能为字母数字组合
        for (int y = 0; y < name.length(); y++) {
            char c = name.charAt(y);
            if(!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))){
                return -1;
            }
        }


        return -2;



    }


    // 判断身份证的方法:
    public static boolean judge_sfz(String sfz){
        // 18位长度
        if(sfz.length() != 18){
            return false;
        }

        // 不能以0开头
        if(sfz.charAt(0) == '0'){
            return false;
        }

        // 前17位为纯数字
        for (int y = 0; y < sfz.length()-1; y++) {
            char c = sfz.charAt(y);
            if(c < '0' || c > '9'){
                return false;
            }
        }

        // 最后一位可以是数字可以是x可以是X
        char sfz_last = sfz.charAt(sfz.length()-1);
        if (!((sfz_last >= '0' && sfz_last <= '9') || sfz_last == 'x' || sfz_last == 'X')) {
            return false;
        }

        return true;

    }


    // 判断手机号的方法:
    public static boolean judge_phoneNum(String phoneNum){
        // 11位长度
        if(phoneNum.length() != 11){
            return false;
        }

        // 不能以0开头
        if(phoneNum.charAt(0) == '0'){
            return false;
        }

        // 纯数字
        for (int y = 0; y < phoneNum.length(); y++) {
            char c = phoneNum.charAt(y);
            if(c < '0' || c > '9'){
                return false;
            }
        }

        return true;

    }




    // 登陆功能:
    public static boolean SignIn(ArrayList<User> list){
        System.out.println("----Sign in----");
        // 如果用户名不存在直接结束方法
        System.out.println("请输入你的用户名");
        String name = getString();
        int judge_num = judge_name(list,name);
        if(judge_num < 0){
            System.out.println("用户未注册或输入有误\n请检查重试");
            return false;
        }

        // 输入密码:
        System.out.println("请输入密码");
        String passwd = getString();


        // 验证码:
        while(true){
            String captcha_system = captcha();
            System.out.println("----人机验证----\n验证码为"+captcha_system+"\n请证明你是人类");
            String captcha_user = getString();
            if (captcha_system.equals(captcha_user)){
                System.out.println("人机验证成功");
                break;
            }else {
                System.out.println("请重新输入");
            }
        }

        // 验证用户名和密码:
        System.out.println("----正在检验用户名和密码是否匹配----\n----loading----");
        if (judge_name_passwd(list,name,passwd)) {
            return true;
        }else {
            return false;
        }




    }




    // 随机获取验证码
    public static String captcha(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        // 随机获取四位数字
        for (int y = 0; y < 4; y++) {
            char num = (char)(r.nextInt(10) + '0');
            sb.append(num);
        }

        // 随机获取一位字母
        char letter;
        int suiji = r.nextInt(2);
        if(suiji == 0){
            letter = (char)(r.nextInt(26)+'A');
        }else{
            letter = (char)(r.nextInt(26)+'a');
        }


        // 打乱顺序
        char[] arr = sb.append(letter).toString().toCharArray();
        sb.setLength(0);    // 先清空字符

        for (int y = arr.length-1; y > 0; y--) {
            int index = r.nextInt(y+1);
            char temp = arr[y];
            arr[y] = arr[index];
            arr[index] = temp;
        }
        return sb.append(arr).toString();




    }

    // 验证用户名和密码是匹配:
    public static boolean judge_name_passwd(ArrayList<User> list,String name,String passwd){

        User user = list.get(judge_name(list,name));
        return user.getPasswd().equals(passwd);

    }


    // 忘记密码:
    public static void judge_passwd_modify(ArrayList<User> list){
        // 如果用户名不存在直接结束方法
        System.out.println("请输入你的用户名");
        String name = getString();
        int judge_num = judge_name(list,name);
        if(judge_num < 0){
            System.out.println("用户未注册或输入有误\n请检查重试");
            return;
        }
        User user = list.get(judge_num);
        System.out.println("请输入你的身份证号码");
        String sfz = getString();
        System.out.println("请输入你的手机号");
        String phoneNum = getString();

        if (user.getphoneNum().equals(phoneNum) && user.getSfz().equals(sfz)){
            System.out.println("请输入你的新密码");
            String newpasswd = getString();
            user.setPasswd(newpasswd);
            System.out.println("修改成功");
            return;
        }else{
            System.out.print("验证失败,请核对身份证和手机号信息");
            return;
        }



    }





}
