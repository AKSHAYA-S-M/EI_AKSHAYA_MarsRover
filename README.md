# EI_AKSHAYA_MarsRover

**Mars Rover Programming Exercise**

Description

This project simulates a Mars Rover navigating a grid-based terrain. The rover can move forward, turn left, and turn right while avoiding obstacles and staying within the grid boundaries. The exercise is designed to demonstrate the use of Object-Oriented Programming principles and design patterns in Java.

**Functional Requirements**

**Initialization:**

Initialize the Rover with a starting position (x, y) and direction (N, S, E, W).

**Commands:**

**Implement commands for the Rover:**

M: Move one step forward in the direction the Rover is facing.

L: Turn left.

R: Turn right.

**Obstacle Detection:**

If an obstacle is detected in the path, the Rover should not move.

**Status Report (Optional):**

The Rover can send a status report containing its current position and facing direction.

Design Patterns Used

Command Pattern:
Encapsulates M, L, and R commands as objects for flexibility and extensibility.

Composite Pattern:
Represents the grid and obstacles for easier management and traversal.

Object-Oriented Principles

Encapsulation:
Each class has clear responsibilities and hides its internal state.

Inheritance and Polymorphism:
Use of interfaces and abstract classes to define common behaviors and extend functionality.
