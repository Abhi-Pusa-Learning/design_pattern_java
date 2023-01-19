package filterpattern.criteria;

import filterpattern.Person;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<>();
        for(Person person : personList){
            if(person.getMarriedStatus().equalsIgnoreCase("single")){
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
