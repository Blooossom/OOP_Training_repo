package someClass;

public class AnonymousClass {
    public static void main(String[] args) {
        Test t = new Test(){
            void print(){
                System.out.println("익명 클래스에서 오버라이딩");
            }
        };//대괄호 뒤에 세미콜론 붙이기
        t.print();
        t.test();
    }
}
class Test{
    int a = 1;
    String b = "abc";
    void print(){
        System.out.println("부모 클래스 print 메서드");//이게 오버라이딩 된 것
    }
    void test(){
        System.out.println("부모 클래스 test 메서드");
    }
}
