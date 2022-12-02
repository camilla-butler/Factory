public class City {
    int pop;
    String continent;
    String name;
    int avetemp;

    public City(){
        name = "chicago";
        pop = 10;
        avetemp = 4;
        continent = "Europe";
        print();

    }

    public void print(){
        System.out.println ("the city " + name + " in " + continent);
        System.out.println("with an average temp of " + avetemp + " and a population of " + pop + " people");

    }

}
