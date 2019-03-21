package HomeWorkZWH;

public class Work03 {
    public static void main(String[] args) {
        short s = 30;
        int i = 50;
        s += i;
        System.out.println("s="+s); //  s = 80
        int x = 0;
        int y = 0;
        int z = 0;
        boolean b;

        b = x>0 && z++>1;
        x++;
        System.out.println("b="+b);// b = false
        System.out.println("x="+x);// x = 1
        System.out.println("z="+z);// z = 0

        b = x>0 || z++>1;
        System.out.println("b="+b);// b = true
        System.out.println("z="+z);// z = 0
    }
}

