package filterpattern.criteria;

import filterpattern.Person;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersonList = new ArrayList<>();
        for(Person person: personList){
            if(person.getGender().equalsIgnoreCase("male")){
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
