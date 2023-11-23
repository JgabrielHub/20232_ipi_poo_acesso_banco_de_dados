import java.sql.PreparedStatement;

public class MusicaDAO {
    public void cadastrar(Musica musica) throws Exception{
        //1. Especificar o Comando SQL
        String sql = "INSERT INTO tb_musica(titulo) VALUES(?)";
        //2. Estabelecer uma conexão com SGDB (PostgreSQL)
        var conexao = ConnectionFactory.conectar();
        //3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, musica.getTitulo());
        //5. Executar o comando
        ps.execute();
        //6. Fechar os recursos
        ps.close();
        conexao.close();
    }
}
