package Scripts;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Final {
    Game game;
    double time=3;
    double countdown;
    
    
    Final (Game _game){
        game = _game;
        countdown = time;
    }
    
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Font font = new Font("arial", Font.BOLD,100);
        
        g2d.setFont(font);
        g2d.setColor(Color.white);
        g2d.drawString("GRACIAS POR JUGAR", game.getWidth()/2-500, 100);
        game.gameOver();
        
        if(countdown<=0)
            Game.state=Game.State.Menu;
        countdown-=0.02;
        
    }
}
