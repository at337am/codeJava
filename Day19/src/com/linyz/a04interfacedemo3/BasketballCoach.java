package com.linyz.a04interfacedemo3;
/*篮球教练*/
public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("教练在教篮球");
    }
}
