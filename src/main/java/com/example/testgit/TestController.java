package com.example.testgit;

/**
 *@Author：刘宗泰
 *@Project：TestGit
 *@Package：com.example.testgit
 *@Filename：TestController
 *@Date：2024/11/3 16:21
 *@要做什么：
 */
public class TestController {
    public static final String WORD_TEST = "wordTest";

    public TestController() {
    }

    public static final String TEST_STRING = "testString";
    public static final String TEST_STRING2 = "testString1";
    public static final String TEST_STRING3 = "testfinal";

    public String testString() {
        return "testString";
    }

    public static void main(String[] args) {
        System.out.println(WORD_TEST);
    }
}
