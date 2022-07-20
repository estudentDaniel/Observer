package Netflix;
import java.util.ArrayList;
public class Systema implements Observable<Observer>{

    private String name;
    private ArrayList<String> talk = new ArrayList();
    private ArrayList<Observer> users = new ArrayList();

    public Systema() {
        this.name = "<--Netflix-->";
    }
    
    public String getName() {
        return name;
    }
//Criar
    @Override
    public void subscribe(Observer user) {
        users.add(user);
        user.subscription(this);
    }
//Cancelar
    @Override
    public void unsubscribe(Observer user) {
        users.remove(user);
        user.delete();
    }
//atualiza    
    @Override
    public void update(String atualiza) {
        this.talk.add(atualiza);
        this.notification();
    }
//notify
    @Override
    public void notification() {
        int index = this.talk.size() - 1;
        users.forEach( user -> {
            if(user.getNotify()) 
                user.update(this.talk.get(index));
        });
    }
    
    
    
    
}