/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.advark.asm08.processor;

/**
 *
 * @author ypoirier
 */
public class Mnemonic {

    public Mnemonic( String instruction,
                     int opcode,
                     int mask ) {
        this.instruction = instruction;
        this.opcode = opcode;
        this.mask = mask;
    }

    public int getOpcode() {
        return opcode;
    }

    public int getMask() {
        return opcode;
    }

    public String getInstruction() {
        return instruction;
    }

    private int opcode;
    private int mask;
    private String instruction;
}
