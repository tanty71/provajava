public class Calcola {
    static int x = 50;
    public static void scrivi(int y){

        if (y < 4){
            x++;
        }
        double casuale = (int)(Math.random()*90);
        System.out.println("ora calcolo " + y + " " + casuale);
    }
}
