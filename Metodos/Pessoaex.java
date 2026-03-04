
public class Pessoaex {

    public static void main(String[] args) {
         Pessoa umaPessoa = new Pessoa(); // Instanciando a classe Pessoa

        // Atribuindo os valores 
        umaPessoa.nome = "luciano";
        umaPessoa.sexo = "masculino";
        umaPessoa.país = "Brasil";

        // Executando os métodos
        umaPessoa.anda();
        umaPessoa.fala();
        umaPessoa.corre();
        umaPessoa.estuda();
        umaPessoa.brinca();

        // Limpando o objeto
        umaPessoa = null;
   
    }
}
