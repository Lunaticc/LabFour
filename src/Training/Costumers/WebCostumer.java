package Training.Costumers;

import Training.Enums.WebState;

public class WebCostumer extends Costumer{
    private String uniqueUserName;
    private WebState state;
    public WebCostumer(String name, int age, String email, String number, String uniqueUserName) {
        super(name, age, email, number);
        this.uniqueUserName = uniqueUserName;
        this.state = WebState.New;
    }




    /////GETTERS AND SETTERS/////
    public String getUniqueUserName() {
        return uniqueUserName;
    }

    public void setUniqueUserName(String uniqueUserName) {
        this.uniqueUserName = uniqueUserName;
    }

    public WebState getState() {
        return state;
    }

    public void setState(WebState state) {
        this.state = state;
    }
}
