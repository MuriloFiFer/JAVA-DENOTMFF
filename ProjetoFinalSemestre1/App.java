package ProjetoFinalSemestre1;

import javax.swing.JOptionPane;

import ProjetoFinalSemestre1.Conta.Conta;
import ProjetoFinalSemestre1.Conta.ContaPF;
import ProjetoFinalSemestre1.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {
        // criar o meu vetor de objetos
        ContaPJ clientePJ[] = new ContaPJ[10];
        ContaPF clientePF[] = new ContaPF[10];
        // começar meu banco
        boolean aberto = true;
        int contPJ = 0;
        int contPF = 0;
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação Desejada:"
                    + "\n 1-Abrir Conta PJ"
                    + "\n 2- Abrir Conta PF"
                    + "\n 3- Acessar Conta PJ"
                    + "\n 4- Acessar Conta PF"
                    + "\n 5-Sair"));
            if (acao == 1) {// abrir a conta
                // criar um objeto
                clientePJ[contPJ] = new ContaPJ();// chamei o construtor
                // OREENCHER OS ATRIBUTOS DO IBJETO
                clientePJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome da Empresa:"));
                clientePJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa;"));
                clientePJ[contPJ].setnConta(2000 + contPJ);
                clientePJ[contPJ].setSaldo(0);
                // ACRESCIMO NO CONTADOR
                JOptionPane.showMessageDialog(null, "Conta criada com SUCESSO");
                JOptionPane.showMessageDialog(null, "O Numero da sua conta é:" + clientePJ[contPJ].getnConta());
                contPJ++;
            }
            if (acao == 2) {// abrir a conta
                // criar um objeto
                clientePF[contPF] = new ContaPF();// chamei o construtor
                // OREENCHER OS ATRIBUTOS DO IBJETO
                clientePF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome do cliente:"));
                clientePF[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF do cliente:"));
                clientePF[contPF].setnConta(1000 + contPF);
                clientePF[contPF].setSaldo(0);
                // ACRESCIMO NO CONTADOR
                JOptionPane.showMessageDialog(null, "Conta criada com SUCESSO");
                JOptionPane.showMessageDialog(null, "O Numero da sua conta é:" + clientePF[contPF].getnConta());
                contPF++;
            }
            if (acao == 3) { // acessa uma conta já criada PJ
                // localizar a conta no vetor
                int i; // contador
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta buscada"));
                boolean acesso = true;
                for (i = 0; i < clientePJ.length; i++) {
                    if (nContaBuscada == clientePJ[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        acesso = true;
                        break;
                    }
                    // else {
                    // JOptionPane.showMessageDialog(null,"Conta não encontrada");
                    // acesso=false;
                    // }
                }
                JOptionPane.showMessageDialog(null,
                        "Nome da Empresa:" + clientePJ[i].getNome() + ", número do CNPJ:" + clientePJ[i].getnCnpj());
                // menu de acesso da conta

                while (acesso) { // acessei a Conta
                    int acao3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação Desejada:"
                            + "\n 1-Consultar o Saldo"
                            + "\n 2-Realizar um Saque"
                            + "\n 3-Realizar um Depósito"
                            + "\n 4-Voltar ao Menu anterior"));
                    if (acao3 == 1) {// saldo
                        JOptionPane.showMessageDialog(null, "Seu saldo é de R$ " + clientePJ[i].getSaldo());
                    } else if (acao3 == 2) {// saque
                        clientePJ[i].saque();
                    } else if (acao3 == 3) {// deposito
                        clientePJ[i].deposito();
                    } else if (acao3 == 4) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção invalida");
                    }
                }
            }

            if (acao == 4) { // acessa uma conta já criada PF
                // localizar a conta no vetor
                int i; // contador
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta buscada"));
                boolean acesso = true;
                for (i = 0; i < clientePF.length; i++) {
                    if (nContaBuscada == clientePF[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        JOptionPane.showMessageDialog(null, "Nome do cliente:" + clientePF[i].getNome()
                                + ", número do CPF:" + clientePF[i].getnCpf());
                        break;
                    }
                }

                // menu de acessi da conta

                while (acesso) { // acessei a Conta
                    int acao4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação Desejada:"
                            + "\n 1-Consultar o Saldo"
                            + "\n 2-Realizar um Saque"
                            + "\n 3-Adicionar Saldo"
                            + "\n 4-Realizar transferencia"
                            + "\n 5-Voltar ao Menu anterior"));
                    if (acao4 == 1) {// saldo
                        JOptionPane.showMessageDialog(null, "Seu saldo é de R$ " + clientePF[i].getSaldo());
                    } else if (acao4 == 2) {// saque
                        clientePF[i].saque();
                    } else if (acao4 == 3) {// deposito
                        clientePF[i].deposito();
                    }

                    //realizar função 4 de transferencia

                    // else if (acao4 == 4){
                    // break ;
                    // }
                    else if (acao4 == 5) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção invalida");
                    }
                }
            }

            else if (acao == 5) {
                break;
            }
        }
    }
}
