import java.util.Date;

public class PessoaGeral {
    public String endereco;
    public String telefone;

    public PessoaGeral(String endereco, String telefone) {

        this.endereco = endereco;
        this.telefone = telefone;
    }

    public PessoaGeral() {

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telefone;
    }

    public void setTelsContato(String telsContato) {
        this.telefone = telefone;
    }
}