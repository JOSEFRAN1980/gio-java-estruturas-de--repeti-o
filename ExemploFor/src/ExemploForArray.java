public class ExemploForArray {

    public static void main(String[] args) {
        
     /*   String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]); } */

            // mesmo código acima, só que, usando o "For Each" 
            String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
            for(String aluno : alunos){
                System.out.println("O nome do aluno é: " + aluno);
            }

    }
}

    
    

