package main.java.prcatice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaPra {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        // 找出2011年发生的所有交易，并按交易额排序
        List<Transaction> trans2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(t -> t.getMoney()))
                .collect(Collectors.toList());
        System.out.println(trans2011);

        // 交易员在哪些不同的城市工作过
        List<String> locations = transactions.stream()
                .map(t -> t.getName().getLocation())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(locations);

        // 查找所有来自剑桥的交易员，并按姓名排序
        List<Trader> traders = transactions.stream()
                .map(t -> t.getName())
                .filter(t -> t.getLocation().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(traders);

        // 返回所有交易员的姓名字符串，并按字母顺序排序
        String names = transactions.stream()
                .map(t -> t.getName().getName())
                .distinct().sorted()
                .reduce("", (s1, s2) -> s1 + s2);
        System.out.println(names);

        // 有没有交易员在米兰工作的？
        //　　　　 // .anyMatch表示一组数据中,是否包含一条或多条该数据
        boolean anyMatch = transactions.stream()
                .anyMatch(t -> t.getName().getLocation().equals("Milan"));
        System.out.println(anyMatch);

        // 打印生活在剑桥的交易员的所有交易额
        Map<String, Integer> nameAndTotalMoney = transactions.stream()
                .filter(t -> t.getName().getLocation().equals("Cambridge"))
                .collect(Collectors.groupingBy(t -> t.getName().getName(), Collectors.summingInt(Transaction::getMoney)));
        System.out.println(nameAndTotalMoney);

        // 所有交易中，最高的交易额是多少
        int maxMoney = transactions.stream()
                .map(Transaction::getMoney)
                .reduce(0, Integer::max);
        System.out.println(maxMoney);

        // 找到交易额最小的交易
        Transaction minTrans = transactions.stream()
                .min(Comparator.comparing(Transaction::getMoney))
                .get();
        System.out.println(minTrans);

    }
}

class Trader {
    String name;
    String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Trader(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Trader() {
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}

class Transaction {
    Trader name;
    int year;
    int money;

    public Trader getName() {
        return name;
    }

    public void setName(Trader name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Transaction(Trader name, int year, int money) {
        this.name = name;
        this.year = year;
        this.money = money;
    }

    public Transaction() {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name=" + name +
                ", year=" + year +
                ", money=" + money +
                '}';
    }
}
