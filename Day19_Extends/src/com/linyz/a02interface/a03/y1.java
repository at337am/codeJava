package com.linyz.a02interface.a03;

public class y1 {
    public static void main(String[] args) {
        /*测试乒乓球运动员*/
        PingpongAthlete ppa = new PingpongAthlete("liok",12);
        ppa.speakEnglish();
        ppa.start();

        /*测试乒乓球教练*/
        PingpongCoach ppc = new PingpongCoach();
        ppc.setName("oasi");
        ppc.setAge(13);
        System.out.println("name: " + ppc.getName() + ", age: " + ppc.getAge());
        ppc.speakEnglish();
        ppc.teach();

        /*测试篮球运动员*/
        BasketballAthlete ba = new BasketballAthlete("xla",17);
        ba.start();
        System.out.println("name: " + ba.getName() + ", age: " + ba.getAge());
    }
}
