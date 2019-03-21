package HomeWorkZWH;

/*
分析以下需求，并用代码实现：
	1.定义一个变量代表小明分数
	2.根据如下条件判断该学员的学生成绩属于那一级别,并在控制台上打印出来
		[0,60) D级
		[60,80) C级
		[80,90) B级
		[90,100] A级

	例: 变量定义为77
	控制台输出: "小明的分数为77分.属于C级"
 */
//定义一个类 类名 Work06
public class Work06 {
    //定义一个主方法 main方法 是程序运行的入口
    public static void main(String[] args) {
        //定义一个变量代表小明分数
        int i = 78;
        //求小明的分数的等级
        if (i >= 0 && i < 60){
            System.out.println("小明的分数为"+ i +"分.属于D级");
        }else if (i >= 60 && i < 80){
            System.out.println("小明的分数为"+ i +"分.属于C级");
        }else if (i >= 80 && i < 90){
            System.out.println("小明的分数为"+ i +"分.属于B级");
        }else if (i >= 90 && i <= 100){
            System.out.println("小明的分数为"+ i +"分.属于A级");
        }else{
            System.out.println("您输入的成绩错误");
        }

    }
}
