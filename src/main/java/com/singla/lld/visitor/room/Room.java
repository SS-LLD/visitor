package com.singla.lld.visitor.room;

import com.singla.lld.visitor.opernation.Operations;

public interface Room {

    String accept(Operations operations);
}
