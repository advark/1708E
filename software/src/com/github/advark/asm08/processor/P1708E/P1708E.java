/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.advark.asm08.processor.P1708E;

import com.github.advark.asm08.processor.AbstractProcessor;
import java.util.ArrayList;

/**
 *
 * @author ypoirier
 */
public class P1708E
        extends AbstractProcessor {

    public P1708E() {
        super( "1708E", 8, 16 );

        init();
    }

    private void init() {
        // Byte register operations
        addInstruction( new MOV() );
        addInstruction( new MOVIR() );
        addInstruction( new MOVRI() );
        addInstruction( new NOT() );
        addInstruction( new RTC() );
        addInstruction( new RTCB() );
        addInstruction( new ASR() );
        addInstruction( new RTC() );
        addInstruction( new RLC() );
        addInstruction( new RRC() );
        addInstruction( new ROL() );
        addInstruction( new ROR() );
        addInstruction( new LSL() );
        addInstruction( new LSR() );
        addInstruction( new INC() );
        addInstruction( new DEC() );
        addInstruction( new INCC() );
        addInstruction( new DECC() );
        addInstruction( new POP() );
        addInstruction( new PUSH() );
        addInstruction( new SWAP() );
        addInstruction( new ADD() );
        addInstruction( new ADDC() );
        addInstruction( new SUB() );
        addInstruction( new AND() );
        addInstruction( new OR() );
        addInstruction( new XOR() );

        // Literal operations
        addInstruction( new ADDB() );
        addInstruction( new ADDBC() );
        addInstruction( new SUBB() );
        addInstruction( new MOVB() );
        addInstruction( new ANDB() );
        addInstruction( new ORB() );
        addInstruction( new XORB() );

        // Inherent operations
        addInstruction( new NOP() );
        addInstruction( new CLI() );
        addInstruction( new STI() );
        addInstruction( new RESET() );
        addInstruction( new PUSH() );
        addInstruction( new POP() );

        // Control operations
        addInstruction( new RET() );
        addInstruction( new IRET() );
        addInstruction( new BTSS() );
        addInstruction( new BTSC() );

        // Working registers
        addRegister( new AbstractProcessor.Register( "R0", 8, 0x00 ) );
        addRegister( new AbstractProcessor.Register( "R1", 8, 0x01 ) );
        addRegister( new AbstractProcessor.Register( "R2", 8, 0x02 ) );
        addRegister( new AbstractProcessor.Register( "R3", 8, 0x03 ) );
        addRegister( new AbstractProcessor.Register( "R4", 8, 0x04 ) );
        addRegister( new AbstractProcessor.Register( "R5", 8, 0x05 ) );
        addRegister( new AbstractProcessor.Register( "R6", 8, 0x06 ) );
        addRegister( new AbstractProcessor.Register( "R7", 8, 0x07 ) );

        // System registers
        addRegister( new AbstractProcessor.Register( "ADDR0H", 8, 0x10 ) );
        addRegister( new AbstractProcessor.Register( "ADDR0L", 8, 0x11 ) );
        addRegister( new AbstractProcessor.Register( "ADDR1H", 8, 0x12 ) );
        addRegister( new AbstractProcessor.Register( "ADDR1L", 8, 0x13 ) );
        addRegister( new AbstractProcessor.Register( "IPH", 8, 0x14 ) );
        addRegister( new AbstractProcessor.Register( "IPL", 8, 0x15 ) );
        addRegister( new AbstractProcessor.Register( "SP", 8, 0x16 ) );
        addRegister( new AbstractProcessor.Register( "SR", 8, 0x17 ) );
    }

    ArrayList<AbstractProcessor.Register> regs;
}
