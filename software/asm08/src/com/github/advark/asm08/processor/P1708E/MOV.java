/*
 * ASM08 -1708E
 * Copyright 2017 Yanick Poirier <y.poirier.ca at gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Material"), to deal
 * in the Material without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, and/or distribute copies of the Material,
 * and to permit persons to whom the Material is furnished to do so, subject to the
 * terms of the Creative Commons Attribution-NonCommercial-ShareAlike V4.
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE MATERIAL IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE MATERIAL OR THE USE OR OTHER DEALINGS IN
 * THE MATERIAL.
 */
package com.github.advark.asm08.processor.P1708E;

import com.github.advark.asm08.processor.AbstractInstruction;
import com.github.advark.asm08.processor.AbstractProcessor;
import com.github.advark.asm08.processor.Mnemonic;
import java.util.ArrayList;

/**
 *
 * @author Yanick Poirier <ypoirier at hotmail.com>
 */
public class MOV
        extends AbstractInstruction {

    public MOV() {
        // 0010 01dd ddds ssss
        super( new Mnemonic( "MOV", 0x2400, 0xFC ) );

        operands = new ArrayList<>();
    }

    @Override
    public int buildOpcode( Object[] operand ) {
        int opcode = 0;
        int mask;
        int regs;

        if( operand == null || operand.length < 2 ) {
            // Missing operand
        }

        if( operand.length > 2 ) {
            // Too many operand
        }

        if( operand[0] instanceof AbstractProcessor.Register &&
            operand[1] instanceof AbstractProcessor.Register ) {

            Mnemonic m = getMnemonic();
            opcode = m.getOpcode();
            mask = m.getMask();
        }

        return opcode;
    }

    private ArrayList<AbstractInstruction.Operand> operands;
}
