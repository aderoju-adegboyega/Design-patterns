public interface Idb {
    public void loadUser(int id, Iuser user);
    public void loadNationStats(int id, InationStats nS);
    public void loadCred(int id, Ilogin ilogin);
    public void createUser(int id, Iregistration ireg);
}
