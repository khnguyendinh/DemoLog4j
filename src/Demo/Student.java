package Demo;

import org.apache.log4j.Logger;

public class Student {
    Logger log = Logger.getLogger(Student.class.getName());
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, String address) {
        log.info("init student");
        this.name = name;
        this.address = address;
    }
}
