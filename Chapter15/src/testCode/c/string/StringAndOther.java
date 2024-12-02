package testCode.c.string;

public class StringAndOther {

    public static void main(String[] args) {
        String str = "strA";
        StringBuilder sbd = new StringBuilder();
        StringBuffer sbf = new StringBuffer();

        sbd.append("sbdA");
        sbf.append("sbfA");

        System.out.println("String 객체 주소 : "+str.hashCode());
        System.out.println("StringBuilder 객체 주소 : "+sbd.hashCode());
        System.out.println("StringBuffer 객체 주소 : "+sbf.hashCode());

        System.out.println("======");

        str += "strB";
        sbd.append("sbdB");
        sbf.append("sbfB");
        System.out.println("String 객체 주소 : "+str.hashCode()); // GC 처리대상, 새 주소할당
        System.out.println("StringBuilder 객체 주소 : "+sbd.hashCode()); // 기존주소
        System.out.println("StringBuffer 객체 주소 : "+sbf.hashCode()); // 기존주소

    }
}
