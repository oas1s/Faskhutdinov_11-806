package com.company;

public class Main {

    public static void main(String[] args) {
	LinkedListWithStream<Integer> newStream = new LinkedListWithStream();
	newStream.add(2);
		newStream.add(20);
		newStream.add(30);
		newStream.add(40);
	newStream.stream().forEach(s -> System.out.println(s));
	newStream.stream().map(s -> ++s).forEach(s -> System.out.println(s));
	newStream.stream().filter(s -> s>10).forEach(s -> System.out.println(s));
    }
}
