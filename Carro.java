/*
 Até agora, nossos programas resumiam-se a 1 único arquivo contendo uma Classe que contém método MAIN
 (esse é o cara que executa)
 A partir de agora, nossos programas serão feitos, primeiro
    - definindo uma classe para criar um novo tipo de dado (que é este caso)
    - criando outra classe que tem método MAIN para manipular variáveis deste novo tipo
*/

// aqui estamos definindo a estrutura (Classe) do Carro
public class Carro{
    // definir as variáveis que descrevem a estrutura de um carro
    // através do uso do "private", eu "blindo" o acesso aos atributos a partir de outras classes
    // ou seja, outra classe que não seja a classe "Carro", não consegue mais acessar diretamente
    // estes atributos. Isso aqui também é conhecido como "encapsulamento"
    private String  marca;
    private String  modelo;
    private int     ano;
    private String  cor;
    private double  preco;
    private boolean licenciado;
    private boolean ipvaPago;

    // já que nossos atributos estão "blindados", como podemos trabalhar para ter mecanismos
    // que acessem / modifiquem estes atributos?
    // RESPOSTA: para cada atributo, criamos um método de acesso e outro de modificação

    // o mercado JAVA "definiu" nomes padronizados para métodos de modificação e consulta
    // modificacao = SET
    // consulta    = GET

    // exemplos: ATributo marca: getMarca e setMarcar

    // chamamos popularmente isso de "Getters & Setters"



    String getMarca(){  // crio um método chamado consultarMarca
        return marca;         // vou retornar o que estiver armazenado no atributo marca
    }
    // crio um método chamado modificarMarca que recebe uma informação no parâmetro NOVAMARCA
    // de mesmo tipo que o referido atributo. No seu corpo, eu simplesmente faço uma atribuição
    void setMarca(String novaMarca){
        marca = novaMarca;
    }

    String getModelo(){
        return modelo;
    }
    void setModelo(String novoModelo){
        modelo = novoModelo;
    }

    int getAno(){
        return ano;
    }
    void setAno(int novoAno){
        ano = novoAno;
    }

    String getCor(){
        return cor;
    }
    void setCor(String novaCor){
        cor = novaCor;
    }

    double getPreco(){
        return preco;
    }
    void setPreco(double novoPreco){
        preco = novoPreco;
    }

    boolean isLicenciado(){
        return licenciado;
    }
    void setLicenciado(boolean novoLicenciado){
        licenciado = novoLicenciado;
    }

    boolean isIpvaPago(){
        return ipvaPago;
    }
    void setIpvaPago(boolean novoIpvaPago){
        ipvaPago = novoIpvaPago;
    }

    // vou criar as funcionalidades para poder manipular o carro
    void exibirInfo(){
        System.out.println("Carro: "+marca+"/"+modelo+" ("+ano+") Cor:" +cor+" R$ "+preco);
        if (licenciado){
            System.out.print("     Licenciado");
        }
        else{
            System.out.print("     Documentos Pendentes");
        }
        if (ipvaPago){
            System.out.println("  IPVA Pago");
        }
        else{
            System.out.println("  IPVA a pagar");
        }
        System.out.println("  VALOR DO IPVA R$ "+calcularIPVA());
    }

    private double calcularIPVA(){
        double ipva;
        if (ano <= 2000){
            ipva = 0.0;
        }
        else{
            ipva = preco * 0.045;
        }
        return ipva;
    }
}