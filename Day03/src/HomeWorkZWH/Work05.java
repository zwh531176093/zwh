package HomeWorkZWH;

/*
分析以下需求，并用代码实现：
	1.功能描述:定义一个变量代表月份，输出对应的季节
	2.要求:
		(1)定义一个整数(代表月份,范围1-12)
		(2)输出该月份对应的季节
			3,4,5春季
			6,7,8夏季
			9,10,11秋季
			12,1,2冬季
		(3)演示格式如下:
			月份:3
			控制台输出:3月份是春季
			switch语句实现
 */
//定义一个类 类名 Work05
public class Work05 {
    //定义一个主方法 main方法 是程序运行的入口
    public static void main(String[] args) {
        //假设一个变量是月份
        int month = 8;
        //求该月份是什么季节
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println(month+"月份是春季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month+"月份是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month+"月份是春季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month+"月份是春季");
                break;
            default:
                System.out.println("您输入的月份错误");
                break;
        }
    }
}
