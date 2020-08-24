import java.util.Scanner;
public class FolhaDePagamento{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Empregado e1;
        String txtNome;
        String txtCargo;
        String txtSalario;
        String txtAumento;

        System.out.println("Bem vindo ao cadastro da Folha de Pagamentos");
        System.out.print("Digite o nome do funcionario  :");
        txtNome    = teclado.nextLine();
        System.out.print("Digite o cargo do funcionario :");
        txtCargo   = teclado.nextLine();
        System.out.print("Digite o salario do fucionario:");
        txtSalario = teclado.nextLine();


        e1 = new Empregado();

        e1.setNome(txtNome);
        e1.setCargo(txtCargo);
        e1.setSalario(Double.parseDouble(txtSalario)); // aqui sou obrigado a converter de String par double

        System.out.println(e1.exibirInfo());
        System.out.print("Digite o percentual de aumento:");
        txtAumento = teclado.nextLine();
        e1.aumentarSalario(Double.parseDouble(txtAumento));
        System.out.println(e1.exibirInfo());
    }
}