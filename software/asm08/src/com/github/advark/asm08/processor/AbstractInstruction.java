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

/**
 *
 * @author Yanick Poirier <ypoirier at hotmail.com>
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

    static public enum Operand {
        RegisterOperand,
        LiteralOperand
    };

}
