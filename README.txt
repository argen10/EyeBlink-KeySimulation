Blink Eye and Simulate PC Keyboard
Combining OpenCV Eye blink detect code with the simulation of keyboard

USAGE: run the build.sh shell script

Authors: Keshav Sharma & Alizishaan Khatri

Written the Java code and a portion of the C code. A portion of the C code has been borrowed from "github.com/maz/blinking-angel"

The entirety of the C code is licensed under the GPL. The Java code is licensed under the GPL.

Overview
The system uses the implementation of First in first out queue which is constantly updated by the c code when a series of blinks is detected and an alphanumerical digit is processed from the blinks using hexadecimal encoding format. The java part than takes out the first digit in the queue and prints to the desired location which is pointed by the mouse pointer .

Some portion of the C code was written by author Nash. 
The original contents of the file are below. Author: Nash Real Time Eye Tracking and Blink Detection This project implements the algorithm (with small modifications) described in paper:

Real Time Eye Tracking and Blink Detection 
Michael Chau and Margrit Betke http://www.cs.bu.edu/techreports/pdf/2005-012-blink-detection.pdf

Overview This system automatically locate the user's eye by detecting eye blinks. Motion analysis techniques are used in this stage, followed by online creation of the open eye template. The open eye template is used to locate the user's eye in the subsequent frames with template matching. Blink detection is performed using motion analysis techniques.

Since the operation requires extensive amount of computation, the search region is restricted in a small search window around the user's eye. This method will drastically reduces the computation needed thus making the system running smoothly in real time.
