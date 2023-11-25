package com.linyz.a02interface.a03;
/*乒乓球运动员*/
public class PingpongAthlete extends Athlete implements SpeakEnglish{
    public PingpongAthlete() {
    }

    public PingpongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void start(){
        System.out.println("乒乓球运动员在学习打乒乓球");
    }

    @Override
    public void speakEnglish(){
        System.out.println("乒乓球运动员在说英语");
    }
}
