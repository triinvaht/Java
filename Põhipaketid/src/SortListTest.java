public class SortListTest {
    public static void main(String[] args) {
        SortableList<Integer> numbers = new SortableList<>();
        numbers.add(new Integer(5));
        numbers.add(new Integer(2));
        numbers.add(new Integer(-7));
        numbers.add(new Integer(1));
        numbers.add(new Integer(15));

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        numbers.sort();

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        SortableList<String> names = new SortableList<>();
        names.add(new String("Kati"));
        names.add(new String("Mati"));
        names.add(new String("Kertu"));

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        names.sort();

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}