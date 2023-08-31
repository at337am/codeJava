package com.linyz.a04Object;

import java.util.StringJoiner;

/*如果一个接口没有任何抽象方法
* 代表这个接口是一个标记性接口
* 如果Cloneable接口一旦被实现,就代表当前类的对象可以被克隆
* 如果没有实现这个接口,就不能被克隆*/

public class User implements Cloneable{
    private int id;
    private String username;
    private String passwd;
    private int[] data;


    public User() {
    }

    public User(int id, String username, String passwd, int[] data) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", passwd = " + passwd + ", data = " + data + "}";
    }

    public String datatoString(){
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    // 重写clone方法, 深克隆
    @Override
    public Object clone() throws CloneNotSupportedException {
        // 拷贝一份新的数组
        int[] new_data = new int[data.length];
        System.arraycopy(data, 0, new_data, 0, data.length);
        // 调用Object中的clone方法克隆一个新的对象
        User u = (User) super.clone();
        // 因为Object中的clone()是浅克隆,引用数据类型的地址值和原来一样
        // 所以将新对象中data的地址值替换为new_data的地址值
        u.data = new_data;
        return u;
    }
}
