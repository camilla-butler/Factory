public class sport {
    int players;
    int record;
    String name;

    public void print()
    {
        System.out.println("the sport " + name + " has " + players + " players, with a record of " + record);
        rateing();
    }

    public sport(int pplayer, int precord, String pname) {
        name = pname;
        record = precord;
        players = pplayer;


    }
public void rateing(){
            if(record >10){
                System.out.println("this is a good season");

            }
            else{
                System.out.println("this is a sad season");
            }
    }
    }


