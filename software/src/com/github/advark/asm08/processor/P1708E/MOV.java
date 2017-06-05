package com.github.advark.asm08.processor.P1708E;

import com.github.advark.asm08.processor.AbstractInstruction;
import com.github.advark.asm08.processor.AbstractProcessor;
import com.github.advark.asm08.processor.Mnemonic;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ypoirier
 */
public class MOV
        extends AbstractInstruction {

    public MOV() {
        // 0010 01dd ddds ssss
        super( new Mnemonic( "MOV", 0x2400, 0xFC ) );

        parameters = new ArrayList<>();
    }

    @Override
    public int buildOpcode( Object[] params ) {
        int opcode = 0;
        int mask;
        int regs;

        if( params == null || params.length < 2 ) {
            // Missing parameters
        }

        if( params.length > 2 ) {
            // Too many of parameters
        }

        if( params[0] instanceof AbstractProcessor.Register &&
            params[1] instanceof AbstractProcessor.Register ) {

            Mnemonic m = getMnemonic();
            opcode = m.getOpcode();
            mask = m.getMask();
        }

        return opcode;
    }

    private ArrayList<AbstractInstruction.Parameter> parameters;
}
