package com.singla.lld.visitor.opernation;

import com.singla.lld.visitor.room.DoubleBedRoom;
import com.singla.lld.visitor.room.SingleBedRoom;

public interface Operations {

    String visit(SingleBedRoom singleBedRoom);
    String visit(DoubleBedRoom doubleBedRoom);
}
