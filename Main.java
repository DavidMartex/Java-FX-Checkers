import CheckersServer.ServerMain;
import mainGame.ClientMain;

public class Main{

    public static void main(String[] args) {

       server();

    }

        private static void server(){
            ServerMain.main(null);
        }

        private static void client(){
            ClientMain.main(null);
    }
    }

