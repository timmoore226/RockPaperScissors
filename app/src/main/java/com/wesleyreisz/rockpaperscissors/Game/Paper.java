package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class Paper implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        if (opponentChoice== R.id.btnRock){
            return GameUtils.LOSES_TO;
        }else if (opponentChoice==R.id.btnScissors){
            return GameUtils.BEATS;
        }
        else if (opponentChoice==R.id.btnLizard){
            return GameUtils.LOSES_TO;
        }
        else if (opponentChoice==R.id.btnSpock){
            return GameUtils.BEATS;
        }
        else {
            return GameUtils.TIES;
        }
    }
}
