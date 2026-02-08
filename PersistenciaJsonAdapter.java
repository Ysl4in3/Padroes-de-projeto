import java.util.ArrayList;

public class PersistenciaJsonAdapter implements Persistencia {

    private PersistenciaJson json = new PersistenciaJson();

    @Override
    public ArrayList<Usuario> carregarUsuarios() {
        return json.lerUsuariosJson();
    }

    @Override
    public ArrayList<Trilha> carregarTrilhas() {
        return json.lerTrilhasJson();
    }
}