import java.util.ArrayList;

public interface Persistencia {
    ArrayList<Usuario> carregarUsuarios();
    ArrayList<Trilha> carregarTrilhas();
}