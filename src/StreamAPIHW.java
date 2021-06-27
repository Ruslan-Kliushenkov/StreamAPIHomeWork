import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPIHW {
    public static void main(String[] args) {
        List<Player> list = Arrays.asList(
                new Player("one a" , 1 ,1),
                new Player("two v " , 2 ,2),
                new Player("three a" , 3 ,3),
                new Player("four b" , 4,4),
                new Player("five a" , 5 ,5));

        List<String> names = list.stream()
                .flatMap(s -> s.getName().describeConstable().stream())
                .collect(Collectors.toList());
        names.forEach(System.out::println);

        Player maxPlayer = list.stream()
        .max((Comparator.comparingInt(Player::getId)))
                .orElse(new Player("void",0,0));
        System.out.println(maxPlayer.getName() + " " + maxPlayer.getId());

        int countSum = list.stream()
                .filter(s -> s.getName().contains("a"))
                .flatMapToInt(s -> IntStream.of(s.getCount()))
                .sum();
        System.out.println(countSum);

        Map<Integer, String> mapa = list.stream()
                .collect(Collectors.toMap(Player::getId, Player::getName));
        System.out.println(mapa);

    }
}
