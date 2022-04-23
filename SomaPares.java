public class SomaPares {
    public static void main(String[] args) {
        int cont= 0, j = 0;

        while( cont < 100){
            if ( cont %2 == 0){
                j = j + cont;
                System.out.println(j);
            }
            cont++;
        }
        System.out.println(j);
    }
}
