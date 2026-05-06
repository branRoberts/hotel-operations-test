package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    // methodname_ current status of the code in the real class_ what i am expecting from testing this code
    void checkIn_RoomIsNotOccupiedAndClean_RoomIsOccupiedAndDirty()
    {
        // Arrange
        Room room = new Room(2,132.0);

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    void checkOut_() {}

    @Test
    void cleamRoom_(){

    }

}