/**
 * Created by Andrew Bell 2/3/2017
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */

package com.recursivechaos.garage.door;

import org.springframework.stereotype.Service;

@Service
public class DoorServiceImpl implements DoorService {

    @Override
    public Door getDoorStatus(long doorNo){
        return new Door(doorNo, "GARAGE", "OPEN");
    }

}
