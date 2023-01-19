package filterpattern;

import filterpattern.criteria.*;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public void execute(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new MaleCriteria();
        Criteria female = new FemaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(personList));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(personList));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(personList));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(personList));
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMarriedStatus() + " ]");
        }
    }
}
