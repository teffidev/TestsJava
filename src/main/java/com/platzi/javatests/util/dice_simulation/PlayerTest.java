package com.platzi.javatests.util.dice_simulation;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loose_when_dice_number_is_to_low(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_big(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }

}