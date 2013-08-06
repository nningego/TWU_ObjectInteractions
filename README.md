introduction to topic
=====================

Start with a discussion around object interactions
  * what are different types of interactions, i.e.
    - delegation
    - collaborations
    - inheritance
  * what are examples for these types?
  
  
introduction to domain
======================

We want to model a football match. Put index with the desired components on the side of a whiteboard.
 * Football Game
 * Reporter
 * Spectator
 * Fan
 * Score Board
 * Grumpy Fan

## First Step - a reporter watches a football match

Start with "Football Game" and "Reporter". Have a discussion around the design.
 * What are the important events in a game --> Goal Team A, Goal Team B
 * What does a reporter do? --> Scream "Goooooal Team X"
 * Does the reporter ask if there is a goal?
 * Or should the game tell the reporter?
 * Hollywood Principle: Don't call us - we call you.
 * How does the game now about the reporter?
 * Who puts the reporter into the game
 
Let them start working on this in pairs. Stop after 5 minutes and discuss.
 * What are the classes. What methods do they have. Return types? Parameters?
 * We want the reporter to actually DO stuff not just return messages -> system out and return void
 * How do we test these classes? [just return strings for now]

hack... hack... hack...
 
 
## Second Step - bring in some fans

Introduce a fan and have a short design discussion.
 * A fan says "Yay" when he teams score, says "Boo" when the other team scores
 * How do we test that?
 * Both reporter and fan react on goals
 * Introduce a spectator interface
 * what refactoring is needed?
 
hack... hack... hack...

Let one pair present a good solution.


## Third step - score board and a grumpy fan

Introduce the remaining components and have a short design discussion
 * A score board keep track of the goals
 * every time a goal happen it will print out the current score
 * You can ask the score board for the current score at any time
 * A grumpy fan says "meh!" when his and the other team scores
 * Can we inherit from the normal fan?
 
hack... hack... hack...


## Recap

Show and discuss good solutions / good tests.

Have a look at the resulting design
  * what design pattern is this?
  * what are the advantages
    - we can test each component and behaviour separately 
    - adding a new component is very easy and only loosely coupled
    - future changes only have to be made in place

 

 
