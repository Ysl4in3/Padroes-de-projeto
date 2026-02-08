import java.util.ArrayList;

public class ArquivoUtilAdapter implements Persistencia {

    @Override
    public ArrayList<Usuario> carregarUsuarios() {
        return ArquivoUtil.carregarUsuarios();
    }

    @Override
    public ArrayList<Trilha> carregarTrilhas() {
        return ArquivoUtil.carregarTrilhas();
    }
}