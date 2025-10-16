package exercicios;

public class ForEach {
    public static void main(String[] args) {
        /*for (tipo apelido : coleção){
            <comando 1>
            <comando 2>
        }
         */

        String [] vect = new String[]{"Maria", "BOB", "Alex"};
        //COMO SE LÊ: para cada objeto obj, contida no vetor vect, faça:
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
