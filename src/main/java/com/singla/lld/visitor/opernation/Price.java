package com.singla.lld.visitor.opernation;

import com.singla.lld.visitor.room.DoubleBedRoom;
import com.singla.lld.visitor.room.SingleBedRoom;

public class Price implements Operations{

    @Override
    public String visit(SingleBedRoom singleBedRoom) {
        return "100";
    }

    @Override
    public String visit(DoubleBedRoom doubleBedRoom) {
        return "180";
    }
}
