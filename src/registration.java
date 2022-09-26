public class registration implements Iregistration {

    private String user;
    private String pass;
    private int age;

    public registration(){
        user = "";
        pass ="";
        age = 0;
    }

    public registration(int id, Idb db){
       db.createUser(1, this);
    }
    

    public String getUserReg() {
         return user;
    }

   
    public String getPassReg() { 
        return pass;
    }

  
    public int getAgeReg() { 
        return age;
    }
    public void setAgeReg(int age){
        this.age = age;
        
    }
    public void setUserReg(String user){
        this.user = user;
    }
    
    public void setPassReg(String pass){
        this.pass=pass;
    }

    public boolean checkUser(){
        if (user.length() <= 3){
            return true;
        }
        else
            return false;
    }

    public boolean checkPass(){
        boolean check = false;
        for (int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) <= 9)
            {
                check= true;
            }
            else 
                check = false;
        }
        if (pass.length()>=6 && check){
            return true;
        }
        else
            return false;
    }

    public boolean register() {
        //make a call to the DB registering the user
        System.out.println("Registered");
        return true;
    }
}
