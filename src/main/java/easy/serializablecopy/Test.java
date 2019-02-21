package easy.serializablecopy;


/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:02 AM 2019/1/9
 * @Version :
 */
public class Test {

    public static void main(String[] args) throws Exception{
        Son son = new Son("儿子1", 5);
        Mother mother = new Mother("妈妈1", 1000000000, son);

        Mother motherClone1 = (Mother) mother.clone();
        motherClone1.setName("妈妈桑");
        motherClone1.setAge(1000000001);
        Son sonClone1 = motherClone1.getSon();
        sonClone1.setName("儿子娃娃");
        sonClone1.setAge(100);
        System.out.println(mother.toString());
        System.out.println(motherClone1.toString());

    }
}
