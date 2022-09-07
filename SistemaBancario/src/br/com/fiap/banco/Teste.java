package br.com.fiap.banco;

public class Teste {

    public static void main(String[] args) {

/*        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(1111);
        cc.setNumero(222);
        cc.setChequeEspecial(1000);
        cc.setTipo("PF");*/

        Conta conta = new Conta();
        Conta cc = new ContaCorrente();

        ContaCorrente c1 = (ContaCorrente) cc;

        if(conta instanceof ContaCorrente){
            ContaCorrente c2 = (ContaCorrente) conta;
        }



    }
}
