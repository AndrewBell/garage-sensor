package com.recursivechaos.garage.door;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Andrew Bell 2/3/2017
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoorControllerTest {

    @Test
    public void testGetStatusWhenDoorIsOpen() throws Exception {
        DoorController doorCtrl = new DoorController();
        Door testDoor = new Door(1,"GARAGE","OPEN");

        Door foundDoor = doorCtrl.getStatus(1);
        assertEquals("Should return the correct door, and an OPEN status", testDoor,foundDoor);
    }

    // TODO: Mock Test
    @Test
    @Ignore
    public void testGetStatusWhenDoorIsClosed() throws Exception {
        DoorController doorCtrl = new DoorController();
        Door testDoor = new Door(1,"GARAGE","CLOSED");

        Door foundDoor = doorCtrl.getStatus(1);
        assertEquals("Should return the correct door, and a CLOSED status", testDoor,foundDoor);
    }

}