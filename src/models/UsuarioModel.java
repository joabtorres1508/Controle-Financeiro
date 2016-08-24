package models;

import controllers.UsuarioController;
import java.util.List;

/**
 * UsuarioModel responsável para inserir e buscar dados no Usuário;
 *
 * Descricao: Está classe tem como objetivo fazer insersão ou consultas no banco de dados de Usuários
 *
 * @copyright (c) 22/08/2016, Joab Torres Alencar - Analista de Sistema
 */
public class UsuarioModel implements Model {
    private static UsuarioModel usuarioModel;
    private UsuarioModel() {
    }

    public static UsuarioModel getUsuarioModel() {
        if(usuarioModel == null){
            usuarioModel = new UsuarioModel();
        }
        return usuarioModel;
    }
    

    @Override
    public void salvar() {

    }

    @Override
    public void deletar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UsuarioController> result() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UsuarioController> resulId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
