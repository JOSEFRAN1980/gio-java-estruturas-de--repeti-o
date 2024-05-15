public class ExemploBreakContinue {
    public static void main(String[] args) {
        
     /*    for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero); 
            
        } */
        //o comando break, parou quando chegou no número 3


        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
        //no exemplo acima, usamos o comando "continue". Repare que programa executará até que chegue no número 5.
    }
}
