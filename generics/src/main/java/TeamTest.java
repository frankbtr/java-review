public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

    //    Team liverpool = new Team("Liverpool");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

        // Team only except Player type
    //    Team<String > brokenTeam = new Team<>("this wont work");

        // earlier it did not check the team type
        // now it checks since we have added the <T> generics for Team class

    //     liverpool.addPlayer(joe);
    //    liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());;
    }
}
