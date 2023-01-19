package filterpattern;

public class Person {
    private String name;
    private String gender;
    private String marriedStatus;

    public Person(String name, String gender, String marriedStatus) {
        this.name = name;
        this.gender = gender;
        this.marriedStatus = marriedStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }
}
