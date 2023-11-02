package model;

public class Main {
    public static void main(String[] args) {
        
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();

        PessoaFisica pessoa1 = new PessoaFisica(1, "Danilo Alves da Silva", "054666987525", 41);
        repo1.inserir(pessoa1);

        PessoaFisica pessoa2 = new PessoaFisica(2, "Carlos Alberto", "056897855789", 38);
        repo1.inserir(pessoa2);

        
        PessoaJuridicaRepo repo2 = new PessoaJuridicaRepo();

        PessoaJuridica pessoa3 = new PessoaJuridica(3, "Comércio LTDA", "056547845454565");
        repo2.inserir(pessoa3);

        PessoaJuridica pessoa4 = new PessoaJuridica(4, "Consórcio Gouveia", "4564568878746");
        repo2.inserir(pessoa4);

        
        System.out.println("Dados de Pessoa Fisica armazenados");
        for (PessoaFisica pessoa : repo1.obterTodos()) {
            pessoa.exibir();
        }

        System.out.println("Dados de Pessoa Juridica armazenados");
        for (PessoaJuridica pessoa : repo2.obterTodos()) {
            pessoa.exibir();
        }
    }
}
