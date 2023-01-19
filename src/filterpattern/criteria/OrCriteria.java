package filterpattern.criteria;

import filterpattern.Person;

import java.util.List;

public class OrCriteria implements Criteria{

    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaList;
        List<Person> secondCriteriaList;
        firstCriteriaList = criteria.meetCriteria(personList);
        secondCriteriaList = criteria.meetCriteria(personList);
        for(Person person : secondCriteriaList){
            firstCriteriaList.add(person);
        }
        return firstCriteriaList;
    }
}
