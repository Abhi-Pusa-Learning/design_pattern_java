package filterpattern.criteria;

import filterpattern.Person;
import org.w3c.dom.css.CSSImportRule;

import javax.net.ssl.CertPathTrustManagerParameters;
import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> andCriteriaList;
        andCriteriaList = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(andCriteriaList);
    }
}
