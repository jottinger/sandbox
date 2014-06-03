package com.redhat.osas.sandbox;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * User: jottinge
 * Date: 6/3/14
 * Time: 8:50 AM
 */
public class JCommanderTest {
    @Parameter
    List<String> texts = new ArrayList<>();

    public static void main(String[] args) {
        JCommanderTest thing = new JCommanderTest();
        new JCommander(thing, args);
        thing.show();
    }

    private void show() {
        System.out.println("Each parameter, on a separate line:");
        texts.stream().forEach(System.out::println);
    }
}
