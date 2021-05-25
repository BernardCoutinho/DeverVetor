package Programa;
import java.util.Scanner;

import Classes.Contato;
public class Programa {
    
public static void main(String[] args) {
    int op, totalContatos = 0;
    Scanner ler = new Scanner(System.in);
    Contato[] contatos = new Contato[totalContatos];
    boolean achei;
    do{
        menu();
        op = ler.nextInt();
        ler.nextLine();

        switch(op){
            case 1:
              System.out.println("Digite a quantidade de contatos que deseja cadastrar.");
              totalContatos = ler.nextInt();
              ler.nextLine();
              Contato[] temp = new Contato[totalContatos];
              contatos = temp;
              for(int i=0; i<totalContatos; i++){
                 Contato contato = new Contato();
                 System.out.println("\nDigite o código.");
                 contato.setCondigo(ler.nextInt());
                 ler.nextLine();
                 System.out.println("\nDigite o nome.");
                 contato.setNome(ler.nextLine());
                 System.out.println("\nDigite o telefone.");
                 contato.setTel(ler.nextInt());
                 ler.nextLine();

                 contatos[i] = contato;
              }
             break;
            case 2:
            System.out.println("\nLista de contatos:");
              for(int i=0; i<totalContatos; i++){
                  System.out.printf("\nCódigo: %d", contatos[i].getCondigo());
                  System.out.printf("\nNome: %s", contatos[i].getNome());
                  System.out.printf("\nTelefone: %s", contatos[i].getTel());

              }
             break;
             case 3:
             System.out.println("Digite o código do contato para encontra-lo");
             int codigo = ler.nextInt();
             ler.nextLine();
             achei = false;
             for(int i=0; i<totalContatos; i++){
                  if(contatos[i].getCondigo() == codigo){
                      System.out.printf("\nCódigo: %d", contatos[i].getCondigo());
                      System.out.printf("\nNome: %s", contatos[i].getNome());
                      System.out.printf("\nTelefone: %s", contatos[i].getTel());
                      achei = true;
                      break;
                  }
             }
             if(achei == false){
             System.out.println("Código inválido.");

               }
             break;
            case 4:
            System.out.println("Digite o nome do contato para encontra-lo");
            String nome = ler.nextLine();
            achei = false;
            for(int i=0; i<totalContatos; i++){
                 if(contatos[i].getNome().equals(nome)){
                     System.out.printf("\nCódigo: %d", contatos[i].getCondigo());
                     System.out.printf("\nNome: %s", contatos[i].getNome());
                     System.out.printf("\nTelefone: %s", contatos[i].getTel());
                     achei = true;
                     break;
                 }
            }
            if(achei == false)
            System.out.println("Não encontrado.");
            break;
            case 0:
              System.out.println("Encerrando aplicação...");
            break;
            default:
            System.out.println("opção inválida.");
        }
    }while (op != 0);
    ler.close();
   }

private static void menu() {
  System.out.println("\nDigite a opção desejada:");
  System.out.println("1 - Cadastrar contato");
  System.out.println("2 - Listas todos os contatos.");
  System.out.println("3 - Localizar contato por código");
  System.out.println("4 - Localizar contato por nome");
  System.out.println("0 - Sair");
}
    
}
