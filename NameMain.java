public class NameMain{
    public static void main(String[] args) {
        Name n = new Name(" sEAn "," mIchael"," moRRis  ");
        System.out.println(n.lastFirst());
        System.out.println(n.fullName());
        System.out.println(n.nickName());
        System.out.println(n.initials());
    } 
}