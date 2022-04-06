import java.util.Scanner;

public class Tama extends Leny {
    public String nev;
    public int ehseg= -5;

    public Tama(String nev) {
        this.nev = nev;
    }

    @Override
    public void ertelmezo(){
        //parancs feldolgozó
        Scanner sc = new Scanner(System.in);

        String parancs="";
        while(!parancs.equals("vege")){
            System.out.println(this.nev + "> ");
            parancs = sc.nextLine();
            eheztetes();
            }
        }
        
    private void eheztetes(){
        this.ehseg++;
        if(this.ehseg > 0){
            System.out.println("Éhes vagyok");
    }
}
}
