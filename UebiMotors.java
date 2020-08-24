public class UebiMotors{
    public static void main(String args[]){

        /* defini 2 variáveis do tipo Carro */
        Carro  carro1;
        Carro  carro2;

        /* antes de preencher os dados, eu preciso alocar memória */
        carro1 = new Carro();
        carro2 = new Carro();

        //carro1.marca  = "Chevrolet";
        carro1.setMarca("Chevrolet");
        //carro1.modelo = "Corsa";
        carro1.setModelo("Corsa");
        //carro1.ano    = 1995;
        carro1.setAno(1995);
        //carro1.cor    = "Azul Royal Transcendente com detalhes em malhado";
        carro1.setCor("Azul Royal Transcendente com detalhes em malhado");
        //carro1.preco  = 6500.0;
        carro1.setPreco(6500);
        //carro1.licenciado = false;
        carro1.setLicenciado(false);
        //carro1.ipvaPago   = false;
        carro1.setIpvaPago(false);

        //carro2.marca  = "Porsche";
        carro2.setMarca("Porsche");
        carro2.setModelo("Cayenne");
        carro2.setAno(2021);
        carro2.setCor("Branco");
        carro2.setPreco(375000.0);
        carro2.setLicenciado(true);
        carro2.setIpvaPago(true);

    
        carro1.exibirInfo(); 
        
        carro2.exibirInfo();

          
    }
}