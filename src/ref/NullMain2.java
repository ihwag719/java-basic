package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //참조값이 없는 객체를 찾아감. NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
