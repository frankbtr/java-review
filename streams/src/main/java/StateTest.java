import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State va = new State();
        va.addCity("Mclean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va, tx);

        list.stream().map(state -> state.getCity()).forEach(System.out::println);

        System.out.println("for print each cities");
        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
