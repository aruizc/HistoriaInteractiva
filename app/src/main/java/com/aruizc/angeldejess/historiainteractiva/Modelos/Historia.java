package com.aruizc.angeldejess.historiainteractiva.Modelos;

import com.aruizc.angeldejess.historiainteractiva.R;

/**
 * Created by AngeldeJesús on 07/01/2015.
 */
public class Historia {
    private Pagina[] paginas;

    public Historia(){
        paginas = new Pagina[7];

        paginas[0] = new Pagina(
                R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \"Help me, %1$s, you're my only hope.\"",
                new Decision("Stop and investigate", 1),
                new Decision("Continue home to Earth", 2));

        paginas[1] = new Pagina(
                R.drawable.page1,
                "You deftly land your ship near where the distress signal originated. You didn't notice anything strange on your fly-by, but there is a cave in front of you. Behind you is an abandoned rover from the early 21st century.",
                new Decision("Explore the cave", 3),
                new Decision("Explore the rover", 4));

        paginas[2] = new Pagina(
                R.drawable.page2,
                "You continue your course to Earth. Two days later, you receive a transmission from HQ saying that they have detected some sort of anomaly on the surface of Mars near an abandoned rover. They ask you to investigate, but ultimately the decision is yours because your mission has already run much longer than planned and supplies are low.",
                new Decision("Head back to Mars to investigate", 4),
                new Decision("Continue home to Earth", 6));

        paginas[3] = new Pagina(
                R.drawable.page3,
                "Your EVA suit is equipped with a headlamp, which you use to navigate the cave. After searching for a while your oxygen levels are starting to get pretty low. You know you should go refill your tank, but there's a very faint light up ahead.",
                new Decision("Refill at ship and explore the rover", 4),
                new Decision("Continue towards the faint light", 5));

        paginas[4] = new Pagina(
                R.drawable.page4,
                "The rover is covered in dust and most of the solar panels are broken. But you are quite surprised to see the on-board system booted up and running. In fact, there is a message on the screen: \"%1$s, come to 28.543436, -81.369031.\" Those coordinates aren't far, but you don't know if your oxygen will last there and back.",
                new Decision("Explore the coordinates", 5),
                new Decision("Return to Earth", 6));

        paginas[5] = new Pagina(
                R.drawable.page5,
                "After a long walk slightly uphill, you end up at the top of a small crater. You look around, and are overjoyed to see your favorite android, %1$s-S1124. It had been lost on a previous mission to Mars! You take it back to your ship and fly back to Earth.");

       paginas[6] = new Pagina(
                R.drawable.page6,
                "You arrive home on Earth. While your mission was a success, you forever wonder what was sending that signal. Perhaps a future mission will be able to investigate...");
    }

    public Pagina getPagina(int index)
    {
        return paginas[index];

    }
}
