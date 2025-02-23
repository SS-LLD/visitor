package com.singla.lld.visitor.opernation;

import com.singla.lld.visitor.room.DoubleBedRoom;
import com.singla.lld.visitor.room.SingleBedRoom;

public class Maintenance implements Operations{
    @Override
    public String visit(SingleBedRoom singleBedRoom) {
        return "Maintenance of single bed room is in progress";
    }

    @Override
    public String visit(DoubleBedRoom doubleBedRoom) {
        return "Maintenance of double bed room is in progress";
    }
}
