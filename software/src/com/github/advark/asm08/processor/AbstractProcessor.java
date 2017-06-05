/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.advark.asm08.processor;

import java.util.ArrayList;

/**
 *
 * @author ypoirier
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
