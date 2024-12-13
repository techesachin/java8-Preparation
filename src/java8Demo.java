import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class java8Demo {
    // java8 --> minimal code, functional programing
    // java8 --> lambda expression, stream, Date & Time API, Optional.
    //Lambda Expression
    // lambda expression is anonymous function(no name, no return type, no parameter modifiers).

    public static void main(String[] args) {
        Thread t1= new Thread(()-> {
            System.out.println("hello");
        });

        MathOperation sumOperation = ( a, b) -> a + b;
        MathOperation subtractOperation = ( a, b) -> a - b;
        int res = sumOperation.operate(1,2);
        System.out.println(res);

        //Predicate --> Functional interface (Boolean valued function)
        Predicate<Integer> isEven = x->x % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String> isWordStartWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        //System.out.println(isWordStartWithA.test("Ankit"));
        //System.out.println(isWordEndingWithT.test("Ankit"));
        Predicate<String> and = isWordStartWithA.and(isWordEndingWithT);
        System.out.println(and.test("Ankit"));

        //Function--> work for you
        Function<Integer, Integer> doubleIt = x-> 2* x;
        Function<Integer, Integer> tripleIt = x-> 3* x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        System.out.println(doubleIt.apply(100));
        Function<Integer, Integer> identity= Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);

        //Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList= x ->{
            for (int i: x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        //Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        //Combined Exp

        Predicate<Integer> predicate = x -> x % 2 ==0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () ->100;
        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //BiPredicate, BiConsumer, BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y) % 2 ==0;
        System.out.println(isSumEven.test(5,9));

        BiConsumer<Integer, String>  biConsumer = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x,y) -> (x+y).length();
        System.out.println(biFunction.apply("a", "ghjadsj"));


        //UnaryOperator,BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x,y) -> x+y;

        //Method reference--> Used method without invoking & in place of lambda expression.

        List<String> students = Arrays.asList("Sudhir", "Sachin", "Hrishab");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);

        //Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList = names
                .stream()
                .map(MobilePhone::new)
                .collect(Collectors.toList());
    }

}
class MobilePhone{
    private String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
/*
class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("hello");
    }
}*/

/*class SumOperation implements MathOperation{

    @Override
    public int operate(int a, int b) {
        return  a+b;
    }
}*/


interface MathOperation{
    int operate(int a, int b);
}