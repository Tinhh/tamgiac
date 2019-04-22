package ss1;

import java.util.Scanner;

public class Main {
    public int a;
    public int b;
    public int c;
    public int chuvi;
    public int dientich;
    public Main(){

    }
    public Main(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args){
        Main m = new Main();
        m.khaibao();
        m.chuvi();
        m.dientich();
    }

    public void khaibao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai 3 canh tam giac");
        a =scanner.nextInt();
        b =scanner.nextInt();
        c =scanner.nextInt();
        kiemtra();

    }

    public void kiemtra(){
        if(a + b >= c && a + c >= b && b + c >= a && a > 0 && b > 0 && c > 0 ){
            System.out.println("a,b,c la 3 canh cua 1 tam giac");
        }
        else {
            System.out.println("a,b,c khong phai la do dai 3 canh cua tam giac");
            khaibao();
        }
    }

    public int chuvi(){
        chuvi = (a + b + c);
        System.out.println("Chu vi tam giac la: " + chuvi);
       return chuvi;
    }

    public int dientich(){
        int x1 = (int) Math.sqrt(chuvi);
        int x2 = (int) Math.sqrt(chuvi - a);
        int x3 = (int) Math.sqrt(chuvi - b);
        int x4 = (int) Math.sqrt(chuvi - c);
        dientich = x1 * x2 * x3 * x4;
        System.out.println("Dien tich tam giac la: " + dientich);
        return dientich;
    }



}
