package br.universidadejava.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import br.universidadejava.jpa.dao.PessoaDAO;
import br.universidadejava.jpa.modelo.Pessoa;
import java.util.List;

/**
 * Classe utilizada para testar os métodos do PessoaDAO.
 */
public class PessoaDAOTeste {

    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz Henrique Buris");
        Calendar data = new GregorianCalendar();
        data.set(Calendar.YEAR, 1985);
        data.set(Calendar.MONTH, 03);
        data.set(Calendar.DAY_OF_MONTH, 06);
        pessoa.setDataNascimento(data.getTime());
        pessoa.setEmail("luiz.buris@cemaden.gov.br");

        PessoaDAO dao = new PessoaDAO();
        System.out.println("Salvando a pessoa: " + pessoa.getNome());
        pessoa = dao.salvar(pessoa);

//        pessoa.setNome("Luiz  Buris");
//        pessoa = dao.salvar(pessoa);
//        System.out.println("Alterando a pessoa: " + pessoa.getNome());

//        List<Pessoa> pessoa2 = dao.consultar();
//        for (Pessoa ps : pessoa2) {
//            System.out.println(ps.getNome());
//        }

//        Pessoa pessoa2 = dao.consultarPorId(pessoa.getId());
//        System.out.println("Consultando: " + pessoa2.getNome());
//        System.out.println("Removendo a pessoa: " + pessoa.getId());
//        dao.excluir(pessoa.getId());
    }
}
