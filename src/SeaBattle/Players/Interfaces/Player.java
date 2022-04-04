package SeaBattle.Players.Interfaces;

import SeaBattle.Ships.Models.Vessel;
import java.util.List;

public interface Player {
    void getReadyForGame();
    List <Vessel> getVessel();
    Boolean isReadyToPlay();
}