package filterpattern.criteria;

import filterpattern.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
