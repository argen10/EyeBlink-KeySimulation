Blink Eye and Simulate PC Keyboard
Combining OpenCV Eye blink detect code with the simulation of keyboard

USAGE: run the build.sh shell script

Authors: Keshav Sharma & Alizishaan Khatri

Written the Java code and a portion of the C code. A portion of the C code has been borrowed from "github.com/maz/blinking-angel"

The entirety of the C code is licensed under the GPL. The Java code is licensed under the GPL.

Overview
The system uses the implementation of First in first out queue which is constantly updated by the c code when a series of blinks is detected and an alphanumerical digit is processed from the blinks using hexadecimal encoding format. The java part than takes out the first digit in the queue and prints to the desired location which is pointed by the mouse pointer .

A portion of the C code was written by author Nash(me@nashruddin.com.).

Real Time Eye Tracking and Blink Detection 
==========================================

Author: Nash Real Time Eye Tracking and Blink Detection 

This project implements the algorithm (with small modifications) described in paper:

Michael Chau and Margrit Betke http://www.cs.bu.edu/techreports/pdf/2005-012-blink-detection.pdf

Overview This system automatically locate the user's eye by detecting eye blinks. Motion analysis techniques are used in this stage, followed by online creation of the open eye template. The open eye template is used to locate the user's eye in the subsequent frames with template matching. Blink detection is performed using motion analysis techniques.

Since the operation requires extensive amount of computation, the search region is restricted in a small search window around the user's eye. This method will drastically reduces the computation needed thus making the system running smoothly in real time.USAGE: run the blink binary

Requirement
===========

This package requires the OpenCV library, freely available at:
http://sourceforge.net/projects/opencvlibrary

Compiling
=========

Compile as usual. See the OpenCV wiki (http://opencv.willowgarage.com) for info on how
to use various IDE with OpenCV.

Usage
=====
1. Run the program.
2. Blink your eyes. You will see 2 rectangles. The green rectangle labels
   the object being tracked (your eye) and the red rectangle is the search window.
3. If you blink, the program will display the text 'blink!' in the window.
4. The tool is set to record binary 1 for atleast a single eye Blink within 30 frames of video captured.
5. The console will output a single alphanumerical value after 4 * 30 frames.
6. Point the location of mouse pointer over any application in the pc which can take input.
7. You can see the desired output formed by the binary input in hexadecimal converted format.
8. Press 'r' to repeat eye detection.
9. Press 'q' to quit.
