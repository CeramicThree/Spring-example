package Demo;

import org.springframework.stereotype.Component;

@Component
public class Test {
    String name;

    public Test(){
        name = "Test";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
