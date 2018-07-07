# cspc6138-assignment3-timer-and-threads

For this assignment, your Android program is required to implement three activities: 

1. An Activity that serves as main menu; 
2. The Calculator you implemented for Assignment # 2; 
3. A Timer. The interface for your timer should look as shown below: (not pictured)
 
## Requirements: 

* The Main Menu activity should make use of Intents to switch/select between the two other Activities (Calculator, Timer)
* The Timer is a countdown timer. When it gets to 0, it should present a Toast message (the message is up to you). You can also look how to make the device to vibrate (optional). The buttons at the top should help you to change the amount of time to countdown. The rightmost is seconds, the middle is minutes, and the other is hours.
* As the timer starts, it should update the values accordingly in the interface (e.g., after one second, the interface here should show 13 in the middle and 59 on the right.
* When the user hits pause, the timer should stop and keep the current time. At that point the user can change the values of the timer, hit start and it should continue to execute.
* At this point don’t worry if the timer stops working if the user closes the timer screen. The goal with this project is to practice the update of UI from threads/AsynchTasks/Handlers, etc...

## Rubric:

Implementing the Timer : 80%  
Implementing the rest of the project: 20%
