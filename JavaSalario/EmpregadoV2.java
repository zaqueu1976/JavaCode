public class EmpregadoV2{
    private String nome;
    private String cargo;
    private double salario;

    // este método específico é chamado de "CONSTRUTOR"
    // significa que ele é executado no momento que damos NEW no objeto
    
    public EmpregadoV2(String novoNome, String novoCargo, double novoSalario){
        nome    = novoNome;
        cargo   = novoCargo;
        salario = novoSalario;
    }
    // qual o detalhe que temos que prestar atenção?
    // agora, como temos o construtor declarado, a forma de criar o objeto muda
    // para dar NEW no objeto, temos que passar estas 3 informações

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