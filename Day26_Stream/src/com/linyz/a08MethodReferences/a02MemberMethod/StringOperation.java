package com.linyz.a08MethodReferences.a02MemberMethod;

public class StringOperation {
    public boolean stringJudge(String str) {
        return str.split("-")[0].startsWith("c") && Integer.parseInt(str.split("-")[1]) >= 10;
    }
}
