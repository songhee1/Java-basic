package testCode.generic;

public class GenericSample {

    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
        System.out.println("===");
        sample.checkGenericDTO();
    }
    public void checkCastingDTO(){
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());

        // 형변환 필요
        String temp1 = (String) dto1.getObject();
        StringBuffer temp2 = (StringBuffer) dto2.getObject();
        StringBuilder temp3 = (StringBuilder) dto3.getObject();
    }
    public void checkDTO(CastingDTO dto){ // 타입 점검의 불편함
        Object tempObject = dto.getObject();
        if(tempObject instanceof StringBuffer){
            System.out.println("stringbuffer");
        }else if(tempObject instanceof StringBuilder){
            System.out.println("stringbuilder");
        }else{
            System.out.println("string");
        }
    }
    public void checkGenericDTO(){ // 제네릭으로 잘못된 형변환 방지
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());

        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());

        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());

        String temp1 = dto1.getObject();
        StringBuffer temp2 = dto2.getObject();
        StringBuilder temp3 = dto3.getObject();

    }
}
