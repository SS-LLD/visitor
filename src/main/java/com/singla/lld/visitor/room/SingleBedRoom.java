package com.singla.lld.visitor.room;

import com.singla.lld.visitor.opernation.Operations;

public class SingleBedRoom implements Room {
    @Override
    public String accept(Operations operations) {
        return operations.visit(this);
    }
}
