package se.lexicon.ReineMoberg;

import se.lexicon.ReineMoberg.model.Player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Player> players= new ArrayList<>();
        Player player1 = new Player(1,"Reine","Moberg");
        Player player2 = new Player(2,"Anna","Hansson");
        players.add(player1);
        players.add(player2);

        List<Player> test = serialize(players,"testFile.ser");
        System.out.println(test);

    }

    public static List<Player> serialize(List<Player> source , String filePath){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
        ){
            out.writeObject(source);
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return source;
    }
}
