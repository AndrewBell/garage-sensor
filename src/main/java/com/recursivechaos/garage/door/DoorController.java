/**
 * Created by Andrew Bell 2/3/2017
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */

package com.recursivechaos.garage.door;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoorController {

    @Autowired
    DoorService doorService;

    @RequestMapping("/api/v1/door/{doorNo}")
    public Door getStatus(@PathVariable long doorNo) {
        return new Door(doorNo, "GARAGE", "OPEN");
    }

}
