package HomeWorkZWH;
/*
根据如下需求,完成代码:
	1.定义一个变量a, 初始化值为9, 判断a的值是否大于10,  输出true或false
	2.定义一个变量b, 初始化值为11, 判断a和b的值是否相等, 输出true或false
	3.定义一个变量c, 初始化值为22, 判断c的值是否小于等于a和b的值之和,输出true或false
 */
//定义一个类 类名 Work01
public class Work01 {
    //定义一个主方法 main方法 是程序运行的入口
    public static void main(String[] args) {
        //定义三个变量 a,b,c
        int a = 9;
        int b = 11;
        int c = 22;
        if (a > 10){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if (a == b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if (c <= a + b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
