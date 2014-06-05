package com.redhat.osas.sandbox;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class ContainsTest {
    @Test
    public void testContains() {
        List<Long> l=new ArrayList<>();
        l.add(0l);
        assertTrue(l.contains(0l));
    }
}
