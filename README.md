# 1708E
Copyright(c) 2017, Yanick Poirier

## Introduction

The goal of this project is to build a small (very small) computer using out-of-the-self basic logic circuitry. I'm not an
Electronic Design Engineer, but a Software Engineer who just happen to love electronic. That implies that this design
is not to be an exact representation of a modern computer/processor design. This will probably look like closer to an early-mid
1970s computer. In other words, this is a learning experience and *my* understanding of how things work inside a computer
that I wish to share.

So, please, bear this in mind if you dare to have a look at this project. Of course, constructive comments, ideas are always
welcome.

*P.S.: English is not my native language, so please forgive my typos and other lexical mistakes* ;) *(Feel free to point them out. 
I'm always open to learning, including non-technical stuff...).*

## Description

I started this project in late May 2017, after watching a series of videos from Ben Eater's serie of videos *Building an 8-bit 
breadboard computer!* on [YouTube](https://www.youtube.com/playlist?list=PLowKtXNTBypGqImE405J2565dvjafglHU) a few weeks back. 
These are great tutorials on how a processor works internally.

I decided, instead of building a simple processor, to build a basic computer using only TTL 7400 logic chips (at least for its
core components). I will be using existing RAM or ROM component for memory, although it is possible to build from logic chips
(which was my initial idea), it will be a bit too costly and it will probably take a lot of board space. Now, creating a program
using dip switches is a really, really, really tedious task. Very, very, very hard to debug. It will drive you crazy! It's hell!
I remember having to debug DOS 3.3 (yes, you read it right!) ASM program with almost no documentation and the original no remembering
what he has done nor why! That's a learning experience, trust me!

So, to avoid driving people crazy (including myself), I decided to write an Assembler compiler that will come along. To increase 
portability, the compiler will be written in Java, although I could have used generic ANSI C, but Java gives everyone the ability 
to use it *out of the box* without the need to have a C compiler installed. A simple JRE would do. Either way, a complete, structured
instruction set will need to be designed.

As you can see, there is plenty of work and to be honnest, I don't know if this project will ever be finished. I really hope so. But 
doing this part time, as a hobby, will take a long shot; but it will sure be fun and mostly: learningful! That is one of the reason 
why I put everything on Github, so that other people can learn about computer internals and if need be: fork it; improve it; make it 
bigger! faster! Another reason is that I learning a lot about electronics from people sharing their knowledge (way too many too list). 
So its may to give back to others...

In case you ever wonder where the name 1708E comes from: 20**17**, 0**8** bits, **E** (fifth alphabet letter as May is fifth month).

## Specifications (and other technical stuff)

#### Hardware
These are the targeted specifications (need to mention: subject to changes?)

* Architecture: RISC (simplier than CISC, implementation wise, IMO).
* Data bus: 8-bit.
* Address bus: 16-bits.
* Instructions size: 16-bits.
* Instruction count: 40~50.
* Clock speed: Don't have a clue yet, but technically, the 74HCT family can be safely used at speed well over to 10MHz (no, I don't 
intend to compete Intel or AMD). Personnaly, I will be very, very happy to reach 1 MHz. Time will tell ;)
* Max memory size: 256 KB using 64KB memory banks.

#### Development tools used
* [Logisim 2.7.1](http://www.cburch.com/logisim/) (for logic simulation). BTW, this is a great logic simulation software. It no longer 
under development but still freely. If you know a better, let me know.
* [Netbeans 8.1](https://netbeans.org/)
* [Oracle JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 7SE for the ASM compiler
* [LibreOffice](http://www.libreoffice.org/) 5 for the documentation

## License
1708E, Copyright (C) 2017 Yanick Poirier

![CC-BY-NC-SA](https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png) 
[Creative Commons Attribution-NonCommercial-ShareAlike V4](https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode)


Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Material"), to deal
in the Material without restriction, including without limitation the rights
to use, copy, modify, merge, publish, and/or distribute copies of the Material,
and to permit persons to whom the Material is furnished to do so, subject to the
terms of the [Creative Common Attribution-NonCommercial-ShareAlike V4](https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode).

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE MATERIAL IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE MATERIAL OR THE USE OR OTHER DEALINGS IN
THE MATERIAL.

