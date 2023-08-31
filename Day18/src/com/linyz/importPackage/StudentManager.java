package com.linyz.importPackage;

//导包 , 定义常量
import java.util.ArrayList;
import java.util.Scanner;

import com.linyz.a01importPackage.Student;

public class StudentManager {

    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String SELECT_STUDENT = "4";
    private static final String QUITE = "5";


    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("-----------欢迎来到学生管理系统------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入你的选择:");
            String choose = sc.next();

            switch(choose) {
                case ADD_STUDENT -> addStu(list);
                case DELETE_STUDENT -> delStu(list);
                case UPDATE_STUDENT -> updStu(list);
                case SELECT_STUDENT -> selStu(list);
                case QUITE -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> {
                    System.out.println("输入错误,请重新输入");
                }
            }


        }

    }




// 添加学生:

    public static void addStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("请输入学生的id");
        while(true){
            String id = sc.next();
            if(panduan(list,id)){
                System.out.println("请重新输入");
            }else{
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的address");
        String address = sc.next();
        stu.setAddress(address);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生的名字");
        String name = sc.next();
        stu.setName(name);

        list.add(stu);

        System.out.println("添加成功");

    }




// 删除学生:

    public static void delStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        while(true){
            String id = sc.next();
            int index = find(list,id);
            if(index == -1){
                System.out.println("id不存在,请重新输入");
            }else{
                list.remove(index);
                break;
            }
        }

        System.out.println("删除成功");

    }


// 修改学生:

	/*
	输入学生id,如果存在,继续录入其它信息进行修改,
	如果不存在,返回到主菜单
	*/

    public static void updStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int index = find(list,id);

        if(index == -1){
            System.out.println("id不存在,请重新输入");
            return;
        }


        Student stu_1 = list.get(index);

        System.out.println("请输入要修改的学生姓名");
        stu_1.setName(sc.next());

        System.out.println("请输入要修改的学生年龄");
        stu_1.setAge(sc.nextInt());

        System.out.println("请输入要修改的学生address");
        stu_1.setAddress(sc.next());

        System.out.println("修改成功");



    }




    // 查询学生:
    public static void selStu(ArrayList<Student> list){

        if(list.size() == 0){
            System.out.println("集合中没有学生对象,请添加后查询");
            return;
        }


        System.out.println("id\t姓名\t年龄\t地址");
        for(int y = 0; y < list.size(); y++){
            Student stu = list.get(y);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }

    }







    // 检查id是否重复
    public static boolean panduan(ArrayList<Student> list,String id){

        return find(list,id) >= 0;

		/*for(int y = 0; y < list.size(); y++){
			if(list.get(y).getId().equals(id)){
				return true;
			}


		}

		return false;
*/



    }

// 通过id查询索引

    public static int find(ArrayList<Student> list,String id){
        for (int y = 0; y<  list.size(); y++) {
            if(list.get(y).getId().equals(id)){
                return y;
            }
        }

        // 当循环结束后,未找到索引,返回-1
        return -1;
    }

}
