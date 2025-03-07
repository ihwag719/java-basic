package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); //10
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); //20
    }
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
    //참조값이 복사되어 전달되기 때문에 값이 변경됨
}
