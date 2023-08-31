package com.linyz.a04interfacedemo3;
/*乒乓球教练*/
public class PingpongCoach extends Coach implements SpeakEnglish{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("教练在教乒乓球");
    }

    @Override
    public void speakEnglish(){
        System.out.println("乒乓球教练在说英语");
    }
}
