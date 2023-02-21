public class Chef{
    private Personal pers01;
    private Personal pers02;

    public Chef(Personal pers01, Personal pers02){
        this.pers01 = null;
        this.pers02 = null;

    }

    public void neuesPersonal(Personal einP){
        if (this.pers01 == null){
            this.pers01 = einP;
        }

        this.pers02 = einP;
    }
}