package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    /*
    정적 메서드 - static만 사용 가능.
    정적 변수와 정적 메서드에는 접근할 수 있지만, static이 없는 인스턴스 변수나 인스턴스 메서드에 접근하면 컴파일 오류 발생
    */
    public static void staticCall() {
        // instanceValue++; //인스턴스 변수 접근, compile error
        // instanceMethod(); //인스턴스 메서드 접근, compile error
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    // 인스턴스 메서드 - 모든 곳에서 공용인 static 호출 가능
    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}