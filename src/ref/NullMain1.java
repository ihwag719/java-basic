package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);

        data = null;
        System.out.println("3. data = " + data);
        //GC - 아무도 참조하지 않는 인스턴스는 메모리만 차지하기 때문에 JVM의 GC(가비지 컬렉션)가 자동으로 메모리에서 제거
    }
}
