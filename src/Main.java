public class Main {

    public static void main(String[] args) {
	// write your code here
        Runner runner = new Runner();
        runner.printInfo();

        System.out.println(runner.book.readPages(20));
        System.out.println(runner.book.readPages(30));
        System.out.println(runner.book.readPages(40));
        System.out.println(runner.book.readPages(200));
    }
}
