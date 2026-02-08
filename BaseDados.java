import java.util.ArrayList;

public class BaseDados {

    private static BaseDados instance;

    private ArrayList<Usuario> usuarios;
    private ArrayList<Trilha> trilhas;

    private BaseDados() {
        usuarios = new ArrayList<>();
        trilhas = new ArrayList<>();
    }

    public static BaseDados getInstance() {
        if (instance == null) {
            instance = new BaseDados();
        }
        return instance;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Trilha> getTrilhas() {
        return trilhas;
    }
}