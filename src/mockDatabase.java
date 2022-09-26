public class mockDatabase implements Idb{

    private String userName = "ade";
    private String passcode="Ade@1250";
    private String cred= "YWRlQWRlQDEyNTA=";
    private int Age= 25;
    private int economy= 10;
    private int citizen_happiness =12;
    private int education= 15;
    private int infrastructure = 13 ;
    private int voter_awareness = 8;
    private int intertribal= 11;
    private int voterApathy = 16;
    private int rebellion = 10;
    private String userReg= "ade";
    private String passReg= "Ade@1250";
    private int ageReg= 25;





    @Override
    public void loadUser(int id, Iuser use) {
            use.setAge(Age);
            use.setPasscode(passcode);
            use.setuserName(userName);

    }

    @Override
    public void loadNationStats(int id, InationStats nS) {
        nS.setCitizen_happiness(citizen_happiness);
        nS.setEconomy(economy);
        nS.setEducation(education);
        nS.setInfrastructure(infrastructure);
        nS.setIntertribal(intertribal);
        nS.setVoter_awareness(voter_awareness);
        nS.setVoterApathy(voterApathy);
        nS.setRebellion(rebellion);
    }

    @Override
    public void loadCred(int id, Ilogin ilogin) {
        ilogin.setCred(cred);
    }

    @Override
    public void createUser(int id, Iregistration ireg) {
        ireg.setAgeReg(ageReg);
        ireg.setUserReg(userReg);
        ireg.setPassReg(passReg);
    }


}
