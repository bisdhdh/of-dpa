// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.projectfloodlight.openflow.protocol.OFFlowModFlags;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFFlowModFlagsSerializerVer10 {

    public final static short SEND_FLOW_REM_VAL = (short) 0x1;
    public final static short CHECK_OVERLAP_VAL = (short) 0x2;
    public final static short EMERG_VAL = (short) 0x4;

    public static Set<OFFlowModFlags> readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, Set<OFFlowModFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFFlowModFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFFlowModFlags> ofWireValue(short val) {
        EnumSet<OFFlowModFlags> set = EnumSet.noneOf(OFFlowModFlags.class);

        if((val & SEND_FLOW_REM_VAL) != 0)
            set.add(OFFlowModFlags.SEND_FLOW_REM);
        if((val & CHECK_OVERLAP_VAL) != 0)
            set.add(OFFlowModFlags.CHECK_OVERLAP);
        if((val & EMERG_VAL) != 0)
            set.add(OFFlowModFlags.EMERG);
        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFFlowModFlags> set) {
        short wireValue = 0;

        for(OFFlowModFlags e: set) {
            switch(e) {
                case SEND_FLOW_REM:
                    wireValue |= SEND_FLOW_REM_VAL;
                    break;
                case CHECK_OVERLAP:
                    wireValue |= CHECK_OVERLAP_VAL;
                    break;
                case EMERG:
                    wireValue |= EMERG_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFFlowModFlags in version 1.0: " + e);
            }
        }
        return wireValue;
    }

}