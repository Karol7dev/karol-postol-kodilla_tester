public class SimpleArray {
    public static void main(String[] args) {
        String[] games = new String[]{"World of Warcraft", "Frostpunk", "Rainbow Six Siege", "Twierdza Krzyzowiec", "Heroes V"};
        games[0] = "World of Warcraft";
        games[1] = "Frostpunk";
        games[2] = "Rainbow Six Siege";
        games[3] = "Twierdza Krzyzowiec";
        games[4] = "Heroes V";

        for (int i = 0; i < games.length; i++){
            System.out.println(games[i]);
        }

        for (String game : games){
            System.out.println(game);
        }
    }
}