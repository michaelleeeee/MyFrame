package com.example.lctusb;

/**
 * Created by wuhai on 2017/04/18 11:51.
 * 描述：
 */

public class Lct_pinyin_test {

    public static void main(String[] args){
//        String str1 = PinyinUtils.getPingYin("新年好！Hello，新年大家都过得开心吧？哈哈，我是做Android开发哒，what's this？");
//        String str2 = PinyinUtils.getPingYin("张三");
//        String str3 = PinyinUtils.getPingYin("李四");
//        String str4 = PinyinUtils.getPingYin("王五");
//        String str5 = PinyinUtils.getPingYin("王五");
//        String str6 = PinyinUtils.getPingYin("臧天朔");
//        String str7 = PinyinUtils.converterToFirstSpell("臧天朔");


//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//        System.out.println(str5);
//        System.out.println(str6);
//        System.out.println(str7);

//        String str8 = PinyinUtils.converterToFirstSpell("奥妙净蓝全效洗衣粉1.38kg优惠装(2012）");
//        System.out.println(str8);

//        String str9 = PinyinUtils.converterToFirstSpell("（");
//        String str9 = PinyinUtils.converterToFirstSpell("）");
//        String str9 = PinyinUtils.converterToFirstSpell("％");
//        String str9 = PinyinUtils.converterToFirstSpell("　");
//        System.out.println(str9);

        System.out.println((char) (65509-65248));

//        String str8 = PinyinUtils.converterToFirstSpell("×");
//        String str8 = PinyinUtils.converterToFirstSpell("－");
//        String str8 = PinyinUtils.converterToFirstSpell("/");
//        String str8 = PinyinUtils.converterToFirstSpell("＋");
//        String str8 = PinyinUtils.converterToFirstSpell("×－/＋");
//        String str8 = PinyinUtils.converterToFirstSpell("乐村淘非转基因大豆油");
        String str8 = PinyinUtils.converterToFirstSpell("“人小鬼大”骷髅脆皮软糖珠");
//        String str8 = PinyinUtils.converterToFirstSpell("￥");//65509
//        String str8 = PinyinUtils.converterToFirstSpell("！");//

        System.out.println("str8:" + str8);
    }
}
