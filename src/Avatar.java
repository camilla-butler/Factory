public class Avatar {
    int posy;
    int posx;
    int dx;
    int dy;

    int height;
    int width;
    String power;
    String role;
    String weakness;

    public Avatar() {
        posx = 400;
        posy = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "villain";
        weakness = "pride";
    }


    public Avatar( int pposy, int pposx, int pdy, int pdx, int pheight, int pwidth, String ppower,String prole, String pweakness )
    {
posx= pposx;
posy=pposy;
dy=pdy;
height=pheight;
width=pwidth;
weakness = pweakness;
role = prole;
power = ppower;


        }


                public void print() {
                System.out.println("the " + role + " can " + power + " and their weakness is " + weakness);
                System.out.println("they are at the location (" + posx + " ," + posy + ")");


            }
            }


