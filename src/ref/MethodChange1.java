package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); //10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); //10
    }
    static void changePrimitive(int x) {
        x = 20;
    }
    // x의 값만 20으로 변경 후 제거되어 a에 영향 x. a = 10 x =20
}
