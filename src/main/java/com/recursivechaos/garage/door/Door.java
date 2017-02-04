/**
 * Created by Andrew Bell 2/3/2017
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */

package com.recursivechaos.garage.door;

import lombok.Data;

@Data
public class Door {

    private final long id;
    private final String name;
    private final String status;

    public Door(long id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

}
