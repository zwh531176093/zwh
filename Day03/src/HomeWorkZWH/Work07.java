package HomeWorkZWH;

/*
    1.定义两个int类型变量a,b. 求出两个变量的最大值,并打印出来
	2.定义三个int类型变量c,d,e. 求出三个变量的最大值,并打印出来
 */
//定义一个类 类名 Work07
public class Work07 {
    //定义一个主方法 main方法 是程序运行的入口
    public static void main(String[] args) {
        //定义两个变量
        int a = 23;
        int b = 32;
        //用三元表达式求a,b的最大值
        int temp = a > b ? a : b;
        System.out.println("最大值是"+temp);
        System.out.println("------------------");
        //用if语句求a,b的最大值
        if (a > b){
            System.out.println("最大值是"+a);
        }else{
            System.out.println("最大值是"+b);
        }
        //定义三个变量
        int c = 36;
        int d = 48;
        int e = 64;
        //求三个变量的最大值
        //第一种方法
        if (c > d){
            if (c > e){
                System.out.println("最大值是"+c);
            }else{
                System.out.println("最大值是"+e);
            }
        }else{
            if (d > e){
                System.out.println("最大值是"+d);
            }else{
                System.out.println("最大值是"+e);
            }
        }
        //第二种方法
        if (c > d && c >e){
            System.out.println("最大值是"+c);
        }else if (d > c && d > e){
            System.out.println("最大值是"+d);
        }else if (e > c && e > d){
            System.out.println("最大值是"+e);
        }

    }
}
