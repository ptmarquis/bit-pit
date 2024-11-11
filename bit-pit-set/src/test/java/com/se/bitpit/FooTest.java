/*
 Copyright (c) 2024 Schneider Electric, All Rights Reserved
*/
package com.se.bitpit;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class FooTest {
    private static final String VALUE = "value";

    @Test
    public void testFoo() {

        // Create a Set of foo's
        final Set<Foo> fooSet = new HashSet<>();

        // Add a value
        final Foo foo1 = new Foo();
        foo1.setBar(VALUE);
        fooSet.add(foo1);

        // Add the value again
        final Foo foo2 = new Foo();
        foo2.setBar(VALUE);
        fooSet.add(foo2);

        // Should only be added once
        assertThat(fooSet).hasSize(1);
    }
}
