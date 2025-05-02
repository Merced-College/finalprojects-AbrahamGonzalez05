
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // random map generation called from inside a file
        List<String> maps = MapGeneration.randomizeMaps();

        for(String map : maps) {
            System.out.println(map);
        }
        
    }
}