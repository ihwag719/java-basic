package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count); //0
        System.out.println("bigData.data= " + bigData.data); //null

        //NullPointerException
        System.out.println("bigData.data.value= " + bigData.data.value);
        //null.value로 주소가 존재하지 않으므로 참조할 객체 인스턴스가 존재하지 않음
    }
}
