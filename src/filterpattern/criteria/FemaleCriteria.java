package filterpattern.criteria;

import filterpattern.Person;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersonList = new ArrayList<>();
        for(Person person : personList){
            if(person.getGender().equalsIgnoreCase("female")){
                femalePersonList.add(person);
            }
        }
        return femalePersonList;
    }
}
