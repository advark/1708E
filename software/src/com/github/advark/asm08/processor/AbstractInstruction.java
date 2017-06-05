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
abstract public class AbstractInstruction {

    public AbstractInstruction( Mnemonic mnemonic ) {
        this.mnemonic = mnemonic;
    }

    abstract public int buildOpcode( Object[] parameters );

    public Mnemonic getMnemonic() {
        return mnemonic;
    }

    private final Mnemonic mnemonic;

    static public enum Parameter {
        RegisterParameter,
        LiteralParameter
    };

}
