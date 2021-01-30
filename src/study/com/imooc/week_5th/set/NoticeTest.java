package com.imooc.week_5th.set;

import java.util.ArrayList;
import java.util.Date;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/18
 * @description:
 * 第5周 第4节  2-8,2-9
 */
public class NoticeTest {
    public static void main(String[] args) {

        Notice notice1 = new Notice(1,"欢迎来到慕课网学习","管理员",new Date());
        Notice notice2 = new Notice(1,"请同学们接时提交作业","老师",new Date());
        Notice notice3 = new Notice(1,"考勤通知","老师",new Date());

        //添加公告
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

         //显示公告
        System.out.println("公告内容是: ");
        for(int i=0; i<noticeList.size();i++){
            System.out.println(i+1 +":" +((Notice)noticeList.get(i)).getTitle());
        }

        //在第一条公告后面添加一条新公告
        Notice notice4 = new Notice(4,"在线编辑器可以使用了","管理员",new Date());
        noticeList.add(1,notice4);  //添加公告
        System.out.println("\n添加后公告内容是: ");
        for(int i=0; i<noticeList.size();i++){
            System.out.println(i+1 +":" +((Notice)noticeList.get(i)).getTitle());
        }




        //删除按时完成作业的公告
        noticeList.remove(2);

        System.out.println("\n删除后公告内容是: ");
        for(int i=0; i<noticeList.size();i++){
            System.out.println(i+1 +":" +((Notice)noticeList.get(i)).getTitle());
        }

        //修改第二条公告中的title值
        notice4.setTitle("Java在线编辑器可以使用啦"); //调用对象的setTile方法,给公告赋值.
        noticeList.set(1,notice4);  //在ArrayList中修改notice4
        System.out.println("\n修改第二条公告中的title值: ");
        for(int i=0; i<noticeList.size();i++){
            System.out.println(i+1 +":" +((Notice)noticeList.get(i)).getTitle());
        }
    }
}
