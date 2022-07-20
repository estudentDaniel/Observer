package Netflix;

public interface Observer <Objects> {
    public void update(String atualiza);
    public void subscription(Objects talk);
    public boolean getNotify(); 
    public void delete();
}

