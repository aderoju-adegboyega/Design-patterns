import java.util.Base64;

public class User implements Iuser{
    private String username;
    private String passcode;
    private int uAge;

    public User(){
        username = null;
        passcode = null;
        uAge= 0;
    }
//constructor loads our user class variables from mock db, the use of interface prevents the user class from coupling.
public User(int id, Idb db){

        db.loadUser(id, this);

}



    @Override
    public void setuserName(String name) {
        username=name;
    }

    @Override
    public void setAge(int age) {
        uAge = age;
    }

    @Override
    public void setPasscode(String pass) {
        passcode=pass;
    }


    public String getUsername(){
        return username;
    }

    public String getPasscode(){
        return passcode;
    }

    public int getuAge() {
        return uAge;
    }

    public boolean credCheck(){
        if(username == null | passcode == null){
            return false;
        }
        else
            return true;
    }
    public  String credEncode(){
        String cred = username+passcode;
        String encodedCred = Base64.getEncoder().encodeToString(cred.getBytes());

        return encodedCred;
    }

public void clearUser(){
    username = null;
    passcode = null;
    uAge= 0;
}


}

