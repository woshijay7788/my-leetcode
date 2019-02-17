package serializablecopy;

import java.io.Serializable;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:00 AM 2019/1/9
 * @Version :
 */
public class Son implements Serializable{

    private static final long serialVersionUID = -2803561263307877353L;
    private String name;
    private Integer age;

    public Son(String name, Integer age) {
        this.name = name;
        this.age = age;
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


    @Override
    public String toString() {
        return "Son{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
