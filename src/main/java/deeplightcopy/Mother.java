package deeplightcopy;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:00 AM 2019/1/9
 * @Version :
 */

public class Mother implements Cloneable{

    private String name;
    private Integer age;
    private Son son;

    public Mother(String name, Integer age, Son son) {
        this.name = name;
        this.age = age;
        this.son = son;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mother mother = (Mother)super.clone();
        //deepCopy
        mother.son = (Son)this.son.clone();
        return mother;
    }

    @Override
    public String toString() {
        return "Mother{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", son=" + son +
            '}';
    }
}
