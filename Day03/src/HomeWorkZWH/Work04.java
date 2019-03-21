package HomeWorkZWH;

/*
1.定义一个整数代表一个学生成绩(int类型),成绩自己给出
	2.判断该学生成绩是否及格
	3.规则如下：
		成绩>=60:输出 true
		成绩<60: 输出 false
	4.分别用 if语句 和 三元运算符 实现
 */
//定义一个类 类名 Work04
public class Work04 {
    //定义一个主方法 main方法 是程序运行的入口
    public static void main(String[] args) {
        int i = 88;
        boolean b = i >= 60 ? true : false;
        System.out.println(b);
        System.out.println("----------------");
        if (i >=60){
            System.out.println(true);
        }
    }
}
