package SeaBattle.Ships.Models;
import SeaBattle.Ships.Interfaces.Damager;
import SeaBattle.Ships.Interfaces.Sailable;

import java.awt.*;


public class Vessel {
    Point[] points = new Point[8];
    Damager damager;

    Sailable sail;
    public void attack(){
        damager.damage();
    }
}