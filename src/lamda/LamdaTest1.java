package lamda;

public class LamdaTest1 {
    public static void main(String[] args) {

        String a = "람다식";
        Test<String> t1 =(t) -> System.out.println(t);
        t1.myPrint(a);

        Integer b = 123;
        Test<Integer> t2 = (t) -> {
            System.out.println(t+" ");
            System.out.println(t + 10 + " ");
            System.out.println(t + 20 + " ");
        };
        t2.myPrint(b);
    }
    //람다식 구현을 위한 인터페이스(제너릭 선언)
    interface Test<T>{
        void myPrint(T t);
    }
}
