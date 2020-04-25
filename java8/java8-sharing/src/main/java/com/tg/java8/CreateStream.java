package com.tg.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {
        /*Stream<String> streamFromCollection = createStreamFromCollection();
        streamFromCollection.forEach(System.out::println);

        createStreamFromValue().forEach(System.out::println);*/

//        createStreamFromArrays().forEach(System.out::println);

        /*Stream<String> streamFromFile = createStreamFromFile();
        System.out.println(streamFromFile);*/


//        createStreamFromIterator().forEach(System.out::println);

//        createStreamFromGenerate().forEach(System.out::println);


        createObjStreamFromGenerate().forEach(System.out::println);
    }

    private static Stream<Double> createStreamFromGenerate() {
        return Stream.generate(Math::random).limit(10);
    }

    private static Stream<Integer> createStreamFromIterator() {
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 2).limit(10);
        return iterate;
    }

    private static Stream<String> createStreamFromFile() {
        Path path = Paths.get("D:\\project\\java8\\java8-sharing\\src\\main\\java\\com\\tg\\java8\\CreateStream.java");
        try(Stream<String> streamFromFile = Files.lines(path)) {
            streamFromFile.forEach(System.out::println);
            return streamFromFile;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static Stream<String> createStreamFromCollection() {
        List<String> list = Arrays.asList("hello", "come", "on", "world");

        return list.stream();
    }

    private static Stream<String> createStreamFromValue() {
        return Stream.of("hello", "come", "on", "world");
    }

    private static Stream<String> createStreamFromArrays() {
        String[] strings = {"hello", "come", "on", "world"};
        return Arrays.stream(strings);
    }

    public static Stream<Obj> createObjStreamFromGenerate() {
        return Stream.generate(new ObjSupplier()).limit(10);
    }

    static class ObjSupplier implements Supplier<Obj> {

        private int index = 0;

        private Random random = new Random(System.currentTimeMillis());

        @Override
        public Obj get() {
            index = random.nextInt(100);
            return new Obj(index, "Name -> " + index);
        }
    }


    static class Obj {
        private int id;
        private String name;
        public Obj(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Obj{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
