package Netflix;

public interface Observable <Objects> {

    public void subscribe(Objects object); //criar
    public void unsubscribe(Objects object); //remover
    public void notification(); //notifica
    public void update(String atualiza); //atualizar
}
