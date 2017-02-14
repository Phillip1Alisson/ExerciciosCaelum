package empresarial;

/**
 * Created by gita on 14/02/17.
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;
    private String dataEntrada;
    private String rg;

    public void setNome(String nome){
        this.nome = nome;
    }
     public String getNome(){
        return  this.nome;
     }

     public void setSalario(double salario) throws IllegalArgumentException{
         if(salario > 0)
            this.salario = salario;
         else
             throw new IllegalArgumentException("Salario incompativel");
     }

     public double getSalario(){
         return this.salario;
     }

    public void setDepartamento(String departamento){
         this.departamento = departamento;
    }

    public String getDepartamento(){
        return  this.departamento;
    }

    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public String getDataEntrada(){
        return this.dataEntrada;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getRg(){
        return this.rg;
    }

    public void aumentaSalario(double salario, double porcentagemAumento) throws IllegalArgumentException{
        try {
            if (porcentagemAumento > 0)
                this.setSalario(salario * ((porcentagemAumento / 100) + 1));
            else
                throw new IllegalArgumentException("Valor de aumento incorreto");
        }catch (IllegalArgumentException i){
            throw i;
        }
    }

    public void aumentaSalario(double porcentagemAumento) throws IllegalArgumentException{
        try {
            if (porcentagemAumento > 0)
                this.setSalario(this.getSalario() * ((porcentagemAumento / 100) + 1));
            else
                throw new IllegalArgumentException("Valor de aumento incorreto");
        }catch (IllegalArgumentException i){
            throw i;
        }
    }


    public double calculaGanhoAnual(){
        return this.getSalario()*12;
    }

    public void mostra(){
        System.out.println(this.getNome());
        System.out.println(this.getRg());
        System.out.println(this.getDepartamento());
        System.out.println(this.getDataEntrada());
        System.out.println(this.getSalario());
    }
}
