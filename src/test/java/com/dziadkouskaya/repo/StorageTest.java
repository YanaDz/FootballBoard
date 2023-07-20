package com.dziadkouskaya.repo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    private Storage storage;

    @BeforeEach
    void setUp() {
        storage = Storage.getInstance();
    }

    @Test
    void testGetInstance() {
        Storage instance1 = Storage.getInstance();
        Storage instance2 = Storage.getInstance();

        assertSame(instance1, instance2);
    }
}