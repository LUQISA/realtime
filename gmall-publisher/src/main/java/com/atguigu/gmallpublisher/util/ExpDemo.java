package com.atguigu.gmallpublisher.util;

public class ExpDemo {
    public static void main(String[] args) {
//        String s="a";
//        boolean r =s.matches("[abc]");
//        System.out.print(r);
    //判断电话号码是否正确
        String tel ="18603071634";
        boolean r = tel.matches("1[3-9]\\d{9}");
        System.out.print(r);


    }




}
/*
       [abc]  表示是a或者b或者c
       [a-z]  匹配一个任意小写字母
       [a-de-h]     匹配a-d e -h 任意小写一个字母
       [a-zA-Z0-9_]   匹配数字字母下划线
       [^abc]   非a 非b 非c


       \w  w : word 单词字符 ==[ a-zA-z0-9_]
       \W    非单词字符
       \d    d :digital 数字[0-9]
       \D    非数字
       \s    s: sapce  空白字符串  空格 \r \n \t
       \S    非空白字符

       .     任意字符 不包含 \n \r
       \.    表示一个点


        针对量词:
        贪婪模式:
        懒惰模式:

        ^a  不在方括号内 :表示a开头
        b$  b结尾

       ----
       提高:
       数量词
       a{n} 正好n个a
       a{n,} 至少n个
       a{n,m}  正好 n-m 个

       a+  至少一个等价于a{1,}
       a*  至少0个
       a?  0个或者1个





   正则表达式
   什么是正则?
            是一个工具,用来处理文本的强大工具!
            作用
            1.用来判断字符是否满足要求
            2.用来从一大段文本获取想要的那些字符串(爬虫)
            正则 一段有意义的字符串

            java 中如何使用
            1.最基本的使用
                pattern
                matcher
            2. java 的字符串类型,提供了四个方法 直接支持正则
            一般这四个都可以满足了
            matches


 */
