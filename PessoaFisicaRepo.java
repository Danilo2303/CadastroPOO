package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaRepo {
    private List<PessoaFisica> pessoasFisicas = new ArrayList<>();

    public void inserir(PessoaFisica pessoa) {
        pessoasFisicas.add(pessoa);
    }

    public void alterar(PessoaFisica pessoa) {
        
    }

    public void excluir(int id) {
        
    }

    public PessoaFisica obter(int id) {
        
        return null;
    }

    public List<PessoaFisica> obterTodos() {
        return pessoasFisicas;
    }

    public void persistir(String arquivo) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            out.writeObject(pessoasFisicas);
        }
    }

    public void recuperar(String arquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
            List<?> temp = (List<?>) in.readObject();
            if (temp != null) {
                pessoasFisicas.clear();
                for (Object obj : temp) {
                    if (obj instanceof PessoaFisica) {
                        PessoaFisica pessoa = (PessoaFisica) obj;
                        pessoasFisicas.add(pessoa);
                    }
                }
            }
        }
    }
}
