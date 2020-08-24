public class Empregado{
    private String nome;
    private String cargo;
    private double salario;
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public String getNome(){
        return nome;
    }
    public void setCargo(String novoCargo){
        cargo = novoCargo;
    }
    public String getCargo(){
        return cargo;
    }
    public void setSalario(double novoSalario){
        salario = novoSalario;
    }
    public double getSalario(){
        return salario;
    }
    public String exibirInfo(){
        String resultado = "Nome: "+nome+" / "+cargo+"  R$ "+salario;
        return resultado;
    }
    public void aumentarSalario(double percentual){
        salario = salario + (salario * percentual/100); 
    }
}