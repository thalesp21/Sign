public class Main {
    public static void main(String args[]) {
        String str;
        int x;
        Sign sign1 = new Sign("ABC222DE", 3);
        x = sign1.numberOfLines();                  //3
        System.out.println(x);
        str = sign1.getLines();                     //"ABC;222;DE"
        System.out.println(str);
        str = sign1.getLines();                     //"ABC;222;DE"
        System.out.println(str);
        Sign sign2 = new Sign("ABCD", 10);
        x = sign2.numberOfLines();                  //1
        System.out.println(x);
        str = sign2.getLines();                     //"ABCD"
        System.out.println(str);
        Sign sign3 = new Sign("ABCDEF", 6);
        x = sign3.numberOfLines();                  //1
        System.out.println(x);
        str = sign3.getLines();                     //"ABCDEF"
        System.out.println(str);
        Sign sign4 = new Sign("", 4);
        x = sign4.numberOfLines();                  //0
        System.out.println(x);
        str = sign4.getLines();                     //null
        System.out.println(str);
        Sign sign5 = new Sign("AB_CD_EF", 2);
        x = sign5.numberOfLines();                  //4
        System.out.println(x);
        str = sign5.getLines();                     //"AB;_C;D_;EF"
        System.out.println(str);
    }
}