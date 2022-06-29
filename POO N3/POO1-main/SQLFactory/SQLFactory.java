public class SQLFactory{
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        
        aluno.id= 5;
        aluno.nome= "Pedro";
        aluno.idade = 26;
        aluno.cidade = "Tangará";
        aluno.uf = " MT";

        //Database.inserir(aluno);

        //if (Database.abrirID(aluno, 5)) {
          //  System.out.println("Nome: " + aluno.nome + ", Idade: " + aluno.idade + ", Cidade: " + aluno.cidade + ", UF" + aluno.uf );
        //}


        //Database.atualizar(aluno);

        Database.deletar(aluno);

    }
}