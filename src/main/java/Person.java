import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Person{

    private int id;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private Date birth;
    static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");;
    public Person(String[] data) throws ParseException {
        id = Integer.parseInt(data[0]);
        name = data[1];
        gender = data[2];
        birth = formatter.parse(data[3]);
        department = new Department(data[4]);
        salary = Integer.parseInt(data[5]);
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department.name +
                ", departmentid=" + department.id +
                ", salary=" + salary +
                ", birth=" + birth +
                '}';
    }
}