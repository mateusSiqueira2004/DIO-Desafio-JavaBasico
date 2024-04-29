public class Usuario {
    int numero;
    String agencia, nome;
    double saldo;
    
    public void numeroDaConta(){
        numero ++;
    }
    public void numeroAgencia(String numAgencia){
        agencia = numAgencia;
    }

    public void nomeCliente(String nomeClienteDigitado){
        nome = nomeClienteDigitado;
    }

    public void saldoConta(double novoSaldo){
        saldo = novoSaldo;
    }

}
