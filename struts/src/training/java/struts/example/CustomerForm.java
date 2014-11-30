package struts.example;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

public class CustomerForm extends ActionForm {

    private String firstName;
    private String lastName;
    private String step;

    public CustomerForm() {
        firstName = "";
        lastName = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (firstName == null || firstName.trim().equals("")) {
            errors.add("firstName", new ActionError("error.cust.firstname.empty"));
        }
        if (lastName == null || lastName.trim().equals("")) {
            errors.add("lastName", new ActionError("error.cust.lastname.empty"));
        }
        return errors;
    }
}