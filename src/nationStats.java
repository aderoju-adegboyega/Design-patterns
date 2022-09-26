public class nationStats implements InationStats {
    private  int economy, citizen_happiness, education, infrastructure, voter_awareness, intertribal, voterApathy;
    private  int rebellion;

    public nationStats(){
        economy = 0;
        citizen_happiness= 0;
        education = 0;
        infrastructure =0;
        voter_awareness = 0;
        intertribal = 0;
        voterApathy=0;
        rebellion= 0;
    }
    public nationStats(int id, Idb db){
        
        db.loadNationStats(1, this);
        
    }


    @Override
    public void setEconomy(int econ) {
        economy =econ;
    }

    @Override
    public void setCitizen_happiness(int citizen_hap) {
            citizen_happiness = citizen_hap;
    }

    @Override
    public void setEducation(int edu) {
            education =edu;
    }

    @Override
    public void setInfrastructure(int Infra) {
            infrastructure = Infra;
    }

    @Override
    public void setVoter_awareness(int votA) {
                voter_awareness = votA;
    }

    @Override
    public void setIntertribal(int intTri) {
        intertribal= intTri;
    }

    @Override
    public void setVoterApathy(int votAp) {
        voterApathy=votAp;
    }

    @Override
    public void setRebellion(int reb) {
        rebellion = reb;
    }

    public  int getCitizen_happiness() {
        return citizen_happiness;
    }

    public  int getEconomy() {
        return economy;
    }

    public  int getEducation() {
        return education;
    }

    public  int getInfrastructure() {
        return infrastructure;
    }

    public  int getIntertribal() {
        return intertribal;
    }

    public  int getVoter_awareness() {
        return voter_awareness;
    }

    public  int getVoterApathy() {
        return voterApathy;
    }

    public int getRebellion() {
        return rebellion;
    }
}




