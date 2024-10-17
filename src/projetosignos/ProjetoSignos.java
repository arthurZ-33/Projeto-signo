package projetosignos;


import java.util.Calendar;
import java.util.Scanner;

public class ProjetoSignos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome, sexo, cor;

        int dia, mes, ano, numSorte, numCor, diaAtual, mesAtual, anoAtual, idade;

        //entradas
        

        Calendar hoje = Calendar.getInstance();
        diaAtual = hoje.get(Calendar.DATE);
        mesAtual = hoje.get(Calendar.MONTH) + 1;
        anoAtual = hoje.get(Calendar.YEAR);
        //*cof *cof sim inicialmente o meu cerébro de 83 de qi(no caso o arthur) não tinha entendido essa coisa absurda de fácil...
        
        System.out.println("Insira o seu nome: ");
        nome = ler.nextLine();

        System.out.println("Qual seu sexo responda com (1) para feminino e (2) para masculino:");
        sexo = ler.nextLine();

        System.out.println("Insira o ano de nascimento: ");
        ano = ler.nextInt();

        System.out.println("Insira o mês de nascimento: ");
        mes = ler.nextInt();

        System.out.println("Insira o dia de nascimento (1 a 31): ");
        dia = ler.nextInt();
        
        System.out.println("Hoje é dia : " + diaAtual);
         System.out.println("Do mês de : " + mesAtual);
         System.out.println("Do ano de : " + anoAtual);
        
        idade = (anoAtual - ano);
        System.out.println("A sua idade é: " + idade);

        if (nome.length() >= 8) {
            nome = nome;
            System.out.println("Seu nome: " + nome);
        } else {
            System.out.println("Error");
        }

        if (sexo.equals("1")) {
            System.out.println("seu sexo é femenino");
        } else if (sexo.equals("2")) {
            System.out.println("Seu sexo é masculino");
        } else {
            System.out.println("Erro");
        }
        if (dia >= 1 && dia <= 31) {
            System.out.println("Dia: válido");
        } else {
            System.out.println("Dia: inválido");
        }
        if (mes >= 1 && mes <= 12) {
            System.out.println("Mês: válido");
        } else {
            System.out.println("Mês: inválido");
        }
        if (ano >= 1900 && ano <= 2024) {
            System.out.println("Ano: válido");
        } else {
            System.out.println("Ano: inválido");
        }
        
        //processamentos
        if (mes == 1 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr." + nome + ", você nasceu em Janeiro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Capricornio");
  
        } else if (mes == 1 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra." + nome + ", você nasceu em Janeiro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Capricornio");
            
        }else if (mes == 1 && dia >= 21 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr." +nome +", você nasceu em Janeiro no dia " + dia + " do ano " + ano + " e sua idade é " +idade);
            System.out.println("Seu signo é Aquário");
            
        }else if (mes == 1 && dia >= 21 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra." +nome +", você nasceu em Janeiro no dia " + dia + " do ano " + ano +" e sua idade é "+idade);
            System.out.println("Seu signo é Aquário");
            
        }else if (mes == 2 && dia >= 1 && dia <= 18 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Fevereiro no dia " + dia + " do ano " + ano +" e sua idade é "+idade);
            System.out.println("Seu signo é Aquário"); 
            
        }else if (mes == 2 && dia >= 1 && dia <= 18 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Fevereiro no dia " + dia + " do ano " + ano +" e sua idade é "+idade);
            System.out.println("Seu signo é Aquário"); 
                    
        }else if (mes == 2 && dia >= 19 && dia <= 28 && dia < 29 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Fevereiro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Peixes"); 
            
        }else if (mes == 2 && dia >= 19 && dia <= 28 && dia < 29 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Fevereiro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Peixes"); 
            
        }else if (mes == 3 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Março no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Peixes");
            
        }else if (mes == 3 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Março no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Peixes");
            
        }else if (mes == 3 && dia >= 21 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Março no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Áries");
            
        }else if (mes == 3 && dia >= 21 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Março no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Áries");
            
        }else if (mes == 4 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Abril no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Áries");
            
        }else if (mes == 4 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Abril no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Áries");
            
        }else if (mes == 4 && dia >= 21 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Abril no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Touro");
            
        }else if (mes == 4 && dia >= 21 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Abril no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Touro");
            
        }else if (mes == 5 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Maio no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Touro");
            
        }else if (mes == 5 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Maio no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Touro");
            
        }else if (mes == 5 && dia >= 21 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Maio no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Gêmeos");
            
        }else if (mes == 5 && dia >= 21 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Maio no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Gêmeos");
            
        }else if (mes == 6 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Junho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Gêmeos");
            
        }else if (mes == 6 && dia >= 1 && dia <= 20 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Junho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Gêmeos");
            
        }else if (mes == 6 && dia >= 21 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Junho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Câncer");
            
        }else if (mes == 6 && dia >= 21 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Junho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Câncer");
            
        }else if (mes == 7 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Julho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Câncer");
            
        }else if (mes == 7 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Julho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Câncer");
            
        }else if (mes == 7 && dia >= 23 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Julho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Leão");
            
        }else if (mes == 7 && dia >= 23 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Julho no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Leão");
            
        }else if (mes == 8 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Agosto no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Leão");
            
        }else if (mes == 8 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Agosto no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Leão");
            
        }else if (mes == 8 && dia >= 23 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Agosto no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Virgem");
            
        }else if (mes == 8 && dia >= 23 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Agosto no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Virgem");
            
        }else if (mes == 9 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Setembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Virgem");
            
        }else if (mes == 9 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Setembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Virgem");
            
        }else if (mes == 9 && dia >= 23 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Setembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Libra");
            
        }else if (mes == 9 && dia >= 23 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Setembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Libra");
            
        }else if (mes == 10 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Outubro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Libra");
            
        }else if (mes == 10 && dia >= 1 && dia <= 22 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Outubro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Libra");
            
        }else if (mes == 10 && dia >= 23 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Outubro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Escorpião");
            
        }else if (mes == 10 && dia >= 23 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Outubro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Escorpião");
            
        }else if (mes == 11 && dia >= 1 && dia <= 21 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Novembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Escorpião");
            
        }else if (mes == 11 && dia >= 1 && dia <= 21 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Novembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Escorpião");
            
        }else if (mes == 11 && dia >= 22 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Novemebro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Sagitário");
            
        }else if (mes == 11 && dia >= 22 && dia <= 30 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Novemebro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Sagitário");
            
        }else if (mes == 12 && dia >= 1 && dia <= 21 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Dezembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Sagitário");
            
        }else if (mes == 12 && dia >= 1 && dia <= 21 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Dezembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Sagitário");
            
        }else if (mes == 12 && dia >= 22 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("2")) {
            System.out.println("Sr."+ nome +", você nasceu em Dezembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Capricórnio");
            
        }else if (mes == 12 && dia >= 22 && dia <= 31 && ano >= 1900 && ano <= 2024 && sexo.equals("1")) {
            System.out.println("Sra."+ nome +", você nasceu em Dezembro no dia " + dia + " do ano " + ano + " e sua idade é "+idade);
            System.out.println("Seu signo é Capricórnio");
            
        }else {
            System.out.println("Algum dado acima está inválido ou o dia não é compativel com o mês.");
//Não nos pergunte como a gente fez isso funcionar, a gente usou uma cois chamada C de Cristo.
        
        //saídas
        
        
        
         numSorte = 1 + (int) (Math.random() * 99);
         System.out.println("seu numero da sorte é: " + numSorte);
         
         
         
         numCor = 1 + (int) (Math.random() * 5);
         cor = "azul";
         if(numCor == 1){
         cor = "vermelho";
         System.out.println("Sua cor da sorte é: " + cor);
         }else if(numCor == 2){
         cor = "verde";
         System.out.println("Sua cor da sorte é: " + cor);
         }else if(numCor == 3){
         cor = "preto";
          System.out.println("Sua cor da sorte é: " + cor);
         }else if (numCor == 4){
         cor ="branco";
         System.out.println("Sua cor da sorte é: " + cor);
         }else if (numCor == 5){
         cor = "amarelo";
         System.out.println("Sua cor da sorte é: " + cor);
         }else if (numCor == 6){
         cor = "verdeClaro";
         System.out.println("Sua cor da sorte é: " + cor);
         }else if (numCor == 7){
         cor = "rosa";
         System.out.println("Sua cor da sorte é: " + cor);
         }else if(numCor == 8){
         cor = "roxo";
         System.out.println("Sua cor da sorte é: " + cor);
         }
         //obs: ele ta assim porque eu to com sono par ser sincero...
        
         
    }
}
}
