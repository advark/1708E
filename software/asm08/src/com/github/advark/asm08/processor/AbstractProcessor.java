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
package com.github.advark.asm08.processor;

import java.util.ArrayList;

/**
 *
 * @author Yanick Poirier <ypoirier at hotmail.com>
 */
abstract public class AbstractProcessor {

    public AbstractProcessor( String name,
                              int dataSize,
                              int instructionSize ) {
        this.name = name;
        this.dataSize = dataSize;
        this.instructionSize = instructionSize;
        instructions = new ArrayList<>();
        registers = new ArrayList<>();
    }

    public int getDataSize() {
        return dataSize;
    }

    public int getInstructionSize() {
        return instructionSize;
    }

    public String getName() {
        return name;
    }

    public boolean addInstruction( AbstractInstruction instruction ) {
        boolean rc = true;
        AbstractInstruction instr = getInstruction( instruction.getMnemonic() );

        if( instr == null ) {
            instructions.add( instruction );
            rc = true;
        }

        return rc;
    }

    public AbstractInstruction getInstruction( Mnemonic instruction ) {
        AbstractInstruction rc = null;
        String instr = instruction.getInstruction();

        for( AbstractInstruction i : instructions ) {
            Mnemonic m = i.getMnemonic();
            if( instr.compareToIgnoreCase( m.getInstruction() ) == 0 ) {
                break;
            }
        }

        return rc;
    }

    public boolean addRegister( Register reg ) {
        boolean rc = true;
        Register r = getRegister( reg.getName() );

        if( r == null ) {
            registers.add( reg );
            rc = true;
        }

        return rc;
    }

    public Register getRegister( String reg ) {
        Register rc = null;

        for( Register r : registers ) {
            if( reg.compareToIgnoreCase( r.getName() ) == 0 ) {
                break;
            }
        }

        return rc;
    }

    private final String name;
    private final int dataSize;
    private final int instructionSize;
    private final ArrayList<AbstractInstruction> instructions;
    private final ArrayList<Register> registers;

    /**
     *
     */
    static public class Register {

        public Register( String name,
                         int size,
                         int address ) {
            this.name = name;
            this.size = size;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public int getAddress() {
            return address;
        }

        /** Name of the register */
        private String name;
        /** Number of bits in the registers (including unused ones) */
        private int size;
        /** Address, number or code that identifies this register at the opcode level */
        private int address;
    }
}
