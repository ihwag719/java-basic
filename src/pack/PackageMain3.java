package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 같은 이름의 클래스가 있다면 import는 둘 중 하나만 사용 가능
    }
}
