# visitor

This pattern is ideal when you need to add new functionality to objects without modifying their structure. It's particularly useful in scenarios where the object structure is stable, but new operations are frequently needed.
1. This design pattern is to solve Open/Close principle and single responsibility principle.
2. This design pattern uses double dispatch.

Original Problem:
Hotel Management : Multiple room and multi operations
we have one interface "room" and multiple type of room extending it

1. If need to add one new method/operations for a room than it violate open/closed principle.
2. If new operations we need to test whole room other operation

Benefit:
If new operations added than no need to test existing operation for existing rooms.



