package empresarial;


/**
 * Created by gita on 14/02/17.
 */
public class Empresa {
    public static void main(String[] args) throws IllegalArgumentException{
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.setNome("Phillip Alisson Volpi");
            funcionario.setSalario(500.00);
            funcionario.setDataEntrada("15/02/2017");
            funcionario.setDepartamento("Desenvolvimento de software");
            funcionario.setRg("48.292.829-3");

            funcionario.mostra();
            System.out.println(funcionario.calculaGanhoAnual());
            funcionario.aumentaSalario(50);
            funcionario.mostra();

        }catch (IllegalArgumentException i){
            System.out.println(i.getMessage());
        }
    }
}
