
public class User{
    public String name;
    public String id;
    public String email;
    public String password;
    public String username;
    public String subscriptionType;  //der er flere forskellige, såsom premium, basic, standard osv.
    public String subscriptionDate;
    public String subscriptionTime;


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getusername() {

        return username;
    }

    public String getSubscriptionType() {

        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {

        this.subscriptionType = subscriptionType;
    }

    public String getSubscriptionDate() {

        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {

        this.subscriptionDate = subscriptionDate;
    }

    public String getSubscriptionTime() {

        return subscriptionTime;
    }


    public void setSubscriptionTime(String subscriptionTime) {

        this.subscriptionTime = subscriptionTime; //
    }


    public void setFullName(String username) {
        this.username = username;


    }

    public User(String name, String id, String email, String password, String fullName, String subscriptionType, String subscriptionDate, String subscriptionTime) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.subscriptionType = subscriptionType;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionTime = subscriptionTime;


    }
}
