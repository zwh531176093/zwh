package HomeWorkZWH;
/*
1.定义一个int类型的变量
	2.编写代码判断这个变量的值是否为偶数
	3.如果为偶数,就在控制台将这个数打印出来,如果为奇数,就在控制台打印一段话:"这个数是奇数"
 */
//定义一个类 类名 Work02
public class Work02 {
    //定义一个主方法 main方法是程序运行的入口
    public static void main(String[] args) {
        //定义一个int类型的变量
        int i = 7;
        //判断是否为偶数
        if (i % 2 == 0){
            System.out.println(i);
        }else{
            System.out.println("这个数是奇数");
        }
    }
}
