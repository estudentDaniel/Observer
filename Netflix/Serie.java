package Netflix;

public class Serie implements Observer<Systema>{
    private boolean notify = true;
    
    private Systema talks;
    private String name;
    private String descricao;


    public Serie(String name, String descricao) {
        this.name = name;
        this.descricao = descricao;
    }
    public Systema Display() {
        return talks;
    }
    @Override
    public void update(String descricao) {
        System.out.println(this.name + " nova serie! \n" + descricao);//quando uma nova serie sai  deve aparecer essa msg
    }
    
    @Override
    public void subscription(Systema talks){
        this.talks = talks;
    }
    
    @Override
    public void delete() {
        this.talks = null;
    }
    
    @Override
    public boolean getNotify(){
        return this.notify;
    }
    public void setNotify() {
        this.notify = !this.notify;
    }
    public String history(String name){
        return this.name + "---"+ this.descricao;
    }
}