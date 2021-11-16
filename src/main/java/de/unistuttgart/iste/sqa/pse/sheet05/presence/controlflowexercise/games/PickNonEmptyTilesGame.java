package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

public class PickNonEmptyTilesGame extends BaseControlFlowHamsterGame {

    public PickNonEmptyTilesGame() {
        super("/territories/territoryExample05-5.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        while(paule.frontIsClear()) {
            if(paule.grainAvailable()) {
                pickAllGrainsOnNonEmptyTile();
            }
            paule.move();
        }
    }
}
