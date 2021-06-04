package SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component("c1")
@Scope("prototype")
public class Citizen {
//    @Value("Mubin UIC}")
    @Value("#{100<10 ? 'Mubin UIC':'Samindra'}")
    private String name;
    @Value("MD1010675")
    private String nid;
    @Value("#{fam}")
    private Map<String,String> family;
    //constructor not necessary here i guess.
    public Citizen() {
    }

    public Citizen(String name, String nid, Map<String, String> family) {
        this.name = name;
        this.nid = nid;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public Map<String, String> getFamily() {
        return family;
    }

    public void setFamily(Map<String, String> family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", nid='" + nid + '\'' +
                ", family=" + family +
                '}';
    }
}
