package final1.ex;

public class MemebrMain {
    public static void main(String[] args) {
        Member member = new Member("myId","kim");
        member.print();
        member.changeData("myId2", "seo"); // id 바뀌지 않음
        member.print();
    }
}
