public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Victor");
        encap.setAge(40);
        encap.setIdNum("123ABC");
        System.out.println("Name " +encap.getName() + " Age: " + encap.getAge() + " ID_NUM: " +encap.getIdNum());
    }

}
