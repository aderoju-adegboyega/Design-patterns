public class login implements Ilogin{

    private String cred;

    public login(){

        cred = null;

    }
    public login(int id, Idb db){
        db.loadCred(id, this);
    }


    @Override
    public void setCred(String userC) {
        cred= userC;
    }

    public boolean signin(String s){
        if (cred == s) {
            return true;
        }
        else
            return false;

    }
}
