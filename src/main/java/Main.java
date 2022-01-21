import de.mydomain.model.Product;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {

    public static void main(String[] args) {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        // Get the session named "ksession-rule" that we defined in kmodule.xml.
        // By default the session returned is always stateful.
        KieSession kieSession = kieContainer.newKieSession("ksession-rule");

        Product product = new Product();
        product.setType("gold");

        kieSession.insert(product);
        kieSession.fireAllRules();

        System.out.println("The discount for the product " + product.getType() + " is " + product.getDiscount());
    }
}