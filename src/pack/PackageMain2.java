package pack;

import pack.a.User;
import pack.a.*; // 패키지 내 모든 클래스 사용 가능

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지 명 생략
    }
}
